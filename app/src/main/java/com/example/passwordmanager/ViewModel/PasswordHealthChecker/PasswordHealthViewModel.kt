package com.example.passwordmanager.ViewModel.PasswordHealthChecker

import androidx.compose.ui.res.colorResource
import androidx.lifecycle.ViewModel
import com.example.passwordmanager.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class PasswordHealthViewModel : ViewModel() {

    val regex = Regex("[!@#$%^&*()_+{}\":;'<>?,./]")

    // Password
    var userPassword = MutableStateFlow("")
    val _userPassword: StateFlow<String> = userPassword

    // 1. Uppercase
    var uppercaseState = MutableStateFlow(false)
    val _uppercaseState: StateFlow<Boolean> = uppercaseState

    var uppercaseCount = MutableStateFlow(0)
    val _uppercaseCount: StateFlow<Int> = uppercaseCount

    //2. Lowercase
    var lowercaseState = MutableStateFlow(false)
    val _lowercaseState: StateFlow<Boolean> = lowercaseState

    var lowercaseCount = MutableStateFlow(0)
    val _lowercaseCount: StateFlow<Int> = lowercaseCount

    // 3. Numbers
    var numbersState = MutableStateFlow(false)
    val _numbersState: StateFlow<Boolean> = numbersState

    var numbersCount = MutableStateFlow(0)
    val _numbersCount: StateFlow<Int> = numbersCount

    // 4. Symbols
    var symbolsState = MutableStateFlow(false)
    val _symbolsState: StateFlow<Boolean> = symbolsState

    var symbolsCount = MutableStateFlow(0)
    val _symbolsCount: StateFlow<Int> = symbolsCount

    // 5. Length
    var lengthOfPassword = MutableStateFlow(0)
    val _lengthOfPassword: StateFlow<Int> = lengthOfPassword

    // 6. Complexity Score: Not completed
    var countScore = MutableStateFlow(0)
    val _countScore: StateFlow<Int> = countScore

    // 7. Strength
    var strength = MutableStateFlow("")
    var _strength: StateFlow<String> = strength

    // 8. Time to crack
    var timeToCrack = MutableStateFlow("")
    var _timeToCrack: StateFlow<String> = timeToCrack


    // Methods:
    // 1. Length of password
    fun lengthPassowrd() {
        lengthOfPassword.value = _userPassword.value.length
    }

    // 2.function to check type and number of characters in password
    fun checkCharacters() {
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

    // 3. Calculate complexity score:
    fun calculateCountScore() {
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

    // 4. Strength and time to crack:
    fun reportPass() {
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
    // 5. CalculateButton
    fun calculateButton() {
        lengthPassowrd()
        checkCharacters()
        calculateCountScore()
        reportPass()
    }
}