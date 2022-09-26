package com.muratcay.rickandmortyapp.network.service

import com.muratcay.rickandmortyapp.core.model.CharacterDetail
import com.muratcay.rickandmortyapp.core.model.CharacterResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyService {

    @GET("character")
    suspend fun getAllCharacters(): Single<CharacterResponse>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Single<CharacterDetail>
}