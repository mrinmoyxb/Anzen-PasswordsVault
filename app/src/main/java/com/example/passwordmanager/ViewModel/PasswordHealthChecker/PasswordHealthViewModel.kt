package com.example.passwordmanager.ViewModel.PasswordHealthChecker

import androidx.compose.ui.res.colorResource
import androidx.lifecycle.ViewModel
import com.example.passwordmanager.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class PasswordHealthViewModel : ViewModel() {

    private val regex = Regex("[!@#$%^&*()_+{}\":;'<>?,./]")

    // Password
    var userPassword = MutableStateFlow("")
    val _userPassword: StateFlow<String> = userPassword

    // 1. Uppercase
    private var uppercaseState = MutableStateFlow(false)
    val _uppercaseState: StateFlow<Boolean> = uppercaseState

    private var uppercaseCount = MutableStateFlow(0)
    val _uppercaseCount: StateFlow<Int> = uppercaseCount

    //2. Lowercase
    private var lowercaseState = MutableStateFlow(false)
    val _lowercaseState: StateFlow<Boolean> = lowercaseState

    private var lowercaseCount = MutableStateFlow(0)
    val _lowercaseCount: StateFlow<Int> = lowercaseCount

    // 3. Numbers
    private var numbersState = MutableStateFlow(false)
    val _numbersState: StateFlow<Boolean> = numbersState

    private var numbersCount = MutableStateFlow(0)
    val _numbersCount: StateFlow<Int> = numbersCount

    // 4. Symbols
    private var symbolsState = MutableStateFlow(false)
    val _symbolsState: StateFlow<Boolean> = symbolsState

    private var symbolsCount = MutableStateFlow(0)
    val _symbolsCount: StateFlow<Int> = symbolsCount

    // 5. Length
    var lengthOfPassword = MutableStateFlow(0)
    val _lengthOfPassword: StateFlow<Int> = lengthOfPassword

    // 6. Complexity Score: Not completed
    private var countScore = MutableStateFlow(0)
    val _countScore: StateFlow<Int> = countScore

    // 7. Strength
    private var strength = MutableStateFlow("")
    var _strength: StateFlow<String> = strength

    // 8. Time to crack
    private var timeToCrack = MutableStateFlow("")
    var _timeToCrack: StateFlow<String> = timeToCrack

    //9. Complexity Score:
    private var complexityScore = MutableStateFlow(0.0)
    var _complexityScore: StateFlow<Double> = complexityScore


    // Methods:
    // 1. Length of password
    private fun lengthPassword() {
        lengthOfPassword.value = _userPassword.value.length
    }

    // 2.function to check type and number of characters in password
    private fun checkCharacters() {
        uppercaseState.value = false
        uppercaseCount.value = 0
        lowercaseState.value = false
        lowercaseCount.value = 0
        numbersState.value = false
        numbersCount.value = 0
        symbolsState.value = false
        symbolsCount.value = 0
        for (char in _userPassword.value) {
            if (char.isUpperCase()) {
                uppercaseState.value = true
                uppercaseCount.value++
            }
            if (char.isLowerCase()) {
                lowercaseState.value = true
                lowercaseCount.value++
            }
            if (char.isDigit()) {
                numbersState.value = true
                numbersCount.value++
            }
            if (regex.containsMatchIn(char.toString())) {
                symbolsState.value = true
                symbolsCount.value++
            }

        }
    }


    // 3. Strength and time to crack:
    private fun reportPass() {
        when (_lengthOfPassword.value) {
            in 1..7 -> {
                strength.value = "Very Weak"
                timeToCrack.value = "Seconds to minutes"
            }

            in 8..10 -> {
                strength.value = "Weak"
                timeToCrack.value = "Hours to days"
            }

            in 11..13 -> {
                strength.value = "Good"
                timeToCrack.value = "Months to years"
            }

            in 14..50 -> {
                strength.value = "Strong"
                timeToCrack.value = "Centuries"
            }

            else -> {
                strength.value = ""
                timeToCrack.value = ""
            }
        }

    }

    // 4. Calculate complexity score:
    private fun calculateCountScore() {
        countScore.value = 0
        if (_uppercaseCount.value > 0) {
            countScore.value++
        }
        if (_lowercaseCount.value > 0) {
            countScore.value++
        }
        if (_numbersCount.value > 0) {
            countScore.value++
        }
        if (_symbolsCount.value > 0) {
            countScore.value++
        }
    }


    private fun complexityScore(){
        complexityScore.value = 0.0
        val elementScore: Double = 6.25 // this score is based on different types of characters; if there is num and lowercase so 6.25*2 here 2(num+lowercase)
        var veryWeakLengthScore: Double = 0.0
        var weakLengthScore: Double = 25.0
        var goodLengthScore: Double = 50.0
        var strongLengthScore: Double = 75.0

        if(_lengthOfPassword.value<=7){
            complexityScore.value  = veryWeakLengthScore+elementScore*countScore.value

        }
        else if(_lengthOfPassword.value>=8 && _lengthOfPassword.value<=10){
            complexityScore.value  = weakLengthScore+elementScore*countScore.value
            //complexityScore.value = finalScore
        }
        else if(_lengthOfPassword.value>=11 && _lengthOfPassword.value<=13){
            complexityScore.value  = goodLengthScore+elementScore*countScore.value
            //complexityScore.value = finalScore
        }
        else if(_lengthOfPassword.value>=14 && _lengthOfPassword.value<=50){
            complexityScore.value  = strongLengthScore+elementScore*countScore.value
            //complexityScore.value = finalScore
        }
        //finalScore = 0.0
    }

    // 6. CalculateButton
    fun calculateButton() {
        lengthPassword()
        checkCharacters()
        calculateCountScore()
        reportPass()
        complexityScore()
    }
}


// 5. Complexity Score
//    private fun complexityScore(){
//        val c: Double = 6.25
//        var finalScore: Double = 0.0
//        var veryWeakLengthScore: Double = 0.0
//        var weakLengthScore: Double = 25.0
//        var goodLengthScore: Double = 50.0
//        var strongLengthPassword: Double = 75.0
//
//        if(_lengthOfPassword.value<=7){
//            for(i in 1.._countScore.value){
//                finalScore += c
//            }
//            complexityScore.value = finalScore
//        }
//        else if(_lengthOfPassword.value>=8 && _lengthOfPassword.value<=10){
//            finalScore = 25.0
//            for(i in 1.._countScore.value){
//                finalScore += c
//            }
//            complexityScore.value = finalScore
//        }
//        else if(_lengthOfPassword.value>=11 && _lengthOfPassword.value<=13){
//            finalScore = 50.0
//            for(i in 1.._countScore.value){
//                finalScore += c
//            }
//            complexityScore.value = finalScore
//        }
//        else if(_lengthOfPassword.value>=14 && _lengthOfPassword.value<=50){
//            finalScore = 75.0
//            for(i in 1.._countScore.value){
//                finalScore += c
//            }
//            complexityScore.value = finalScore
//        }
//    }