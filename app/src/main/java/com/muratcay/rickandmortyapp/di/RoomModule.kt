package com.muratcay.rickandmortyapp.di

import android.content.Context
import androidx.room.Room
import com.muratcay.rickandmortyapp.database.dao.RickAndMortyDao
import com.muratcay.rickandmortyapp.database.db.RickAndMortyDatabase
import com.muratcay.rickandmortyapp.utils.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun movieDatabase(@ApplicationContext context: Context): RickAndMortyDatabase =
        Room.databaseBuilder(context, RickAndMortyDatabase::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun provideDao(db: RickAndMortyDatabase): RickAndMortyDao = db.rickAndMortyDao()
}