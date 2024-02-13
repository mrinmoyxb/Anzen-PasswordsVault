package com.example.passwordmanager.View.PasswordHealth



fun main() {
    val password: String = "12345ab"
    val regex = Regex("[!@#$%^&*()_+{}\":;'<>?,./]")

    var upperCase: Boolean = false
    var upperCount: Int = 0

    var lowerCase: Boolean = false
    var lowerCount: Int = 0

    var numbers: Boolean = false
    var numberCount: Int = 0

    var symbols: Boolean = false
    var symbolsCount: Int = 0


    val length: Int = password.length
    println("length: $length")



    for(char in password){
        if(char.isUpperCase()){
            upperCase = true
            upperCount++
        }
        else if(char.isLowerCase()){
            lowerCase = true
            lowerCount++
        }
        else if(char.isDigit()){
            numbers = true
            numberCount++
        }
        else if(regex.containsMatchIn(char.toString())){
            symbols = true
            symbolsCount++
        }
    }

    println("Uppercase: $upperCase")
    println("Lowercase: $lowerCase")
    println("Numbers: $numbers")
    println("symbols: $symbols")

    println()
    println("Password Details: ")
    println("password: $password")
    println("length: $length")
    println("upper: $upperCount")
    println("lower: $lowerCount")
    println("numbers: $numberCount")
    println("symbols: $symbolsCount")

    println()
    calPass(10, 20, 0, 2)
}

fun calPass(u: Int, l: Int, n: Int, s: Int){
    var complexity = 0
    if(u>0){
        complexity++
        println("y1")
    }
    if(l>0){
        complexity++
        println("y2")
    }
    if(n>0){
        complexity++
        println("y3")
    }
    if(s>0){
        complexity++
        println("y4")
    }
    println("Complexity score: $complexity")
}