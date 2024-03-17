package com.example.passwordmanager.ViewModel.AddPassword

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.passwordmanager.Model.Database.PasswordDao
import com.example.passwordmanager.Model.Database.PasswordEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class AddPasswordViewModel(private val passwordDao: PasswordDao): ViewModel() {
    fun addPasswordToDatabase(category: String, appName: String, userName: String, email: String, password: String) {
        viewModelScope.launch {
            passwordDao.insertIntoDatabase(PasswordEntity(0, category, appName, userName, email, password))
        }
    }
    fun deletePasswordFromDatabase(id: Int){
        viewModelScope.launch{
            passwordDao.deleteFromDatabase(id)
        }
    }
    val getSocials: Flow<List<PasswordEntity>> = passwordDao.showSocials()
    val getPayments: Flow<List<PasswordEntity>> = passwordDao.showPayments()
    val getApps: Flow<List<PasswordEntity>> = passwordDao.showApps()
    val getDocuments: Flow<List<PasswordEntity>> = passwordDao.showDocuments()
}