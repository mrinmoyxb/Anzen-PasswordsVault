package com.example.passwordmanager.NavigationBar

import androidx.annotation.DrawableRes
import com.example.passwordmanager.R

sealed class BottomBarScreens(
    val route: String,
    val title: String,
    val icon_title: String,
    @DrawableRes val icon: Int
){
    object Home: BottomBarScreens(
        route = "home",
        title = "Home",
        icon_title = "Home",
        icon = R.drawable.home
    )

    object PasswordGenerator: BottomBarScreens(
        route = "passwordGenerator",
        title = "PasswordGenerator",
        icon_title = "Password Generator",
        icon = R.drawable.key_img
    )

    object PasswordHealth: BottomBarScreens(
        route = "passwordHealth",
        title = "PasswordHealth",
        icon_title = "Password Health",
        icon = R.drawable.shield
    )
}