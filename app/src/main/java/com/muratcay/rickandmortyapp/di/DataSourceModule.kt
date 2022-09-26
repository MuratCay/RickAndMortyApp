package com.muratcay.rickandmortyapp.di

import com.muratcay.rickandmortyapp.data.datasource.rickandmorty.local.RickAndMortyLocalDataSource
import com.muratcay.rickandmortyapp.data.datasource.rickandmorty.local.RickAndMortyLocalDataSourceImpl
import com.muratcay.rickandmortyapp.data.datasource.rickandmorty.remote.RickAndMortyRemoteDataSource
import com.muratcay.rickandmortyapp.data.datasource.rickandmorty.remote.RickAndMortyRemoteDataSourceImpl
import com.muratcay.rickandmortyapp.database.dao.RickAndMortyDao
import com.muratcay.rickandmortyapp.network.service.RickAndMortyService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun providesRemoteDataSource(rickAndMortyService: RickAndMortyService) : RickAndMortyRemoteDataSource {
        return RickAndMortyRemoteDataSourceImpl(rickAndMortyService = rickAndMortyService)
    }

    @Provides
    @Singleton
    fun providesLocalDataSource(rickAndMortyDao: RickAndMortyDao) : RickAndMortyLocalDataSource {
        return RickAndMortyLocalDataSourceImpl(dao = rickAndMortyDao)
    }
}