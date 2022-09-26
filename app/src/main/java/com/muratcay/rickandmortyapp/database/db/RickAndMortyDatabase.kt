package com.muratcay.rickandmortyapp.database.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.muratcay.rickandmortyapp.core.model.CharacterDetail
import com.muratcay.rickandmortyapp.database.dao.RickAndMortyDao

@Database(
    entities = [CharacterDetail::class],
    version = 1
)
abstract class RickAndMortyDatabase : RoomDatabase() {
    abstract fun rickAndMortyDao(): RickAndMortyDao
}