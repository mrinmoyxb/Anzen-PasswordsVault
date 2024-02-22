package com.example.passwordmanager.Model.Database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface PasswordDao {

    @Upsert
    suspend fun upsertPassword(pass: PasswordData)

    @Delete
    suspend fun deletePassword(pass: PasswordData)

    @Query("SELECT *FROM passwordData WHERE category==:category")
    fun findCategory(category: String): List<PasswordData>
}