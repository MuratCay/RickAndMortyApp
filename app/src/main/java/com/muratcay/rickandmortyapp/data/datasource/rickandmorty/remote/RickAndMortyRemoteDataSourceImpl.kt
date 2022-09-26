package com.muratcay.rickandmortyapp.data.datasource.rickandmorty.remote

import com.muratcay.rickandmortyapp.network.service.RickAndMortyService
import javax.inject.Inject

class RickAndMortyRemoteDataSourceImpl @Inject constructor(
    private val rickAndMortyService: RickAndMortyService
) : RickAndMortyRemoteDataSource {

}