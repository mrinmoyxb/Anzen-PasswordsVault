package com.example.passwordmanager.ViewModel.PasswordGenerator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlin.random.Random

class PasswordGeneratorViewModel: ViewModel() {

    var generatedPassword = MutableStateFlow("********")
    var _generatedPassword: StateFlow<String> = generatedPassword

    var uppercaseState = MutableStateFlow(false)
    var _uppercaseState: StateFlow<Boolean> = uppercaseState

    var lowercaseState = MutableStateFlow(false)
    var _lowercaseState: StateFlow<Boolean> = lowercaseState

    var symbolState = MutableStateFlow(false)
    var _symbolState: StateFlow<Boolean> = symbolState

    var numberState = MutableStateFlow(false)
    var _numberState: StateFlow<Boolean> = numberState

    var lengthState = MutableStateFlow(8)
    val _lengthState: StateFlow<Int> = lengthState


    val lowercase = ('a'..'z').toList()
    val uppercase = ('A'..'Z').toList()
    val numbers = ('0'..'9').toList()
    val symbols = listOf<Char>('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+','=','{','}','[',']','|','\\',':',';','"','\'','<','>', '.', ',', '?')


    fun uppercaseOnClick() {
        uppercaseState.value = !uppercaseState.value
    }

    fun lowercaseOnClick() {
        lowercaseState.value = !lowercaseState.value
    }

    fun symbolOnClick() {
        symbolState.value = !symbolState.value
    }

    fun numberOnClick() {
        numberState.value = !numberState.value
    }

    
    fun generateRandomPassword() {
            val characters = mutableListOf<Char>()
            if (_lowercaseState.value) {
                characters.addAll('a'..'z')
            }

            if (_uppercaseState.value) {
                characters.addAll('A'..'Z')
            }

            if (_symbolState.value) {
                characters.addAll(symbols)
            }

            if (_numberState.value) {
                characters.addAll('0'..'9')
            }

            val random = Random
            val password =
                (1.._lengthState.value).map { characters.random(random) }.joinToString("")

            generatedPassword.value = password
        }
    }



