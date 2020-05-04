package com.vieja.crownhunter;

import java.util.Arrays;
import java.util.List;

public class MonsterDatabase {
    public static final List<MonsterInfo> list = Arrays.asList(
            new MonsterInfo("Great Jagras",R.drawable.m_great_jagras,Achievement.WORLD),
            new MonsterInfo("Kulu-Ya-Ku",R.drawable.m_kulu_ya_ku,Achievement.WORLD),
            new MonsterInfo("Pukei-Pukei",R.drawable.m_pukei_pukei,Achievement.WORLD),
            new MonsterInfo("Barroth",R.drawable.m_barroth,Achievement.WORLD),
            new MonsterInfo("Jyuratodus",R.drawable.m_jyuratodus,Achievement.WORLD),
            new MonsterInfo("Tobi-Kadachi",R.drawable.m_tobi_kadachi,Achievement.WORLD),
            new MonsterInfo("Anjanath",R.drawable.m_anjanath,Achievement.WORLD),
            new MonsterInfo("Rathian",R.drawable.m_rathian,Achievement.WORLD),
            new MonsterInfo("Tzitzi-Ya-Ku",R.drawable.m_tzitzi_ya_ku,Achievement.WORLD),
            new MonsterInfo("Paolumu",R.drawable.m_paolumu,Achievement.WORLD),
            new MonsterInfo("Great Girros",R.drawable.m_great_girros,Achievement.WORLD),
            new MonsterInfo("Radobaan",R.drawable.m_radobaan,Achievement.WORLD),
            new MonsterInfo("Legiana",R.drawable.m_legiana,Achievement.WORLD),
            new MonsterInfo("Odogaron",R.drawable.m_odogaron,Achievement.WORLD),
            new MonsterInfo("Rathalos",R.drawable.m_rathalos,Achievement.WORLD),
            new MonsterInfo("Diablos",R.drawable.m_diablos,Achievement.WORLD),
            new MonsterInfo("Kirin",R.drawable.m_kirin,Achievement.WORLD),
            new MonsterInfo("Dodogama",R.drawable.m_dodogama,Achievement.WORLD),
            new MonsterInfo("Pink Rathian",R.drawable.m_pink_rathian,Achievement.WORLD),
            new MonsterInfo("Bazelgeuse",R.drawable.m_bazelgeuse,Achievement.WORLD),
            new MonsterInfo("Lavasioth",R.drawable.m_lavasioth,Achievement.WORLD),
            new MonsterInfo("Uragaan",R.drawable.m_uragaan,Achievement.WORLD),
            new MonsterInfo("Azure Rathalos",R.drawable.m_azure_rathalos,Achievement.WORLD),
            new MonsterInfo("Black Diablos",R.drawable.m_black_diablos,Achievement.WORLD),
            new MonsterInfo("Nergigante",R.drawable.m_nergigante,Achievement.WORLD),
            new MonsterInfo("Teostra",R.drawable.m_teostra,Achievement.WORLD),
            new MonsterInfo("Kushala Daora",R.drawable.m_kushala_daora,Achievement.WORLD),
            new MonsterInfo("Vaal Hazak",R.drawable.m_vaal_hazak,Achievement.WORLD)
    );


    public static int getMonsterIcon(String name) {
        for (MonsterInfo m : list) {
            if (m.getName().equals(name)) return m.getMonsterIcon();
        }
        return -1;
    }
}
