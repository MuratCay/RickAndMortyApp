package com.muratcay.rickandmortyapp.data.repository

import com.muratcay.rickandmortyapp.data.datasource.rickandmorty.local.RickAndMortyLocalDataSource
import com.muratcay.rickandmortyapp.data.datasource.rickandmorty.remote.RickAndMortyRemoteDataSource
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(
    private val rickAndMortyLocalDataSource: RickAndMortyLocalDataSource,
    private val rickAndMortyRemoteDataSource: RickAndMortyRemoteDataSource
) : RickAndMortyRepository {

}