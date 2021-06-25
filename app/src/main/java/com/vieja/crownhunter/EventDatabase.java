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
                new EventInfo(R.string.usj_blazing, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_dodogama, true, 100),
                        new CrownInfo(R.drawable.m_azure_rathalos, false, 100)
                ))),
                new EventInfo(R.string.egg_lovers, 6,
                        false, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_kulu_ya_ku, true, 100)
                ))),
                new EventInfo(R.string.a_rush_of_blood, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_odogaron, false, 100)
                        ))),
                new EventInfo(R.string.deep_green, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_great_jagras, false, 12),
                                new CrownInfo(R.drawable.m_pukei_pukei, false, 12),
                                new CrownInfo(R.drawable.m_tobi_kadachi, false, 12),
                                new CrownInfo(R.drawable.m_anjanath, false, 12),
                                new CrownInfo(R.drawable.m_rathalos, false, 12),
                                new CrownInfo(R.drawable.m_great_jagras, true, 12),
                                new CrownInfo(R.drawable.m_pukei_pukei, true, 12),
                                new CrownInfo(R.drawable.m_tobi_kadachi, true, 12),
                                new CrownInfo(R.drawable.m_anjanath, true, 12),
                                new CrownInfo(R.drawable.m_rathalos, true, 12)
                        ))),
                new EventInfo(R.string.wildspire_bolero, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_kulu_ya_ku, false, 12),
                                new CrownInfo(R.drawable.m_barroth, false, 12),
                                new CrownInfo(R.drawable.m_jyuratodus, false, 12),
                                new CrownInfo(R.drawable.m_rathian, false, 12),
                                new CrownInfo(R.drawable.m_diablos, false, 12),
                                new CrownInfo(R.drawable.m_kulu_ya_ku, true, 12),
                                new CrownInfo(R.drawable.m_barroth, true, 12),
                                new CrownInfo(R.drawable.m_jyuratodus, true, 12),
                                new CrownInfo(R.drawable.m_rathian, true, 12),
                                new CrownInfo(R.drawable.m_diablos, true, 12)
                        ))),
                new EventInfo(R.string.coral_waltz, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_tzitzi_ya_ku, false, 12),
                                new CrownInfo(R.drawable.m_paolumu, false, 12),
                                new CrownInfo(R.drawable.m_pink_rathian, false, 12),
                                new CrownInfo(R.drawable.m_legiana, false, 12),
                                new CrownInfo(R.drawable.m_tzitzi_ya_ku, true, 12),
                                new CrownInfo(R.drawable.m_paolumu, true, 12),
                                new CrownInfo(R.drawable.m_pink_rathian, true, 12),
                                new CrownInfo(R.drawable.m_legiana, true, 12)
                        ))),
                new EventInfo(R.string.effluvial_opera, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_great_girros, false, 12),
                                new CrownInfo(R.drawable.m_radobaan, false, 12),
                                new CrownInfo(R.drawable.m_odogaron, false, 12),
                                new CrownInfo(R.drawable.m_bazelgeuse, false, 12),
                                new CrownInfo(R.drawable.m_great_girros, true, 12),
                                new CrownInfo(R.drawable.m_radobaan, true, 12),
                                new CrownInfo(R.drawable.m_odogaron, true, 12),
                                new CrownInfo(R.drawable.m_bazelgeuse, true, 12)
                        ))),
                new EventInfo(R.string.rock_n_roll, 7,
                        false, false, new ArrayList<>(Arrays.asList(
                                new CrownInfo(R.drawable.m_dodogama, false, 12),
                                new CrownInfo(R.drawable.m_uragaan, false, 12),
                                new CrownInfo(R.drawable.m_lavasioth, false, 12),
                                new CrownInfo(R.drawable.m_azure_rathalos, false, 12),
                                new CrownInfo(R.drawable.m_dodogama, true, 12),
                                new CrownInfo(R.drawable.m_uragaan, true, 12),
                                new CrownInfo(R.drawable.m_lavasioth, true, 12),
                                new CrownInfo(R.drawable.m_azure_rathalos, true, 12)
                        ))),
                new EventInfo(R.string.greatest_jagras, 9,
                        false, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_great_jagras, true, 100),
                        new CrownInfo(R.drawable.m_deviljho, false, 100)
                ))),
                new EventInfo(R.string.name_is_lavasioth, 9,
                        false, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_lavasioth, true, 100)
                ))),
                new EventInfo(R.string.down_dark_muddy_path, 3,
                        false, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_barroth, true, 100)
                ))),
                new EventInfo(R.string.paolumu_lullabies, 12,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_nightshade_paolumu, false, 100)
                ))),
                new EventInfo(R.string.blazing_sun, 8,
                        false, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_teostra, true, 100)
                ))),
                new EventInfo(R.string.yodeling_in_forest, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_anjanath, false, 12),
                        new CrownInfo(R.drawable.m_rathalos, false, 12),
                        new CrownInfo(R.drawable.m_nargacuga, false, 12),
                        new CrownInfo(R.drawable.m_yian_garuga, false, 12),
                        new CrownInfo(R.drawable.m_rajang, false, 12),
                        new CrownInfo(R.drawable.m_anjanath, true, 12),
                        new CrownInfo(R.drawable.m_rathalos, true, 12),
                        new CrownInfo(R.drawable.m_nargacuga, true, 12),
                        new CrownInfo(R.drawable.m_yian_garuga, true, 12),
                        new CrownInfo(R.drawable.m_rajang, true, 12)
                ))),
                new EventInfo(R.string.heavy_metal, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_jyuratodus, false, 12),
                        new CrownInfo(R.drawable.m_nightshade_paolumu, false, 12),
                        new CrownInfo(R.drawable.m_glavenus, false, 12),
                        new CrownInfo(R.drawable.m_black_diablos, false, 12),
                        new CrownInfo(R.drawable.m_savage_deviljho, false, 12),
                        new CrownInfo(R.drawable.m_jyuratodus, true, 12),
                        new CrownInfo(R.drawable.m_nightshade_paolumu, true, 12),
                        new CrownInfo(R.drawable.m_glavenus, true, 12),
                        new CrownInfo(R.drawable.m_black_diablos, true, 12),
                        new CrownInfo(R.drawable.m_savage_deviljho, true, 12)
                ))),
                new EventInfo(R.string.symphony_of_coral, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_paolumu, false, 12),
                        new CrownInfo(R.drawable.m_legiana, false, 12),
                        new CrownInfo(R.drawable.m_coral_pukei_pukei, false, 12),
                        new CrownInfo(R.drawable.m_ebony_odogaron, false, 12),
                        new CrownInfo(R.drawable.m_zinogre, false, 12),
                        new CrownInfo(R.drawable.m_paolumu, true, 12),
                        new CrownInfo(R.drawable.m_legiana, true, 12),
                        new CrownInfo(R.drawable.m_coral_pukei_pukei, true, 12),
                        new CrownInfo(R.drawable.m_ebony_odogaron, true, 12),
                        new CrownInfo(R.drawable.m_zinogre, true, 12)
                ))),
                new EventInfo(R.string.rotten_canzone, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_great_girros, false, 12),
                        new CrownInfo(R.drawable.m_odogaron, false, 12),
                        new CrownInfo(R.drawable.m_tigrex, false, 12),
                        new CrownInfo(R.drawable.m_fulgur_anjanath, false, 12),
                        new CrownInfo(R.drawable.m_acidic_glavenus, false, 12),
                        new CrownInfo(R.drawable.m_great_girros, true, 12),
                        new CrownInfo(R.drawable.m_odogaron, true, 12),
                        new CrownInfo(R.drawable.m_tigrex, true, 12),
                        new CrownInfo(R.drawable.m_fulgur_anjanath, true, 12),
                        new CrownInfo(R.drawable.m_acidic_glavenus, true, 12)
                ))),
                new EventInfo(R.string.alt_rock_recess, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_banbaro, false, 12),
                        new CrownInfo(R.drawable.m_uragaan, false, 12),
                        new CrownInfo(R.drawable.m_brachydios, false, 12),
                        new CrownInfo(R.drawable.m_azure_rathalos, false, 12),
                        new CrownInfo(R.drawable.m_seething_bazelgeuse, false, 12),
                        new CrownInfo(R.drawable.m_banbaro, true, 12),
                        new CrownInfo(R.drawable.m_uragaan, true, 12),
                        new CrownInfo(R.drawable.m_brachydios, true, 12),
                        new CrownInfo(R.drawable.m_azure_rathalos, true, 12),
                        new CrownInfo(R.drawable.m_seething_bazelgeuse, true, 12)
                ))),
                new EventInfo(R.string.ballad_of_hoarfrost, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_beotodus, false, 12),
                        new CrownInfo(R.drawable.m_viper_tobi_kadachi, false, 12),
                        new CrownInfo(R.drawable.m_barioth, false, 12),
                        new CrownInfo(R.drawable.m_shrieking_legiana, false, 12),
                        new CrownInfo(R.drawable.m_stygian_zinogre, false, 12),
                        new CrownInfo(R.drawable.m_beotodus, true, 12),
                        new CrownInfo(R.drawable.m_viper_tobi_kadachi, true, 12),
                        new CrownInfo(R.drawable.m_barioth, true, 12),
                        new CrownInfo(R.drawable.m_shrieking_legiana, true, 12),
                        new CrownInfo(R.drawable.m_stygian_zinogre, true, 12)
                ))),
                new EventInfo(R.string.seeing_is_believing, 13,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_tigrex, true, 100)
                ))),
                new EventInfo(R.string.dont_forget_earplugs, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_yian_garuga, false, 100)
                ))),
                new EventInfo(R.string.monkey_business, 16,
                        true, true, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_furious_rajang, false, 100)
                ))),
                new EventInfo(R.string.mighty_muscle_monkey_business, 16,
                        true, true, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_furious_rajang, true, 100)
                ))),
                new EventInfo(R.string.kadachi_twins, 12,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_tobi_kadachi, false, 100),
                        new CrownInfo(R.drawable.m_viper_tobi_kadachi, true, 100)
                ))),
                new EventInfo(R.string.farawell_to_zinogre, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_zinogre, false, 50),
                        new CrownInfo(R.drawable.m_zinogre, true, 50)
                ))),
                new EventInfo(R.string.brand_new_brute, 16,
                        true, false, new ArrayList<>(Arrays.asList(
                        new CrownInfo(R.drawable.m_brute_tigrex, false, 50),
                        new CrownInfo(R.drawable.m_brute_tigrex, true, 50)
                )))
        );
    }

}