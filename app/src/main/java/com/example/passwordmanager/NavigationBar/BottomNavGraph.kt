package com.example.passwordmanager.NavigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.passwordmanager.View.HomeScreen.HomeScreen.HomeScreen
import com.example.passwordmanager.View.PassWordGenerator.PassWordGeneratorScreen.PasswordGeneratorScreen
import com.example.passwordmanager.View.PasswordHealth.PasswordHealthScreen.PasswordHealthScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomBarScreens.Home.route){
        composable(
            route = BottomBarScreens.Home.route){
            HomeScreen()
        }
        composable(
            route = BottomBarScreens.PasswordGenerator.route){
            PasswordGeneratorScreen()
        }
        composable(
            route = BottomBarScreens.PasswordHelath.route){
            PasswordHealthScreen()
        }
    }
}

