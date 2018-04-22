package me.estrela.yottadeck.commons.domain


enum class TrackGenre constructor(ref: String, description: String, url: String) {

    HOUSE("house", "House", "house"),
    TECHNO("techno", "Techno", "techno"),
    DEEP_HOUSE("deep_house", "Deep House", "deep-house");

    var ref: String = ""
    var description: String = ""
    var url: String = ""

    init {
        this.ref = ref
        this.description = description
        this.url = url
    }

    companion object {

        fun fromRef(genreRef: String): TrackGenre {
            for (tg in TrackGenre.values()) {
                if (tg.ref.toUpperCase() == genreRef.toUpperCase()) {
                    return tg
                }
            }
            throw IllegalStateException("Invalid genre ref!")
        }

        fun fromDescription(genreDescription: String): TrackGenre {
            for (tg in TrackGenre.values()) {
                if (tg.description.toUpperCase() == genreDescription.toUpperCase()) {
                    return tg
                }
            }
            throw IllegalStateException("Invalid genre description!")
        }

        fun fromUrl(genreUrl: String): TrackGenre {
            for (tg in TrackGenre.values()) {
                if (tg.url == genreUrl) {
                    return tg
                }
            }
            throw IllegalStateException("Invalid url!!")
        }
    }

}

