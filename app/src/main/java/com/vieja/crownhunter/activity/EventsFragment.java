package com.vieja.crownhunter.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.vieja.crownhunter.R;

public class EventsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_events, null);
        AdView myAdView2 = view.findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        myAdView2.loadAd(adRequest2);
        return view;
    }
}
