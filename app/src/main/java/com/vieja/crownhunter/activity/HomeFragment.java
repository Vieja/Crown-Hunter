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
import com.vieja.crownhunter.MonsterCard;
import com.vieja.crownhunter.MonsterDatabase;
import com.vieja.crownhunter.MonsterInfo;
import com.vieja.crownhunter.MonsterListAdapter;
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
                save.append(monster.getPosition()).append(";").append(monster.getName()).append(";").append("no;no;\n");
            FileIO.save(getContext(),save);
            sb = FileIO.load(getContext());
        }

        String[] lines = sb.toString().split("\n");
        for (String line: lines) {
            String[] info = line.split(";");
            Achievement type = MonsterDatabase.getMonsterType(info[1]);
            switch (type) {
                case WORLD:
                    mini+= (info[2].equals("no") ? 1 : 0);
                    giant+= (info[3].equals("no") ? 1 : 0);
                    break;
                case ICEBORNE:
                case WORLD_ADD:
                    mini_ice+= (info[2].equals("no") ? 1 : 0);
                    giant_ice+= (info[3].equals("no") ? 1 : 0);
                    break;
            }
        }

        TextView t1 = view.findViewById(R.id.text_mini);
        t1.setText(getContext().getString(R.string.home_mini_1)+" "+ mini+" "+getContext().getString(R.string.home_mini_2));
        TextView t2 = view.findViewById(R.id.text_giant);
        t2.setText(getContext().getString(R.string.home_giant_1)+" "+ giant+" "+getContext().getString(R.string.home_giant_2));
        TextView t3 = view.findViewById(R.id.text_mini_ice);
        t3.setText(getContext().getString(R.string.home_mini_1)+" "+ mini_ice+" "+getContext().getString(R.string.home_mini_2));
        TextView t4 = view.findViewById(R.id.text_giant_ice);
        t4.setText(getContext().getString(R.string.home_giant_1)+" "+ giant_ice+" "+getContext().getString(R.string.home_giant_2));


        return view;

    }
}
