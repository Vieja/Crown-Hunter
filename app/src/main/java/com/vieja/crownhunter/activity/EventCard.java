package com.vieja.crownhunter.activity;

public class EventCard implements Comparable{
    private final String name;
    private int chances;
    private final int monsterIcon1;
    private final int monsterIcon2;
    private final int monsterIcon3;
    private final int monsterIcon4;
    private final int monsterIcon5;

    public EventCard(String name, int chances, int monsterIcon1, int monsterIcon2, int monsterIcon3, int monsterIcon4, int monsterIcon5) {
        this.name = name;
        this.chances = chances;
        this.monsterIcon1 = monsterIcon1;
        this.monsterIcon2 = monsterIcon2;
        this.monsterIcon3 = monsterIcon3;
        this.monsterIcon4 = monsterIcon4;
        this.monsterIcon5 = monsterIcon5;
    }

    public String getName() {
        return name;
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
    }

    public int getMonsterIcon1() {
        return monsterIcon1;
    }

    public int getMonsterIcon2() {
        return monsterIcon2;
    }

    public int getMonsterIcon3() {
        return monsterIcon3;
    }

    public int getMonsterIcon4() {
        return monsterIcon4;
    }

    public int getMonsterIcon5() {
        return monsterIcon5;
    }

    @Override
    public int compareTo(Object o) {
        return ((EventCard)o).chances-this.chances;
    }
}
