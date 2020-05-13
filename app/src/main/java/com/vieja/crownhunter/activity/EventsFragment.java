package com.vieja.crownhunter.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.vieja.crownhunter.R;

public class EventsFragment extends Fragment {

    private AdSize adSize;

    public EventsFragment(AdSize adSize) {
        super();
        this.adSize = adSize;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_events, null);

        FrameLayout adContainerView = view.findViewById(R.id.ad_container);
        // Step 1 - Create an AdView and set the ad unit ID on it.
        AdView adView = new AdView(view.getContext());
        adView.setAdUnitId(getString(R.string.ad_main));
        adContainerView.addView(adView);
        adView.setAdSize(adSize);
        AdRequest adRequest =
                new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                        .build();
        adView.loadAd(adRequest);

        return view;
    }
}
