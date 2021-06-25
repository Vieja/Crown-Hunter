package com.vieja.crownhunter.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import com.vieja.crownhunter.Achievement;
import com.vieja.crownhunter.CrownInfo;
import com.vieja.crownhunter.EventDatabase;
import com.vieja.crownhunter.EventInfo;
import com.vieja.crownhunter.FileIO;
import com.vieja.crownhunter.MonsterCard;
import com.vieja.crownhunter.MonsterDatabase;
import com.vieja.crownhunter.MonsterInfo;
import com.vieja.crownhunter.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class HomeFragment extends Fragment {

    private SharedPreferences prefs;
    private final ArrayList<EventCard> eventCardsList = new ArrayList<>();
    private final ArrayList<MonsterCard> monsterCardsList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_home, null);

        prefs = PreferenceManager.getDefaultSharedPreferences(getContext());

        int mini = 0;
        int giant = 0;
        int mini_ice = 0;
        int giant_ice = 0;
        StringBuilder sb = FileIO.load(getContext());
        if (sb.toString().equals("NO_FILE")) {
            StringBuilder save = new StringBuilder();
            for (MonsterInfo monster : MonsterDatabase.list)
                save.append(monster.getPosition()).append(";").append("no;no;\n");
            FileIO.save(getContext(), save);
            sb = FileIO.load(getContext());
        }

        String[] lines = sb.toString().split("\n");
        for (String line : lines) {
            String[] info = line.split(";");
            Achievement type = MonsterDatabase.getMonsterType(Integer.parseInt(info[0]));
            switch (type) {
                case WORLD:
                    mini += (info[1].equals("no") ? 1 : 0);
                    giant += (info[2].equals("no") ? 1 : 0);
                    break;
                case ICEBORNE:
                case WORLD_ADD:
                    mini_ice += (info[1].equals("no") ? 1 : 0);
                    giant_ice += (info[2].equals("no") ? 1 : 0);
                    break;
            }
        }

        TextView mini_1 = view.findViewById(R.id.text_mini);
        mini_1.setText(String.valueOf(mini));
        TextView giant_1 = view.findViewById(R.id.text_giant);
        giant_1.setText(String.valueOf(giant));
        TextView ice_mini_1 = view.findViewById(R.id.text_mini_ice);
        ice_mini_1.setText(String.valueOf(mini_ice));
        TextView ice_giant_1 = view.findViewById(R.id.text_giant_ice);
        ice_giant_1.setText(String.valueOf(giant_ice));

        populateEventCardList();
        EventCard event = eventCardsList.get(0);
        TextView name = view.findViewById(R.id.name);
        ImageView img1 = view.findViewById(R.id.monster_icon1);
        ImageView img2 = view.findViewById(R.id.monster_icon2);
        ImageView img3 = view.findViewById(R.id.monster_icon3);
        ImageView img4 = view.findViewById(R.id.monster_icon4);
        ImageView img5 = view.findViewById(R.id.monster_icon5);
        TextView chances = view.findViewById(R.id.chances);
        name.setText(event.getName());
        img1.setImageResource(event.getMonsterIcon1());
        if (event.getMonsterIcon2() != 0) img2.setImageResource(event.getMonsterIcon2());
        if (event.getMonsterIcon3() != 0) img3.setImageResource(event.getMonsterIcon3());
        if (event.getMonsterIcon4() != 0) img4.setImageResource(event.getMonsterIcon4());
        if (event.getMonsterIcon5() != 0) img5.setImageResource(event.getMonsterIcon5());
        chances.setText(getContext().getResources().getString(R.string.chances)+' '+event.getChances()+'%');

        return view;

    }

    public void populateEventCardList() {
        boolean hide_iceborne = prefs.getBoolean("hide_iceborne", false);
        boolean hide_optional = prefs.getBoolean("hide_optional", false);

        Resources resources;
        if (prefs.getBoolean("names_english", false)) {
            resources = getLocalizedResources(getContext(), new Locale("en"));
        } else resources = getContext().getResources();

        StringBuilder sb = FileIO.load(getContext());
        String[] lines = sb.toString().split("\n");
        for (String line : lines) {
            String[] info = line.split(";");
            int icon = MonsterDatabase.getMonsterIcon(Integer.parseInt(info[0]));
            Achievement type = MonsterDatabase.getMonsterType(Integer.parseInt(info[0]));

            int monsterNameRes = MonsterDatabase.getMonsterNameRes(Integer.parseInt(info[0]));
            String monsterName = resources.getString(monsterNameRes);
            if (!hide_iceborne || (hide_iceborne && (type == Achievement.WORLD || type == Achievement.WORLD_ADD))) {
                if (!hide_optional || (hide_optional && hide_iceborne && type != Achievement.WORLD_ADD) || (hide_optional && !hide_iceborne && type != Achievement.ICEBORNE_ADD))
                    monsterCardsList.add(new MonsterCard(icon, monsterName, (info[1].equals("yes")), (info[2].equals("yes")), Integer.parseInt(info[0])));
            }
        }


        for (EventInfo info: EventDatabase.list){
            ArrayList<Integer> monsters = info.getFiveMostersRes();
            int chance = getOverallChanceForCrown(info.getCrownChances());
            if (chance>0) eventCardsList.add(new EventCard(resources.getString(info.getNameRes()), chance, info.getStars(), monsters.get(0), monsters.get(1), monsters.get(2), monsters.get(3), monsters.get(4)));
        }
        Collections.sort(eventCardsList);
    }

    private int getOverallChanceForCrown(ArrayList<CrownInfo> crownChances) {
        int sum = 0;
        for (CrownInfo info: crownChances) {
            sum += getChanceForThatMonster(info);
        }
        return Math.min(sum, 100);
    }

    private int getChanceForThatMonster(CrownInfo info) {
        boolean isDone;

        for(MonsterCard card: monsterCardsList) {
            if (card.getMonsterIcon() == info.getMonster()) {
                isDone = info.isGiant() ? card.isGiant():card.isMiniature();
                return isDone ? 0 : info.getChance();
            }
        }
        return 0;
    }

    @NonNull
    private Resources getLocalizedResources(Context context, Locale desiredLocale) {
        Configuration conf = context.getResources().getConfiguration();
        conf = new Configuration(conf);
        conf.setLocale(desiredLocale);
        Context localizedContext = context.createConfigurationContext(conf);
        return localizedContext.getResources();
    }
}
