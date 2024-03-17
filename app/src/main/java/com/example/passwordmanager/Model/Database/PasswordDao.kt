package com.example.passwordmanager.Model.Database

import android.os.FileObserver.DELETE
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface PasswordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertIntoDatabase(pass: PasswordEntity)

    @Query("DELETE FROM passwordsTable WHERE id = :id")
    suspend fun deleteFromDatabase(id: Int)

    @Query("SELECT *FROM passwordsTable WHERE category = 'Social'")
    fun showSocials(): Flow<List<PasswordEntity>>

    @Query("SELECT *FROM passwordsTable WHERE category = 'Payment'")
    fun showPayments(): Flow<List<PasswordEntity>>

    @Query("SELECT *FROM passwordsTable WHERE category = 'App'")
    fun showApps(): Flow<List<PasswordEntity>>

    @Query("SELECT *FROM passwordsTable WHERE category = 'Document'")
    fun showDocuments(): Flow<List<PasswordEntity>>

}