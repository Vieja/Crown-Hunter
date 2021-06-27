package com.vieja.crownhunter.activity;


import android.os.Bundle;
import android.util.Log;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

import com.vieja.crownhunter.R;

import java.util.Locale;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);

        Preference customPref = (Preference) findPreference("non_english");
        Locale current = getResources().getConfiguration().locale;
        if (current.getLanguage().equals("pl"))
            customPref.setVisible(true);
    }


}
