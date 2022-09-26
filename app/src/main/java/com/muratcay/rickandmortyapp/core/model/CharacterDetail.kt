package com.muratcay.rickandmortyapp.core.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.muratcay.rickandmortyapp.utils.Constants.RICK_AND_MORTY_TABLE_NAME
import com.squareup.moshi.Json

@Entity(tableName = RICK_AND_MORTY_TABLE_NAME)
data class CharacterDetail(
    @Json(name = "created")
    val created: String?,
    @Json(name = "gender")
    val gender: String?,
    @Json(name = "id")
    @PrimaryKey
    val id: Int?,
    @Json(name = "image")
    val image: String?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "species")
    val species: String?,
    @Json(name = "status")
    val status: String?,
    @Json(name = "type")
    val type: String?,
    @Json(name = "url")
    val url: String?
)