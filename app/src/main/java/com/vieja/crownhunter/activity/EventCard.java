package com.vieja.crownhunter.activity;

public class EventCard implements Comparable{
    private final String name;
    private int chances;
    private final int stars;
    private final int monsterIcon1;
    private final int monsterIcon2;
    private final int monsterIcon3;
    private final int monsterIcon4;
    private final int monsterIcon5;

    public EventCard(String name, int chances, int stars, int monsterIcon1, int monsterIcon2, int monsterIcon3, int monsterIcon4, int monsterIcon5) {
        this.name = name;
        this.chances = chances;
        this.stars = stars;
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
        if (((EventCard)o).chances == this.chances)
            return (this.stars - ((EventCard)o).stars);
        else return ((EventCard)o).chances-this.chances;
    }
}
