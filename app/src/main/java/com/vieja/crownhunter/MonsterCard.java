package com.vieja.crownhunter;

public class MonsterCard {
    private int monsterIcon;
    private String text1;

    public MonsterCard(int image, String txt1) {
        monsterIcon = image;
        text1 = txt1;
    }

    public int getMonsterIcon() {
        return monsterIcon;
    }

    public String getText1() {
        return text1;
    }


}
