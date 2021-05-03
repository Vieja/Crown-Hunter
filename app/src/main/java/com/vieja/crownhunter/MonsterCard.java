package com.vieja.crownhunter;

public class MonsterCard {
    private final int monsterIcon;
    private final String name;
    private boolean miniature;
    private boolean giant;
    private final int position;

    public MonsterCard(int monsterIcon, String name, boolean miniature, boolean giant, int position) {
        this.monsterIcon = monsterIcon;
        this.name = name;
        this.miniature = miniature;
        this.giant = giant;
        this.position = position;
    }

    public int getMonsterIcon() {
        return monsterIcon;
    }

    public String getName() {
        return name;
    }

    public boolean isMiniature() {
        return miniature;
    }

    public boolean isGiant() {
        return giant;
    }

    public void setMiniature(boolean miniature) {
        this.miniature = miniature;
    }

    public void setGiant(boolean giant) {
        this.giant = giant;
    }

    public int getPosition() {
        return position;
    }
}
