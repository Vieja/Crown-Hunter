package com.vieja.crownhunter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventDatabase {
    public static List<EventInfo> list = null;

    public static void populateEventDatabase() {
        list = Arrays.asList(
                new EventInfo(R.string.usj_gold_star, 3,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_great_jagras, false, 100),
                                new CrownInfo(R.drawable.m_great_jagras, true, 100)
                                ))),
                new EventInfo(R.string.a_rush_of_blood, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_odogaron, false, 100)
                        ))),
                new EventInfo(R.string.usj_blazing, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_azure_rathalos, false, 100),
                                new CrownInfo(R.drawable.m_dodogama, true, 100)
                        ))),
                new EventInfo(R.string.egg_lovers, 6,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_kulu_ya_ku, true, 100)
                        ))),
                new EventInfo(R.string.deep_green, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_anjanath, false, 12),
                                new CrownInfo(R.drawable.m_great_jagras, false, 12),
                                new CrownInfo(R.drawable.m_pukei_pukei, false, 12),
                                new CrownInfo(R.drawable.m_rathalos, false, 12),
                                new CrownInfo(R.drawable.m_tobi_kadachi, false, 12),
                                new CrownInfo(R.drawable.m_anjanath, true, 12),
                                new CrownInfo(R.drawable.m_great_jagras, true, 12),
                                new CrownInfo(R.drawable.m_pukei_pukei, true, 12),
                                new CrownInfo(R.drawable.m_rathalos, true, 12),
                                new CrownInfo(R.drawable.m_tobi_kadachi, true, 12)
                        ))),
                new EventInfo(R.string.wildspire_bolero, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_diablos, false, 12),
                                new CrownInfo(R.drawable.m_barroth, false, 12),
                                new CrownInfo(R.drawable.m_jyuratodus, false, 12),
                                new CrownInfo(R.drawable.m_kulu_ya_ku, false, 12),
                                new CrownInfo(R.drawable.m_rathian, false, 12),
                                new CrownInfo(R.drawable.m_diablos, true, 12),
                                new CrownInfo(R.drawable.m_barroth, true, 12),
                                new CrownInfo(R.drawable.m_jyuratodus, true, 12),
                                new CrownInfo(R.drawable.m_kulu_ya_ku, true, 12),
                                new CrownInfo(R.drawable.m_rathian, true, 12)
                        ))),
                new EventInfo(R.string.coral_waltz, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_legiana, false, 12),
                                new CrownInfo(R.drawable.m_paolumu, false, 12),
                                new CrownInfo(R.drawable.m_pink_rathian, false, 12),
                                new CrownInfo(R.drawable.m_tzitzi_ya_ku, false, 12),
                                new CrownInfo(R.drawable.m_legiana, true, 12),
                                new CrownInfo(R.drawable.m_paolumu, true, 12),
                                new CrownInfo(R.drawable.m_pink_rathian, true, 12),
                                new CrownInfo(R.drawable.m_tzitzi_ya_ku, true, 12)
                        ))),
                new EventInfo(R.string.effluvial_opera, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_bazelgeuse, false, 12),
                                new CrownInfo(R.drawable.m_great_girros, false, 12),
                                new CrownInfo(R.drawable.m_odogaron, false, 12),
                                new CrownInfo(R.drawable.m_radobaan, false, 12),
                                new CrownInfo(R.drawable.m_bazelgeuse, true, 12),
                                new CrownInfo(R.drawable.m_great_girros, true, 12),
                                new CrownInfo(R.drawable.m_odogaron, true, 12),
                                new CrownInfo(R.drawable.m_radobaan, true, 12)
                        ))),
                new EventInfo(R.string.rock_n_roll, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_azure_rathalos, false, 12),
                                new CrownInfo(R.drawable.m_dodogama, false, 12),
                                new CrownInfo(R.drawable.m_lavasioth, false, 12),
                                new CrownInfo(R.drawable.m_uragaan, false, 12),
                                new CrownInfo(R.drawable.m_azure_rathalos, true, 12),
                                new CrownInfo(R.drawable.m_dodogama, true, 12),
                                new CrownInfo(R.drawable.m_lavasioth, true, 12),
                                new CrownInfo(R.drawable.m_uragaan, true, 12)
                        )))
        );
    }

}