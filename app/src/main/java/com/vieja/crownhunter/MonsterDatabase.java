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
            new MonsterInfo(20,"Deviljho",R.drawable.m_deviljho,Achievement.ICEBORNE),
            new MonsterInfo(21,"Lavasioth",R.drawable.m_lavasioth,Achievement.WORLD),
            new MonsterInfo(22,"Uragaan",R.drawable.m_uragaan,Achievement.WORLD),
            new MonsterInfo(23,"Azure Rathalos",R.drawable.m_azure_rathalos,Achievement.WORLD),
            new MonsterInfo(24,"Black Diablos",R.drawable.m_black_diablos,Achievement.WORLD),
            new MonsterInfo(25,"Nergigante",R.drawable.m_nergigante,Achievement.WORLD),
            new MonsterInfo(26,"Teostra",R.drawable.m_teostra,Achievement.WORLD),
            new MonsterInfo(27,"Lunastra",R.drawable.m_lunastra,Achievement.ICEBORNE),
            new MonsterInfo(28,"Kushala Daora",R.drawable.m_kushala_daora,Achievement.WORLD),
            new MonsterInfo(29,"Vaal Hazak",R.drawable.m_vaal_hazak,Achievement.WORLD),

            new MonsterInfo(30,"Beotodus",R.drawable.m_beotodus,Achievement.ICEBORNE),
            new MonsterInfo(31,"Banbaro",R.drawable.m_banbaro,Achievement.ICEBORNE),
            new MonsterInfo(32,"Viper Tobi-Kadachi",R.drawable.m_viper_tobi_kadachi,Achievement.ICEBORNE),
            new MonsterInfo(33,"Nightshade Paolumu",R.drawable.m_nightshade_paolumu,Achievement.ICEBORNE),
            new MonsterInfo(34,"Coral Pukei-Pukei",R.drawable.m_coral_pukei_pukei,Achievement.ICEBORNE),
            new MonsterInfo(35,"Barioth",R.drawable.m_barioth,Achievement.ICEBORNE),
            new MonsterInfo(36,"Nargacuga",R.drawable.m_nargacuga,Achievement.ICEBORNE),
            new MonsterInfo(37,"Glavenus",R.drawable.m_glavenus,Achievement.ICEBORNE),
            new MonsterInfo(38,"Tigrex",R.drawable.m_tigrex,Achievement.ICEBORNE),
            new MonsterInfo(39,"Brachydios",R.drawable.m_brachydios,Achievement.ICEBORNE),
            new MonsterInfo(40,"Acidic Glavenus",R.drawable.m_acidic_glavenus,Achievement.ICEBORNE),
            new MonsterInfo(41,"Shrieking Legiana",R.drawable.m_shrieking_legiana,Achievement.ICEBORNE),
            new MonsterInfo(42,"Fulgur Anjanath",R.drawable.m_fulgur_anjanath,Achievement.ICEBORNE),
            new MonsterInfo(43,"Ebony Odogaron",R.drawable.m_ebony_odogaron,Achievement.ICEBORNE),
            new MonsterInfo(44,"Velkhana",R.drawable.m_velkhana,Achievement.ICEBORNE),
            new MonsterInfo(45,"Seething Bazelgeuse",R.drawable.m_seething_bazelgeuse,Achievement.ICEBORNE),
            new MonsterInfo(46,"Blackveil Vaal Hazak",R.drawable.m_blackveil_vaal_hazak,Achievement.ICEBORNE),
            new MonsterInfo(47,"Savage Deviljho",R.drawable.m_savage_deviljho,Achievement.ICEBORNE),
            new MonsterInfo(48,"Ruiner Nergigante",R.drawable.m_ruiner_nergigante,Achievement.ICEBORNE),
            new MonsterInfo(49,"Zinogre",R.drawable.m_zinogre,Achievement.ICEBORNE),
            new MonsterInfo(50,"Stygian Zinogre",R.drawable.m_stygian_zinogre,Achievement.ADDITIONAL),
            new MonsterInfo(51,"Scarred Yian Garuga",R.drawable.m_scarred_yian_garuga,Achievement.ICEBORNE),
            new MonsterInfo(52,"Brute Tigrex",R.drawable.m_brute_tigrex,Achievement.ICEBORNE),
            new MonsterInfo(53,"Gold Rathian",R.drawable.m_gold_rathian,Achievement.ICEBORNE),
            new MonsterInfo(54,"Silver Rathalos",R.drawable.m_silver_rathalos,Achievement.ICEBORNE),
            new MonsterInfo(55,"Rajang",R.drawable.m_rajang,Achievement.ADDITIONAL),
            new MonsterInfo(56,"Furious Rajang",R.drawable.m_furious_rajang,Achievement.ADDITIONAL)
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
