package com.vieja.crownhunter;

public class MonsterCard {
    private int monsterIcon;
    private String text1;
    private String text2;

    public MonsterCard(int image, String txt1, String txt2) {
        monsterIcon = image;
        text1 = txt1;
        text2 = txt2;
    }

    public int getMonsterIcon() {
        return monsterIcon;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
