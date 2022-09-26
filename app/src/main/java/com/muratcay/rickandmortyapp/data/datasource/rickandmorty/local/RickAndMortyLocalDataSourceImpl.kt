package com.muratcay.rickandmortyapp.data.datasource.rickandmorty.local

import com.muratcay.rickandmortyapp.database.dao.RickAndMortyDao
import javax.inject.Inject

class RickAndMortyLocalDataSourceImpl @Inject constructor(
    private val dao: RickAndMortyDao
) : RickAndMortyLocalDataSource {

}