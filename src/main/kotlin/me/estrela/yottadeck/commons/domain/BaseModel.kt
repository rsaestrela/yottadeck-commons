package me.estrela.yottadeck.commons.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.annotation.Version
import org.springframework.data.mongodb.core.mapping.Field
import org.springframework.data.mongodb.core.mapping.TextScore
import java.io.Serializable
import java.util.*

abstract class BaseModel : Serializable {

    @Id
    var id: String? = null

    @CreatedDate
    @Field("created")
    var created: Date? = null

    @LastModifiedDate
    @Field("updated")
    var updated: Date? = null

    @Version
    @Field("version")
    var version: Int? = null

    @TextScore
    @Field("score")
    var score: Float? = null

}
