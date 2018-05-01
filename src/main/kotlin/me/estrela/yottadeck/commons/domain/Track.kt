package me.estrela.yottadeck.commons.domain


import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.ObjectIdGenerators
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.index.TextIndexed
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "tracks")
@TypeAlias("track")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator::class, property = "id")
class Track : BaseModel() {

    @Field("vendorId")
    @Indexed(unique = true)
    var vendorId: String? = null

    @TextIndexed
    @Field("artist")
    @Indexed
    var artist: String? = null

    @TextIndexed
    @Field("title")
    @Indexed
    var title: String? = null

    @Field("genres")
    @Indexed
    var genres: Set<TrackGenre>? = null

    @Field("source")
    @Indexed
    var source: String? = null

    @TextIndexed
    @Field("label")
    var label: String? = null

    @Field("mediaType")
    var mediaType: MediaType? = null

    @Field("page")
    var page: String? = null

    @Field("side")
    var side: String? = null

    @Field("bpm")
    var bpm: String? = null

    @Field("recordTitle")
    var recordTitle: String? = null

    @DBRef
    var trackResource: TrackResource? = null

    override fun toString(): String {
        return "Track(vendorId=$vendorId, artist=$artist, title=$title, genres=$genres, source=$source, label=$label, " +
                "mediaType=$mediaType, page=$page, side=$side, bpm=$bpm, recordTitle=$recordTitle, " +
                "trackResource=$trackResource)"
    }
}
