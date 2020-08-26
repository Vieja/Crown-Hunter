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
                                new CrownInfo(R.string.jagras, false, 100),
                                new CrownInfo(R.string.jagras, true, 100)
                                ))),
                new EventInfo(R.string.a_rush_of_blood, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.string.odogaron, false, 100)
                        ))),
                new EventInfo(R.string.usj_blazing, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.string.azure_rathalos, false, 100),
                                new CrownInfo(R.string.dodogama, true, 100)
                        ))),
                new EventInfo(R.string.egg_lovers, 6,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.string.kulu, true, 100)
                        ))),
                new EventInfo(R.string.deep_green, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.string.anja, false, 20),
                                new CrownInfo(R.string.jagras, false, 20),
                                new CrownInfo(R.string.pukei, false, 20),
                                new CrownInfo(R.string.rathalos, false, 20),
                                new CrownInfo(R.string.tobi, false, 20),
                                new CrownInfo(R.string.anja, true, 20),
                                new CrownInfo(R.string.jagras, true, 20),
                                new CrownInfo(R.string.pukei, true, 20),
                                new CrownInfo(R.string.rathalos, true, 20),
                                new CrownInfo(R.string.tobi, true, 20)
                        ))),
                new EventInfo(R.string.wildspire_bolero, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.string.diablos, false, 20),
                                new CrownInfo(R.string.barroth, false, 20),
                                new CrownInfo(R.string.jyuratodus, false, 20),
                                new CrownInfo(R.string.kulu, false, 20),
                                new CrownInfo(R.string.rathian, false, 20),
                                new CrownInfo(R.string.diablos, true, 20),
                                new CrownInfo(R.string.barroth, true, 20),
                                new CrownInfo(R.string.jyuratodus, true, 20),
                                new CrownInfo(R.string.kulu, true, 20),
                                new CrownInfo(R.string.rathian, true, 20)
                        ))),
                new EventInfo(R.string.coral_waltz, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.string.legiana, false, 20),
                                new CrownInfo(R.string.paolumu, false, 20),
                                new CrownInfo(R.string.pink_rathian, false, 20),
                                new CrownInfo(R.string.tzitzi, false, 20),
                                new CrownInfo(R.string.legiana, true, 20),
                                new CrownInfo(R.string.paolumu, true, 20),
                                new CrownInfo(R.string.pink_rathian, true, 20),
                                new CrownInfo(R.string.tzitzi, true, 20)
                        ))),
                new EventInfo(R.string.effluvial_opera, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.string.bazelgeuse, false, 25),
                                new CrownInfo(R.string.girros, false, 25),
                                new CrownInfo(R.string.odogaron, false, 25),
                                new CrownInfo(R.string.radobaan, false, 25),
                                new CrownInfo(R.string.bazelgeuse, true, 25),
                                new CrownInfo(R.string.girros, true, 25),
                                new CrownInfo(R.string.odogaron, true, 25),
                                new CrownInfo(R.string.radobaan, true, 25)
                        ))),
                new EventInfo(R.string.rock_n_roll, 7,
                        new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.string.azure_rathalos, false, 25),
                                new CrownInfo(R.string.dodogama, false, 25),
                                new CrownInfo(R.string.lavasioth, false, 25),
                                new CrownInfo(R.string.uragaan, false, 25),
                                new CrownInfo(R.string.azure_rathalos, true, 25),
                                new CrownInfo(R.string.dodogama, true, 25),
                                new CrownInfo(R.string.lavasioth, true, 25),
                                new CrownInfo(R.string.uragaan, true, 25)
                        )))
        );
    }

}