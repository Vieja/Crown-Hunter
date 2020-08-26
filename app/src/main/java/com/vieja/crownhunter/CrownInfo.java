package com.vieja.crownhunter;

public class CrownInfo {
    private int monsterRes;
    private boolean isGiant;
    private int chance;

    public CrownInfo(int monsterRes, boolean isGiant, int chance) {
        this.monsterRes = monsterRes;
        this.isGiant = isGiant;
        this.chance = chance;
    }

    public int getMonster() {
        return monsterRes;
    }

    public boolean isGiant() {
        return isGiant;
    }

    public int getChance() {
        return chance;
    }
}