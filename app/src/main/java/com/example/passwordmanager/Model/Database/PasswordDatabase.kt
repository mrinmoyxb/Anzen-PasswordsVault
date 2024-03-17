package com.example.passwordmanager.Model.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [PasswordEntity::class], version = 1, exportSchema = false)
abstract class PasswordDatabase : RoomDatabase() {
    abstract fun passwordDao(): PasswordDao

    companion object {
        private const val DATABASE_NAME = "password-database"

        @Volatile
        private var instance: PasswordDatabase? = null

        fun getInstance(context: Context): PasswordDatabase {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context).also { instance = it }
            }
        }

        private fun buildDatabase(context: Context): PasswordDatabase {
            return Room.databaseBuilder(context, PasswordDatabase::class.java, DATABASE_NAME)
                .build()
        }
    }
}