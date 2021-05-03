package com.vieja.crownhunter;

import java.util.ArrayList;

public class EventInfo {
    private final int nameRes;
    private final int stars;
    private final ArrayList<CrownInfo> crownChances;

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

    public ArrayList<Integer> getFiveMostersRes() {
        ArrayList<Integer> result = new ArrayList<>();
        for (CrownInfo info: crownChances) {
            if (!result.contains(info.getMonster()))
                result.add(info.getMonster());
        }
        while (result.size() != 5)
            result.add(0);
        return result;
    }
}