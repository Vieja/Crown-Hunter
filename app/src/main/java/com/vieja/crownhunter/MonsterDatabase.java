package com.vieja.crownhunter;

import android.bluetooth.le.ScanSettings;

import java.util.Arrays;
import java.util.List;

public class MonsterDatabase {
    public static final List<MonsterInfo> list = Arrays.asList(
            new MonsterInfo(0,"Great Jagras",R.drawable.m_great_jagras,Achievement.WORLD),
            new MonsterInfo(1,"Kulu-Ya-Ku",R.drawable.m_kulu_ya_ku,Achievement.WORLD),
            new MonsterInfo(2,"Pukei-Pukei",R.drawable.m_pukei_pukei,Achievement.WORLD),
            new MonsterInfo(3,"Barroth",R.drawable.m_barroth,Achievement.WORLD),
            new MonsterInfo(4,"Jyuratodus",R.drawable.m_jyuratodus,Achievement.WORLD),
            new MonsterInfo(5,"Tobi-Kadachi",R.drawable.m_tobi_kadachi,Achievement.WORLD),
            new MonsterInfo(6,"Anjanath",R.drawable.m_anjanath,Achievement.WORLD),
            new MonsterInfo(7,"Rathian",R.drawable.m_rathian,Achievement.WORLD),
            new MonsterInfo(8,"Tzitzi-Ya-Ku",R.drawable.m_tzitzi_ya_ku,Achievement.WORLD),
            new MonsterInfo(9,"Paolumu",R.drawable.m_paolumu,Achievement.WORLD),
            new MonsterInfo(10,"Great Girros",R.drawable.m_great_girros,Achievement.WORLD),
            new MonsterInfo(11,"Radobaan",R.drawable.m_radobaan,Achievement.WORLD),
            new MonsterInfo(12,"Legiana",R.drawable.m_legiana,Achievement.WORLD),
            new MonsterInfo(13,"Odogaron",R.drawable.m_odogaron,Achievement.WORLD),
            new MonsterInfo(14,"Rathalos",R.drawable.m_rathalos,Achievement.WORLD),
            new MonsterInfo(15,"Diablos",R.drawable.m_diablos,Achievement.WORLD),
            new MonsterInfo(16,"Kirin",R.drawable.m_kirin,Achievement.WORLD),
            new MonsterInfo(17,"Dodogama",R.drawable.m_dodogama,Achievement.WORLD),
            new MonsterInfo(18,"Pink Rathian",R.drawable.m_pink_rathian,Achievement.WORLD),
            new MonsterInfo(19,"Bazelgeuse",R.drawable.m_bazelgeuse,Achievement.WORLD),
            new MonsterInfo(20,"Lavasioth",R.drawable.m_lavasioth,Achievement.WORLD),
            new MonsterInfo(21,"Uragaan",R.drawable.m_uragaan,Achievement.WORLD),
            new MonsterInfo(22,"Azure Rathalos",R.drawable.m_azure_rathalos,Achievement.WORLD),
            new MonsterInfo(23,"Black Diablos",R.drawable.m_black_diablos,Achievement.WORLD),
            new MonsterInfo(24,"Nergigante",R.drawable.m_nergigante,Achievement.WORLD),
            new MonsterInfo(25,"Teostra",R.drawable.m_teostra,Achievement.WORLD),
            new MonsterInfo(26,"Kushala Daora",R.drawable.m_kushala_daora,Achievement.WORLD),
            new MonsterInfo(27,"Vaal Hazak",R.drawable.m_vaal_hazak,Achievement.WORLD)
    );


    public static int getMonsterIcon(String name) {
        for (MonsterInfo m : list) {
            if (m.getName().equals(name)) return m.getMonsterIcon();
        }
        return -1;
    }

    public static Achievement getMonsterType(String name) {
        for (MonsterInfo m : list) {
            if (m.getName().equals(name)) return m.getType();
        }
        return null;
    }

    public static int getMonsterPosition(String name) {
        for (MonsterInfo m : list) {
            if (m.getName().equals(name)) return m.getPosition();
        }
        return -1;
    }
}
