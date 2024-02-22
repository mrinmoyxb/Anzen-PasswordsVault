package com.example.passwordmanager.Model.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "passwordData")
data class PasswordData(
    val category: String,
    val appName: String,
    val email: String,
    val username: String,
    val password: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
