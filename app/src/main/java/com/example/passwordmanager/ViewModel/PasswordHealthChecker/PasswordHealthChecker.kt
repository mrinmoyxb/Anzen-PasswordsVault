package com.example.passwordmanager.ViewModel.PasswordHealthChecker

import androidx.lifecycle.ViewModel


class PasswordChecker : ViewModel() {
    var password: String = ""

    var uppercase: Boolean = false
    var uppercount: Int = 0

    var lowercase: Boolean = false
    var lowercount: Int = 0

    var numbers: Boolean = false
    var numberCount: Int = 0

    var symbols: Boolean = false
    var symbolsCount: Int = 0

    val regex = Regex("[!@#$%^&*()_+{}\":;'<>?,./]")
    var length: Int = 0
    var complexityScore: Int = 0

    // 1. Length of password
    fun lengthPassowrd(){
        length = password.length
    }

    // 2.function to check type and number of characters in password
    fun checkCharacters(){
        for(char in password){
            if(char.isUpperCase()){
                uppercase=true
                uppercount++
            }
            else if(char.isLowerCase()){
                lowercase=true
                lowercount++
            }
            else if(char.isDigit()){
                numbers=true
                numberCount++
            }
            else if(regex.containsMatchIn(char.toString())){
                symbols=true
                symbolsCount++
            }

        }
    }

    // 3. Calculate complexity score:
    fun calculateComplexityScore(){
        if(uppercount>0){
            complexityScore++
        }
        if(lowercount>0){
            complexityScore++
        }
        if(numberCount>0){
            numberCount++
        }
        if(symbolsCount>0){
            symbolsCount++
        }
    }

    // 4. CalculateButton
    fun calculateButton(){
        lengthPassowrd()
        checkCharacters()
        calculateComplexityScore()
    }



}