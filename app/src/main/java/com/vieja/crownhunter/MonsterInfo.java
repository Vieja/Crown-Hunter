package com.vieja.crownhunter;

public class MonsterInfo {
    private int position;
    private String name;
    private int monsterIcon;
    private Achievement type;

    public MonsterInfo(int position, String name, int monsterIcon, Achievement type) {
        this.position = position;
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
