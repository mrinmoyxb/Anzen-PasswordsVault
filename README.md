
# 🔐 Anzen - PasswordsVault

Juggling secure passwords for all our online accounts is a constant battle. We need complex combinations of letters, numbers, and symbols to thwart hackers, but those very elements make them difficult to remember. We're stuck between creating passwords so secure they're like cryptic puzzles, or resorting to weak, easily guessed options. It's a frustrating tightrope walk between security and convenience. That's where Anzen comes in. 

An Android application built using **`Kotlin and Jetpack Compose`** that can store and generate passwords as well as check your passwords health.


## 🎯 Objectives

There are three main objectives of this project:

* First objective of this project is to **`store passwords`** using Room Database.

* Second objective of this project is to **`generate random passwords`** based on length, uppercase, lowercase, numbers or symbols selected by the user.

* And the final objective, to build a metric known as **`complexity score`**, that will calculate the strength of passwords provided by the user.
## 🛠️ Technologies

* **`Kotlin`**
* **`Jetpack Compose`**
* **`Room Database`**

## 🎨 UI/UX

![Untitled-1](https://github.com/mrinmoyxb/bitpass/assets/141025752/8c7e56ef-5294-47d9-b64b-2bb0787f04e5)

## 🔍 About Application

* This Android Application allows user to store passwords into four different categories: Social, Payments, Apps and Documents. Users can aslo generate random passwords upto length 20 based on different combinations of uppercase, lowercase, numbers and symbols. We can also check passwords health and measure complexity score, higher the complexity score, higher the strength.

* The entire application was built using Kotlin and Jetpack Compose.

**`Complexity Score Algorithm:`** 
* This algorithm was created to measure the strength of password based on length and types of elements used in the password.

**`Element Score`** in Complexity Score is the minimum score provided for the types of elements used in the password. It's value is 6.25.
* Example: if the password is `pass123`, Here there are two types of elements are used: lowercase and numbers, hence it will be calcuated as 6.25*2 which is equal to 12.5, 1 for lowercase and 1 for number.

**`Score assigned based on length`**
* If the length of password is between 1 to 7 score is: 0.0

* If the length of password is between 8 to 10 score is: 25.0

* If the length of password is between 11 to 13 score is: 50.0

* If the length of password is between 14 to 50 score is: 75.0

For the above password `pass123`, the length is 7 so it's score assigned based on length is 0.0. The sum of element score and score based on length leads to it's final score which is 0.0+12.5 = 12.5.

Complexity Score of password `pass123` is 12.5
```
        {
            val elementScore: Double = 6.25 
            var veryWeakLengthScore: Double = 0.0
            var weakLengthScore: Double = 25.0
            var goodLengthScore: Double = 50.0
            var strongLengthScore: Double = 75.0
            lengthOfPassword.value = userPassword.value.length
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
            if (_lengthOfPassword.value in 1..7) { // 0 - 25
                val vw = veryWeakLengthScore + (elementScore * countScore.value)
                complexityScore.value = vw
            }
            if (_lengthOfPassword.value in 8..10) { // 26 - 50
                val w = weakLengthScore + (elementScore * countScore.value)
                complexityScore.value = w
            }
            if (_lengthOfPassword.value in 11..13) { // 51 - 75
                val g = goodLengthScore + (elementScore * countScore.value)
                complexityScore.value = g
            }
            if (_lengthOfPassword.value in 14..50) { // 76 - 100
                val s = strongLengthScore + (elementScore * countScore.value)
                complexityScore.value = s
            }
        }
    }
```


## 🧑‍💻 What I Learned

I learnt two most important concepts `MVVM` software architectural pattern and how to implement `Room Database` in Android Apps.

**`MVVM(Model-View-ViewModel)`**

* MVVM is a software architectural pattern that promotes separation of concerns, making your Android applications more maintainable, testable, and flexible. Here's a breakdown of its key components:

* **`Model:`** Encapsulates the data and business logic of our app. It can include plain data objects (POJOs), database models, or other representations of our application's core data. The Model typically doesn't have direct interaction with the View or ViewModel.

* **`View:`** Represents the user interface (UI) elements. This includes Activity and Fragment layouts, along with UI components like buttons, text views, and image views. The View displays data provided by the ViewModel and handles user interactions by notifying the ViewModel.

* **`ViewModel:`** Acts as the intermediary between the Model and the View. It prepares data for the View in a consumable way, handles user interactions by fetching or updating data from the Model, and exposes observable data streams (often using LiveData) to the View for automatic UI updates. Unlike the Presenter in MVP, the ViewModel doesn't hold a direct reference to the View, promoting a looser coupling.

**`Room Database`**

* Room is a persistence library developed by Google as part of the Android Jetpack suite. It acts as an abstraction layer on top of SQLite, a relational database management system, simplifying interactions with databases within Android applications.

* `Object-Relational Mapping (ORM):` Room maps database tables to Java/Kotlin classes, enabling developers to interact with data using objects instead of raw SQL statements. This simplifies data access and manipulation.

* `Compile-time verification:` Room verifies SQL queries during compilation, preventing errors from going unnoticed until runtime. This improves code reliability and maintainability.

* `DAO (Data Access Object):` While Room simplifies database interactions, it's recommended to use DAO classes within our application. DAOs provide a structured way to perform CRUD (Create, Read, Update, Delete) operations on our data.
## ✨ Contributions

Contributions are welcome! If you’d like to add new feature or improve existing ones, feel free to submit a pull request. Drop a like and follow me on the github.

Happy coding! 🚀
