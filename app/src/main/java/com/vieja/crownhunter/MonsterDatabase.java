package com.vieja.crownhunter;

import android.bluetooth.le.ScanSettings;
import android.content.res.Resources;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

public class MonsterDatabase {
    public static List<MonsterInfo> list = null;

    public static void populateMonsterDatabase() {
        list = Arrays.asList(
                new MonsterInfo(0,R.string.jagras,R.drawable.m_great_jagras,Achievement.WORLD),
                new MonsterInfo(1,R.string.kulu,R.drawable.m_kulu_ya_ku,Achievement.WORLD),
                new MonsterInfo(2,R.string.pukei,R.drawable.m_pukei_pukei,Achievement.WORLD),
                new MonsterInfo(3,R.string.barroth,R.drawable.m_barroth,Achievement.WORLD),
                new MonsterInfo(4,R.string.jyuratodus,R.drawable.m_jyuratodus,Achievement.WORLD),
                new MonsterInfo(5,R.string.tobi,R.drawable.m_tobi_kadachi,Achievement.WORLD),
                new MonsterInfo(6,R.string.anja,R.drawable.m_anjanath,Achievement.WORLD),
                new MonsterInfo(7,R.string.rathian,R.drawable.m_rathian,Achievement.WORLD),
                new MonsterInfo(8,R.string.tzitzi,R.drawable.m_tzitzi_ya_ku,Achievement.WORLD),
                new MonsterInfo(9,R.string.paolumu,R.drawable.m_paolumu,Achievement.WORLD),
                new MonsterInfo(10,R.string.girros,R.drawable.m_great_girros,Achievement.WORLD),
                new MonsterInfo(11,R.string.radobaan,R.drawable.m_radobaan,Achievement.WORLD),
                new MonsterInfo(12,R.string.legiana,R.drawable.m_legiana,Achievement.WORLD),
                new MonsterInfo(13,R.string.odogaron,R.drawable.m_odogaron,Achievement.WORLD),
                new MonsterInfo(14,R.string.rathalos,R.drawable.m_rathalos,Achievement.WORLD),
                new MonsterInfo(15,R.string.diablos,R.drawable.m_diablos,Achievement.WORLD),
                new MonsterInfo(16,R.string.kirin,R.drawable.m_kirin,Achievement.WORLD),
                new MonsterInfo(17,R.string.dodogama,R.drawable.m_dodogama,Achievement.WORLD),
                new MonsterInfo(18,R.string.pink_rathian,R.drawable.m_pink_rathian,Achievement.WORLD),
                new MonsterInfo(19,R.string.bazelgeuse,R.drawable.m_bazelgeuse,Achievement.WORLD),
                new MonsterInfo(20,R.string.lavasioth,R.drawable.m_lavasioth,Achievement.WORLD),
                new MonsterInfo(21,R.string.uragaan,R.drawable.m_uragaan,Achievement.WORLD),
                new MonsterInfo(22,R.string.azure_rathalos,R.drawable.m_azure_rathalos,Achievement.WORLD),
                new MonsterInfo(23,R.string.black_diablos,R.drawable.m_black_diablos,Achievement.WORLD),
                new MonsterInfo(24,R.string.nergigante,R.drawable.m_nergigante,Achievement.WORLD),
                new MonsterInfo(25,R.string.teostra,R.drawable.m_teostra,Achievement.WORLD),
                new MonsterInfo(26,R.string.kushala_daora,R.drawable.m_kushala_daora,Achievement.WORLD),
                new MonsterInfo(27,R.string.vaal_hazak,R.drawable.m_vaal_hazak,Achievement.WORLD),
                new MonsterInfo(28,R.string.lunastra,R.drawable.m_lunastra,Achievement.WORLD_ADD),
                new MonsterInfo(29,R.string.deviljho,R.drawable.m_deviljho,Achievement.WORLD_ADD),

                new MonsterInfo(30,R.string.beotodus,R.drawable.m_beotodus,Achievement.ICEBORNE),
                new MonsterInfo(31,R.string.banbaro,R.drawable.m_banbaro,Achievement.ICEBORNE),
                new MonsterInfo(32,R.string.viper_tobi,R.drawable.m_viper_tobi_kadachi,Achievement.ICEBORNE),
                new MonsterInfo(33,R.string.night_paolumu,R.drawable.m_nightshade_paolumu,Achievement.ICEBORNE),
                new MonsterInfo(34,R.string.coral_pukei,R.drawable.m_coral_pukei_pukei,Achievement.ICEBORNE),
                new MonsterInfo(35,R.string.barioth,R.drawable.m_barioth,Achievement.ICEBORNE),
                new MonsterInfo(36,R.string.nargacuga,R.drawable.m_nargacuga,Achievement.ICEBORNE),
                new MonsterInfo(37,R.string.glavenus,R.drawable.m_glavenus,Achievement.ICEBORNE),
                new MonsterInfo(38,R.string.tigrex,R.drawable.m_tigrex,Achievement.ICEBORNE),
                new MonsterInfo(39,R.string.brachydios,R.drawable.m_brachydios,Achievement.ICEBORNE),
                new MonsterInfo(40,R.string.acidic_glavenus,R.drawable.m_acidic_glavenus,Achievement.ICEBORNE),
                new MonsterInfo(41,R.string.shrieking_legiana,R.drawable.m_shrieking_legiana,Achievement.ICEBORNE),
                new MonsterInfo(42,R.string.fulgur_anja,R.drawable.m_fulgur_anjanath,Achievement.ICEBORNE),
                new MonsterInfo(43,R.string.ebony_odogaron,R.drawable.m_ebony_odogaron,Achievement.ICEBORNE),
                new MonsterInfo(44,R.string.velkhana,R.drawable.m_velkhana,Achievement.ICEBORNE),
                new MonsterInfo(45,R.string.seeth_bazelgeuse,R.drawable.m_seething_bazelgeuse,Achievement.ICEBORNE),
                new MonsterInfo(46,R.string.black_vaal,R.drawable.m_blackveil_vaal_hazak,Achievement.ICEBORNE),
                new MonsterInfo(47,R.string.namielle,R.drawable.m_namielle,Achievement.ICEBORNE),
                new MonsterInfo(48,R.string.sav_deviljho,R.drawable.m_savage_deviljho,Achievement.ICEBORNE),
                new MonsterInfo(49,R.string.ruin_nergigante,R.drawable.m_ruiner_nergigante,Achievement.ICEBORNE),
                new MonsterInfo(50,R.string.zinogre,R.drawable.m_zinogre,Achievement.ICEBORNE),
                new MonsterInfo(51,R.string.yian_garuga,R.drawable.m_yian_garuga,Achievement.ICEBORNE),
                new MonsterInfo(52,R.string.scar_yian_garuga,R.drawable.m_scarred_yian_garuga,Achievement.ICEBORNE),
                new MonsterInfo(53,R.string.brute_tigrex,R.drawable.m_brute_tigrex,Achievement.ICEBORNE),
                new MonsterInfo(54,R.string.gold_rathian,R.drawable.m_gold_rathian,Achievement.ICEBORNE),
                new MonsterInfo(55,R.string.silver_rathalos,R.drawable.m_silver_rathalos,Achievement.ICEBORNE),
                new MonsterInfo(56,R.string.stygian_zinogre,R.drawable.m_stygian_zinogre,Achievement.ICEBORNE_ADD),
                new MonsterInfo(57,R.string.rajang,R.drawable.m_rajang,Achievement.ICEBORNE_ADD),
                new MonsterInfo(58,R.string.furious_rajang,R.drawable.m_furious_rajang,Achievement.ICEBORNE_ADD)
        );
    }

    public static int getMonsterNameRes(int pos) {
        for (MonsterInfo m : list) {
            if (m.getPosition() == pos) return m.getNameRes();
        }
        return -1;
    }

    public static int getMonsterIcon(int pos) {
        for (MonsterInfo m : list) {
            if (m.getPosition() == pos) return m.getMonsterIcon();
        }
        return -1;
    }

    public static Achievement getMonsterType(int pos) {
        for (MonsterInfo m : list) {
            if (m.getPosition() == pos) return m.getType();
        }
        return null;
    }

}
