package com.example.passwordmanager.Model.NavigationBar

import androidx.annotation.DrawableRes
import com.example.passwordmanager.R

sealed class BottomBarNavigation(
    val route: String,
    val title: String,
    @DrawableRes val icon: Int
){
    object Home: BottomBarNavigation(
        route = "home",
        title = "Home",
        icon = R.drawable.home
    )

    object PasswordGenerator: BottomBarNavigation(
        route = "passwordGenerator",
        title = "PasswordGenerator",
        icon = R.drawable.key_img
    )

    object PasswordChecker: BottomBarNavigation(
        route = "PasswordChecker",
        title = "PasswordChecker",
        icon = R.drawable.shield
    )
}