package me.estrela.yottadeck.commons.domain


import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.ObjectIdGenerators
import org.springframework.data.annotation.TypeAlias
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "trackResources")
@TypeAlias("trackResource")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator::class, property = "id")
class TrackResource : BaseModel() {

    @Field("preview")
    var previews: List<String> = ArrayList()

    @Field("status")
    var status: String? = null

    @Field("position")
    var position: Int = 0

}
