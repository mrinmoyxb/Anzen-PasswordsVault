package com.example.passwordmanager.NavigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.passwordmanager.View.HomeScreen.HomeScreen.HomeScreen
import com.example.passwordmanager.View.NewPassword.NewPasswordScreen.NewPasswordScreen
import com.example.passwordmanager.View.PassWordGenerator.PassWordGeneratorScreen.PasswordGeneratorScreen
import com.example.passwordmanager.View.PasswordHealth.PasswordHealthScreen.PasswordHealthScreen

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomBarScreensData.Home.route){
        composable(
            route = BottomBarScreensData.Home.route){
            HomeScreen()
        }
        composable(
            route = BottomBarScreensData.PasswordGenerator.route){
            PasswordGeneratorScreen()
        }
        composable(
            route = BottomBarScreensData.PasswordHealth.route){
            PasswordHealthScreen()
        }
        composable(route = "newPassword"){
            NewPasswordScreen()
        }
    }
}

