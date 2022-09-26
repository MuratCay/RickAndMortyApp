package com.muratcay.rickandmortyapp.di

import com.muratcay.rickandmortyapp.data.datasource.rickandmorty.local.RickAndMortyLocalDataSource
import com.muratcay.rickandmortyapp.data.datasource.rickandmorty.remote.RickAndMortyRemoteDataSource
import com.muratcay.rickandmortyapp.data.repository.RickAndMortyRepository
import com.muratcay.rickandmortyapp.data.repository.RickAndMortyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providesRickAndMortyRepository(
        rickAndMortyLocalDataSource: RickAndMortyLocalDataSource,
        rickAndMortyRemoteDataSource: RickAndMortyRemoteDataSource
    ): RickAndMortyRepository {
        return RickAndMortyRepositoryImpl(rickAndMortyLocalDataSource, rickAndMortyRemoteDataSource)
    }
}