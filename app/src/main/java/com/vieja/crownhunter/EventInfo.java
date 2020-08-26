package com.vieja.crownhunter;

import java.util.ArrayList;

public class EventInfo {
    private int nameRes;
    private int stars;
    private ArrayList<CrownInfo> crownChances;

    public EventInfo(int nameRes, int stars, ArrayList<CrownInfo> crownChances) {
        this.nameRes = nameRes;
        this.stars = stars;
        this.crownChances = crownChances;
    }

    public int getNameRes() {
        return nameRes;
    }

    public int getStars() {
        return stars;
    }

    public ArrayList<CrownInfo> getCrownChances() {
        return crownChances;
    }
}