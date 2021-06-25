package com.vieja.crownhunter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vieja.crownhunter.activity.EventCard;

import java.util.ArrayList;


public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.ViewHolder> {

    public static ArrayList<EventCard> eventList;
    public static ArrayList<EventCard> hiddenEventCardsList = new ArrayList<>();
    public static ArrayList<EventCard> filteredEventCardsList = new ArrayList<>();
    private final Context context;

    public EventListAdapter(ArrayList<EventCard> eventList, Context context) {
        this.context = context;
        EventListAdapter.eventList = eventList;
    }

    @NonNull
    @Override
    public EventListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card, parent, false);
        return new ViewHolder(v, context);
    }

    @Override
    public void onBindViewHolder(@NonNull EventListAdapter.ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public Context context;
        public TextView name;
        public ImageView monster_icon1;
        public ImageView monster_icon2;
        public ImageView monster_icon3;
        public ImageView monster_icon4;
        public ImageView monster_icon5;
        public TextView chances;

        public ViewHolder(View itemView, Context c) {
            super(itemView);
            context = c;
            name = itemView.findViewById(R.id.name);
            monster_icon1 = itemView.findViewById(R.id.monster_icon1);
            monster_icon2 = itemView.findViewById(R.id.monster_icon2);
            monster_icon3 = itemView.findViewById(R.id.monster_icon3);
            monster_icon4 = itemView.findViewById(R.id.monster_icon4);
            monster_icon5 = itemView.findViewById(R.id.monster_icon5);
            chances = itemView.findViewById(R.id.chances);
        }

        @Override
        public void onClick(View view) {

        }

        public void bind(int position) {
            EventCard card = eventList.get(position);
            name.setText(card.getName());
            monster_icon1.setImageResource(card.getMonsterIcon1());
            monster_icon2.setImageResource(card.getMonsterIcon2());
            monster_icon3.setImageResource(card.getMonsterIcon3());
            monster_icon4.setImageResource(card.getMonsterIcon4());
            monster_icon5.setImageResource(card.getMonsterIcon5());
            chances.setText(context.getResources().getString(R.string.chances)+' '+card.getChances()+'%');
        }
    }
}
