package com.vieja.crownhunter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MonsterListAdapter extends RecyclerView.Adapter<MonsterListAdapter.ViewHolder> {

    private Context context;
    public static ArrayList<MonsterCard> monsterList;
    public static ArrayList<MonsterCard> hiddenMonsterCardsList = new ArrayList<>();
    public static ArrayList<MonsterCard> filteredMonsterCardsList = new ArrayList<>();

    public static class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        public ImageView monster_icon;
        public TextView name;
        public CheckBox mini;
        public CheckBox giant;
        public Context context;

        public ViewHolder(View itemView, Context c) {
            super(itemView);
            monster_icon = itemView.findViewById(R.id.monster_icon);
            name = itemView.findViewById(R.id.name);
            mini = itemView.findViewById(R.id.miniBox);
            giant = itemView.findViewById(R.id.maxBox);
            context = c;
        }

        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();
            monsterList.get(adapterPosition).setMiniature(mini.isChecked());
            monsterList.get(adapterPosition).setGiant(giant.isChecked());
            saveAnyChanges();

        }

        private void saveAnyChanges() {
            ArrayList<MonsterCard> toSave = new ArrayList<>(monsterList);
            toSave.addAll(hiddenMonsterCardsList);
            toSave.addAll(filteredMonsterCardsList);
            Collections.sort(toSave, new Comparator<MonsterCard>(){
                public int compare(MonsterCard m1, MonsterCard m2) {
                    return m1.getPosition() - m2.getPosition();
                }
            });
            StringBuilder save = new StringBuilder();
            for (MonsterCard monster : toSave){
                save.append(monster.getPosition()).append(";").
                        append(monster.getName()).append(";")
                        .append( (monster.isMiniature()) ? "yes;" : "no;" )
                        .append( (monster.isGiant()) ? "yes;" : "no;" )
                        .append("\n");
            }
            FileIO.save(context,save);
        }

        public void bind(int position) {
            mini.setOnClickListener(this);
            giant.setOnClickListener(this);
            MonsterCard card = monsterList.get(position);
            monster_icon.setImageResource(card.getMonsterIcon());
            name.setText(card.getName());
            mini.setChecked(card.isMiniature());
            giant.setChecked(card.isGiant());
        }
    }

    public MonsterListAdapter(ArrayList<MonsterCard> monsterList, Context context) {
        this.context = context;
        MonsterListAdapter.monsterList = monsterList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.monster_card, parent, false);
        ViewHolder vh = new ViewHolder(v, context);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return monsterList.size();
    }


}
