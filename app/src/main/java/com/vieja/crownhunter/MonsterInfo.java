package com.vieja.crownhunter;

public class MonsterInfo {
    private String name;
    private int monsterIcon;
    private Achievement type;

    public MonsterInfo(String name, int monsterIcon, Achievement type) {
        this.name = name;
        this.monsterIcon = monsterIcon;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public int getMonsterIcon() {
        return monsterIcon;
    }

    public Achievement getType() {
        return type;
    }
}
