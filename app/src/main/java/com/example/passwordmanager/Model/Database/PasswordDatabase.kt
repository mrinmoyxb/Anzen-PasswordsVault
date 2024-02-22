package com.example.passwordmanager.Model.Database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [(PasswordData::class)], version=1)
abstract class PasswordDatabase: RoomDatabase() {

    abstract val dao: PasswordDao
}