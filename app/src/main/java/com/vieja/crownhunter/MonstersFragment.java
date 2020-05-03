package com.vieja.crownhunter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonstersFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monsters, null);

        ArrayList<MonsterCard> monsterCardsList = new ArrayList<>();
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos,"Rathalos"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos_white,"Rathalos White"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos,"Rathalos"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos_white,"Rathalos White"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos,"Rathalos"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos_white,"Rathalos White"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos,"Rathalos"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos_white,"Rathalos White"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos,"Rathalos"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos_white,"Rathalos White"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos,"Rathalos"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos_white,"Rathalos White"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos,"Rathalos"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos_white,"Rathalos White"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos,"Rathalos"));
        monsterCardsList.add(new MonsterCard(R.drawable.m_rathalos_white,"Rathalos White"));
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new MonsterListAdapter(monsterCardsList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
