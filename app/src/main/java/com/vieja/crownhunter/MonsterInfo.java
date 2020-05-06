package com.vieja.crownhunter;

public class MonsterInfo {
    private int position;
    private int nameRes;
    private int monsterIcon;
    private Achievement type;

    public MonsterInfo(int position, int nameRes, int monsterIcon, Achievement type) {
        this.position = position;
        this.nameRes = nameRes;
        this.monsterIcon = monsterIcon;
        this.type = type;
    }

    public int getNameRes() {
        return nameRes;
    }

    public int getMonsterIcon() {
        return monsterIcon;
    }

    public Achievement getType() {
        return type;
    }

    public int getPosition() {
        return position;
    }
}
