package com.vieja.crownhunter;

public class MonsterInfo {
    private final int position;
    private final int nameRes;
    private final int monsterIcon;
    private final Achievement type;

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
