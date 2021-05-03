package com.vieja.crownhunter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventDatabase {
    public static List<EventInfo> list = null;

    public static void populateEventDatabase() {
        list = Arrays.asList(
                new EventInfo(R.string.usj_gold_star, 3,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_great_jagras, false, 100),
                                new CrownInfo(R.drawable.m_great_jagras, true, 100)
                                ))),
                new EventInfo(R.string.a_rush_of_blood, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_odogaron, false, 100)
                        ))),
                new EventInfo(R.string.usj_blazing, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_azure_rathalos, false, 100),
                                new CrownInfo(R.drawable.m_dodogama, true, 100)
                        ))),
                new EventInfo(R.string.egg_lovers, 6,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_kulu_ya_ku, true, 100)
                        ))),
                new EventInfo(R.string.deep_green, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_anjanath, false, 20),
                                new CrownInfo(R.drawable.m_great_jagras, false, 20),
                                new CrownInfo(R.drawable.m_pukei_pukei, false, 20),
                                new CrownInfo(R.drawable.m_rathalos, false, 20),
                                new CrownInfo(R.drawable.m_tobi_kadachi, false, 20),
                                new CrownInfo(R.drawable.m_anjanath, true, 20),
                                new CrownInfo(R.drawable.m_great_jagras, true, 20),
                                new CrownInfo(R.drawable.m_pukei_pukei, true, 20),
                                new CrownInfo(R.drawable.m_rathalos, true, 20),
                                new CrownInfo(R.drawable.m_tobi_kadachi, true, 20)
                        ))),
                new EventInfo(R.string.wildspire_bolero, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_diablos, false, 20),
                                new CrownInfo(R.drawable.m_barroth, false, 20),
                                new CrownInfo(R.drawable.m_jyuratodus, false, 20),
                                new CrownInfo(R.drawable.m_kulu_ya_ku, false, 20),
                                new CrownInfo(R.drawable.m_rathian, false, 20),
                                new CrownInfo(R.drawable.m_diablos, true, 20),
                                new CrownInfo(R.drawable.m_barroth, true, 20),
                                new CrownInfo(R.drawable.m_jyuratodus, true, 20),
                                new CrownInfo(R.drawable.m_kulu_ya_ku, true, 20),
                                new CrownInfo(R.drawable.m_rathian, true, 20)
                        ))),
                new EventInfo(R.string.coral_waltz, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_legiana, false, 20),
                                new CrownInfo(R.drawable.m_paolumu, false, 20),
                                new CrownInfo(R.drawable.m_pink_rathian, false, 20),
                                new CrownInfo(R.drawable.m_tzitzi_ya_ku, false, 20),
                                new CrownInfo(R.drawable.m_legiana, true, 20),
                                new CrownInfo(R.drawable.m_paolumu, true, 20),
                                new CrownInfo(R.drawable.m_pink_rathian, true, 20),
                                new CrownInfo(R.drawable.m_tzitzi_ya_ku, true, 20)
                        ))),
                new EventInfo(R.string.effluvial_opera, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_bazelgeuse, false, 25),
                                new CrownInfo(R.drawable.m_great_girros, false, 25),
                                new CrownInfo(R.drawable.m_odogaron, false, 25),
                                new CrownInfo(R.drawable.m_radobaan, false, 25),
                                new CrownInfo(R.drawable.m_bazelgeuse, true, 25),
                                new CrownInfo(R.drawable.m_great_girros, true, 25),
                                new CrownInfo(R.drawable.m_odogaron, true, 25),
                                new CrownInfo(R.drawable.m_radobaan, true, 25)
                        ))),
                new EventInfo(R.string.rock_n_roll, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_azure_rathalos, false, 25),
                                new CrownInfo(R.drawable.m_dodogama, false, 25),
                                new CrownInfo(R.drawable.m_lavasioth, false, 25),
                                new CrownInfo(R.drawable.m_uragaan, false, 25),
                                new CrownInfo(R.drawable.m_azure_rathalos, true, 25),
                                new CrownInfo(R.drawable.m_dodogama, true, 25),
                                new CrownInfo(R.drawable.m_lavasioth, true, 25),
                                new CrownInfo(R.drawable.m_uragaan, true, 25)
                        )))
        );
    }

}