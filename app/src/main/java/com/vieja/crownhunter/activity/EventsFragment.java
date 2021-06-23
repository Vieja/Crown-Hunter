package com.vieja.crownhunter.activity;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vieja.crownhunter.Achievement;
import com.vieja.crownhunter.CrownInfo;
import com.vieja.crownhunter.EventDatabase;
import com.vieja.crownhunter.EventInfo;
import com.vieja.crownhunter.EventListAdapter;
import com.vieja.crownhunter.FileIO;
import com.vieja.crownhunter.MonsterCard;
import com.vieja.crownhunter.MonsterDatabase;
import com.vieja.crownhunter.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EventsFragment extends Fragment {

    private RecyclerView.Adapter adapter;

    private SharedPreferences prefs;
    private final ArrayList<EventCard> eventCardsList = new ArrayList<>();
    private final ArrayList<MonsterCard> monsterCardsList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_events, null);

        prefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        populateEventCardList();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        adapter = new EventListAdapter(eventCardsList, getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }

    public void populateEventCardList() {
        boolean hide_iceborne = prefs.getBoolean("hide_iceborne", false);
        boolean hide_optional = prefs.getBoolean("hide_optional", false);

        Resources resources = getContext().getResources();

        StringBuilder sb = FileIO.load(getContext());
        String[] lines = sb.toString().split("\n");
        for (String line : lines) {
            String[] info = line.split(";");
            int icon = MonsterDatabase.getMonsterIcon(Integer.parseInt(info[0]));
            Achievement type = MonsterDatabase.getMonsterType(Integer.parseInt(info[0]));

            int monsterNameRes = MonsterDatabase.getMonsterNameRes(Integer.parseInt(info[0]));
            String monsterName = resources.getString(monsterNameRes);
            monsterCardsList.add(new MonsterCard(icon, monsterName, (info[1].equals("yes")), (info[2].equals("yes")), Integer.parseInt(info[0])));
        }

        for (EventInfo info: EventDatabase.list){
            ArrayList<Integer> monsters = info.getFiveMostersRes();
            int chance = getOverallChanceForCrown(info.getCrownChances());
            if (chance>0) {

                if (!hide_iceborne || !info.isIceborne()) {
                    if (!hide_optional || !info.isOptional())
                        eventCardsList.add(new EventCard(resources.getString(info.getNameRes()), chance, monsters.get(0), monsters.get(1), monsters.get(2), monsters.get(3), monsters.get(4)));
                }
            }
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
}
