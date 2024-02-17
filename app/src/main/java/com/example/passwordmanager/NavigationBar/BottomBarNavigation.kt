package com.example.passwordmanager.NavigationBar

import androidx.annotation.DrawableRes
import com.example.passwordmanager.R

sealed class BottomBarScreens(
    val route: String,
    val title: String,
    @DrawableRes val icon: Int
){
    object Home: BottomBarScreens(
        route = "home",
        title = "Home",
        icon = R.drawable.home
    )

    object PasswordGenerator: BottomBarScreens(
        route = "passwordGenerator",
        title = "PasswordGenerator",
        icon = R.drawable.key_img
    )

    object PasswordHelath: BottomBarScreens(
        route = "passwordHelath",
        title = "PasswordHelath",
        icon = R.drawable.shield
    )
}