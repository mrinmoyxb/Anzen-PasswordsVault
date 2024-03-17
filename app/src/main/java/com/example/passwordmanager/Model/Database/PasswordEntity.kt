package com.example.passwordmanager.Model.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "passwordsTable")
data class PasswordEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val category: String,
    val appName: String,
    val userName: String,
    val email: String,
    val password: String
)
