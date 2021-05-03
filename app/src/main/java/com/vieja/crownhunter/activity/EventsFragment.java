package com.vieja.crownhunter.activity;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.vieja.crownhunter.CrownInfo;
import com.vieja.crownhunter.EventDatabase;
import com.vieja.crownhunter.EventInfo;
import com.vieja.crownhunter.EventListAdapter;
import com.vieja.crownhunter.MonsterCard;
import com.vieja.crownhunter.R;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    private RecyclerView.Adapter adapter;

    private SharedPreferences prefs;
    private final ArrayList<EventCard> eventCardsList = new ArrayList<>();



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_events, null);

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
        EventListAdapter.hiddenEventCardsList.clear();
        EventListAdapter.filteredEventCardsList.clear();

//        boolean hide_iceborne = prefs.getBoolean("hide_iceborne", false);
//        boolean hide_optional = prefs.getBoolean("hide_optional", false);

        Resources resources = getContext().getResources();

        for (EventInfo info: EventDatabase.list){
            ArrayList<Integer> monsters = info.getFiveMostersRes();
            eventCardsList.add(new EventCard(resources.getString(info.getNameRes()), info.getStars(), monsters.get(0), monsters.get(1), monsters.get(2), monsters.get(3), monsters.get(4)));
        }
    }
}
