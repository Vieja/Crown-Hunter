package com.vieja.crownhunter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonsterListAdapter extends RecyclerView.Adapter<MonsterListAdapter.ViewHolder> {

    private ArrayList<MonsterCard> monsterList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView monster_icon;
        public TextView text1;
        public TextView text2;

        public ViewHolder(View itemView) {
            super(itemView);
            monster_icon = itemView.findViewById(R.id.monster_icon);
            text1 = itemView.findViewById(R.id.test1);
            text2 = itemView.findViewById(R.id.test2);
        }
    }

    public MonsterListAdapter(ArrayList<MonsterCard> monsterList) {
        this.monsterList = monsterList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.monster_card, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MonsterCard card = monsterList.get(position);
        holder.monster_icon.setImageResource(card.getMonsterIcon());
        holder.text1.setText(card.getText1());
        holder.text2.setText(card.getText2());
    }

    @Override
    public int getItemCount() {
        return monsterList.size();
    }


}
