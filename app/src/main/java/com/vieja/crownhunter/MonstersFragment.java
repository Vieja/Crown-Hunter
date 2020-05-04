package com.vieja.crownhunter;

import android.os.Bundle;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonstersFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<MonsterCard> monsterCardsList = new ArrayList<>();



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monsters, null);

        populateMonsterCardsList();
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new MonsterListAdapter(monsterCardsList, getContext());
        recyclerView.addItemDecoration(new VerticalSpaceItemDecoration(20));


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        Switch hide = view.findViewById(R.id.hide);
        hide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                monsterCardsList.get(0).setMiniature(true);
                adapter.notifyDataSetChanged();
            }
        });

        return view;
    }

    public void populateMonsterCardsList() {
        StringBuilder sb = FileIO.load(getContext());
        if (sb.toString().equals("NO_FILE")) {
            StringBuilder save = new StringBuilder();
            for (MonsterInfo monster : MonsterDatabase.list){
                save.append(monster.getName()+";").append("no;no;\n");
                monsterCardsList.add(new MonsterCard(monster.getMonsterIcon(), monster.getName(),false,false));
            }
            FileIO.save(getContext(),save);
        } else {
            String[] lines = sb.toString().split("\n");
            for (String line: lines){
                String[] info = line.split(";");
                int icon = MonsterDatabase.getMonsterIcon(info[0]);
                if (icon!= -1) {
                    monsterCardsList.add(new MonsterCard(icon, info[0], (info[1].equals("yes")), (info[2].equals("yes"))));
                }
            }
        }
    }
}
