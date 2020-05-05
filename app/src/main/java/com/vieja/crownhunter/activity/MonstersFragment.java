package com.vieja.crownhunter.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SharedMemory;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.vieja.crownhunter.Achievement;
import com.vieja.crownhunter.FileIO;
import com.vieja.crownhunter.MonsterCard;
import com.vieja.crownhunter.MonsterDatabase;
import com.vieja.crownhunter.MonsterInfo;
import com.vieja.crownhunter.MonsterListAdapter;
import com.vieja.crownhunter.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MonstersFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    SharedPreferences prefs;
    ArrayList<MonsterCard> monsterCardsList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_monsters, null);

        prefs = PreferenceManager.getDefaultSharedPreferences(getContext());
        populateMonsterCardsList();

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new MonsterListAdapter(monsterCardsList, getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        final Switch hide = view.findViewById(R.id.hide);
        hide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int i = 0;
                if (hide.isChecked()) {
                    for (MonsterCard m : monsterCardsList) {
                        if (m.isMiniature() && m.isGiant()){
                            MonsterListAdapter.hiddenMonsterCardsList.add(m);
                            adapter.notifyItemRemoved(m.getPosition()-i);
                            i++;
                        }
                    }
                    monsterCardsList.removeAll(MonsterListAdapter.hiddenMonsterCardsList);
                } else {
                    for (MonsterCard m : MonsterListAdapter.hiddenMonsterCardsList) {
                        monsterCardsList.add(m.getPosition(),m);
                        adapter.notifyItemInserted(m.getPosition());
                    }
                    MonsterListAdapter.hiddenMonsterCardsList.clear();
                }
            }
        });

        boolean hide_finished = prefs.getBoolean("switch_hide_finished",false);
        if (hide_finished) {
            hide.setChecked(true);
            hide.callOnClick();
        }

        return view;
    }

    public void populateMonsterCardsList() {
        MonsterListAdapter.hiddenMonsterCardsList.clear();
        MonsterListAdapter.filteredMonsterCardsList.clear();

        boolean hide_iceborne = prefs.getBoolean("hide_iceborne",false);
        boolean hide_optional = prefs.getBoolean("hide_optional",false);

        StringBuilder sb = FileIO.load(getContext());
        if (sb.toString().equals("NO_FILE")) {
            StringBuilder save = new StringBuilder();
            for (MonsterInfo monster : MonsterDatabase.list){
                save.append(monster.getPosition()).append(";").append(monster.getName()).append(";").append("no;no;\n");
                if ( !hide_iceborne || (hide_iceborne && ( monster.getType() == Achievement.WORLD || monster.getType() == Achievement.WORLD_ADD ) ) ) {
                    if (!hide_optional || (hide_optional && hide_iceborne && monster.getType() != Achievement.WORLD_ADD) || (hide_optional && !hide_iceborne && monster.getType() != Achievement.ICEBORNE_ADD)) {
                        monsterCardsList.add(new MonsterCard(monster.getMonsterIcon(), monster.getName(), false, false, monster.getPosition()));
                    } else MonsterListAdapter.filteredMonsterCardsList.add(new MonsterCard(monster.getMonsterIcon(), monster.getName(), false, false, monster.getPosition()));
                } else MonsterListAdapter.filteredMonsterCardsList.add(new MonsterCard(monster.getMonsterIcon(), monster.getName(), false, false, monster.getPosition()));
            }
            FileIO.save(getContext(),save);
        } else {
            String[] lines = sb.toString().split("\n");
            for (String line: lines){
                String[] info = line.split(";");
                int icon = MonsterDatabase.getMonsterIcon(info[1]);
                Achievement type = MonsterDatabase.getMonsterType(info[1]);
                if ( !hide_iceborne || (hide_iceborne && ( type == Achievement.WORLD || type == Achievement.WORLD_ADD ) ) ) {
                    if (!hide_optional || (hide_optional && hide_iceborne && type != Achievement.WORLD_ADD) || (hide_optional && !hide_iceborne && type != Achievement.ICEBORNE_ADD)) {
                        monsterCardsList.add(new MonsterCard(icon, info[1], (info[2].equals("yes")), (info[3].equals("yes")), Integer.parseInt(info[0])));
                    } else MonsterListAdapter.filteredMonsterCardsList.add(new MonsterCard(icon, info[1], (info[2].equals("yes")), (info[3].equals("yes")), Integer.parseInt(info[0])));
                } else MonsterListAdapter.filteredMonsterCardsList.add(new MonsterCard(icon, info[1], (info[2].equals("yes")), (info[3].equals("yes")), Integer.parseInt(info[0])));
            }
        }
    }
}
