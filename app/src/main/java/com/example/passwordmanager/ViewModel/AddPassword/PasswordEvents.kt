package com.example.passwordmanager.ViewModel.AddPassword

import com.example.passwordmanager.Model.Database.PasswordData

sealed class PasswordEvents{
    data class savePassword(val category: String, val appName: String,
                            val email: String, val username: String, val password: String): PasswordEvents()

    data class deletePassword(val pass: PasswordData): PasswordEvents()
}