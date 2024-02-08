package com.example.passwordmanager.ViewModel.PasswordGenerator

import androidx.lifecycle.ViewModel

class PasswordGeneratorViewModel: ViewModel(){
    private var uppercase: Boolean = false
    private var lowercase: Boolean = false
    private var symbol: Boolean = false
    private var numbers: Boolean = false

    fun uppercaseOnClick(){
        uppercase = !uppercase
    }

    fun lowercaseOnClick(){
        lowercase = !lowercase
    }

    fun symbolOnClick(){
        symbol = !symbol
    }

    fun numbersOnClick(){
        numbers = !numbers
    }


}