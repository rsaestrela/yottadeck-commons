package me.estrela.yottadeck.commons.domain


import java.util.*

enum class TrackGenre constructor(vararg descriptions: String) {

    ACID("ACID"),
    HIP_HOP("HIP-HOP"),
    ELECTRO_POP("ELECTRO-POP"),
    FUNK("FUNK"),
    DRUM_N_BASS("DRUM & BASS"),
    WORLD_MUSIC("WORLD MUSIC"),
    BIG_ROOM("BIGROOM"),
    FRENCH("FRENCH"),
    HOUSE("HOUSE"),
    FILTER_HOUSE("FILTER_HOUSE"),
    AFRO("AFRO"),
    AFRO_HOUSE("AFRO HOUSE"),
    DEEP_HOUSE("DEEP HOUSE"),
    SOUL_FUNK_DISCO_HOUSE,
    DETROIT_HOUSE("DETROIT HOUSE"),
    DETROIT("DETROIT"),
    CHICAGO_HOUSE("CHICAGO HOUSE"),
    NY_HOUSE("NY HOUSE"),
    COSMIC_HOUSE("COSMIC HOUSE"),
    DISCO_HOUSE("DISCO HOUSE"),
    TECH_HOUSE("TECHHOUSE"),
    FUNKY_HOUSE("FUNKY HOUSE"),
    ACID_HOUSE("ACID HOUSE"),
    DUB_HOUSE("DUB HOUSE"),
    TECHNO("TECHNO"),
    JAZZY_HOUSE("JAZZY HOUSE"),
    DISCO("DISCO"),
    FUNKY("FUNKY"),
    MINIMAL("MINIMAL"),
    HEADZ("HEADZ"),
    BREAKS("BREAKS"),
    CHICAGO("CHICAGO"),
    EXPERIMENTAL("EXPERIMENTAL"),
    COSMIC("COSMIC"),
    TRIBAL("TRIBAL"),
    NEO_TRANCE("NEOTRANCE"),
    AMBIENT("AMBIENT"),
    EIGHTIES("80S"),
    JAZZ("JAZZ"),
    SOUL("SOUL"),
    VOCAL("VOCAL"),
    ELECTRO("ELECTRO"),
    DUB_TECHNO("DUB_TECHNO"),
    SOULFUL_HOUSE("SOULFUL_HOUSE"),
    NU_DISCO_INDIE_DANCE("NU DISCO INDIE DANCE"),
    CLASSIC_HOUSE("CLASSIC_HOUSE"),
    LOUNGE_CHILL_OUT("LOUGE CHILL HOUSE"),
    AFRO_LATIN_BRAZILIAN("AFRO LATIN BRAZILIAN"),
    PROGRESSIVE_HOUSE("PROGRESSIVE HOUSE"),
    ELECTRO_HOUSE("ELECTRO HOUSE"),
    ELECTRONICA("ELECTRONICA"),
    LEFTFIELD("LEFTFIELD"),
    R_N_B_HIP_HOP("R N B HIP HOP"),
    JACKIN_HOUSE("JACKIN HOUSE"),
    UNAVAILABLE;

    var descriptions: List<String>? = null

    init {
        this.descriptions = Arrays.asList(*descriptions)
    }

    companion object {
        fun lookup(genreDescription: String): TrackGenre {
            for (tg in TrackGenre.values()) {
                if (tg.descriptions!!.contains(genreDescription.toUpperCase())) {
                    return tg
                }
            }
            return UNAVAILABLE
        }
    }

}

