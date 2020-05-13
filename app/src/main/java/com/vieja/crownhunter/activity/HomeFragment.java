package com.vieja.crownhunter.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vieja.crownhunter.Achievement;
import com.vieja.crownhunter.FileIO;
import com.vieja.crownhunter.MonsterDatabase;
import com.vieja.crownhunter.MonsterInfo;
import com.vieja.crownhunter.R;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_home, null);

        int mini = 0;
        int giant = 0;
        int mini_ice = 0;
        int giant_ice = 0;
        StringBuilder sb = FileIO.load(getContext());
        if (sb.toString().equals("NO_FILE")) {
            StringBuilder save = new StringBuilder();
            for (MonsterInfo monster : MonsterDatabase.list)
                save.append(monster.getPosition()).append(";").append("no;no;\n");
            FileIO.save(getContext(),save);
            sb = FileIO.load(getContext());
        }

        String[] lines = sb.toString().split("\n");
        for (String line: lines) {
            String[] info = line.split(";");
            Achievement type = MonsterDatabase.getMonsterType(Integer.parseInt(info[0]));
            switch (type) {
                case WORLD:
                    mini+= (info[1].equals("no") ? 1 : 0);
                    giant+= (info[2].equals("no") ? 1 : 0);
                    break;
                case ICEBORNE:
                case WORLD_ADD:
                    mini_ice+= (info[1].equals("no") ? 1 : 0);
                    giant_ice+= (info[2].equals("no") ? 1 : 0);
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

        return view;

    }
}
