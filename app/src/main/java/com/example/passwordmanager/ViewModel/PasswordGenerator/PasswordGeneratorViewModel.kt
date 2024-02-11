package com.example.passwordmanager.ViewModel.PasswordGenerator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlin.random.Random

class PasswordGeneratorViewModel: ViewModel() {

    var generatedPassword = MutableStateFlow("")
    val _generatedPassword: StateFlow<String> = generatedPassword

    private var uppercaseState = MutableStateFlow(false)
    val _uppercaseState: StateFlow<Boolean> = uppercaseState

    private var lowercaseState = MutableStateFlow(false)
    val _lowercaseState: StateFlow<Boolean> = lowercaseState

    private var symbolState = MutableStateFlow(false)
    val _symbolState: StateFlow<Boolean> = symbolState

    private var numberState = MutableStateFlow(false)
    val _numberState: StateFlow<Boolean> = numberState

    private var lengthState = MutableStateFlow(8)
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

    fun setLengthState(l: Int) {
        lengthState.value = l
    }

    @Composable
    fun GeneratePassword() {
        LaunchedEffect(_lengthState, _uppercaseState, _lowercaseState, _symbolState, _numberState) {
            val characters = mutableListOf<Char>()
            if (_lowercaseState.value) {
                characters.addAll(lowercase)
            }

            if (_uppercaseState.value) {
                characters.addAll(uppercase)
            }

            if (_symbolState.value) {
                characters.addAll(symbols)
            }

            if (_numberState.value) {
                characters.addAll(numbers)
            }

//            if(characters.isEmpty()){
//                return@LaunchedEffect
//            }

            val random = Random
            val password =
                (1.._lengthState.value).map { characters.random(random) }.joinToString("")

            generatedPassword.value = password
        }
    }
}


//}


