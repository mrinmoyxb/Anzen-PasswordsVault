package com.example.passwordmanager.NavigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.passwordmanager.View.HomeScreen.HomeScreen.HomeScreen
import com.example.passwordmanager.View.NewPassword.NewPasswordScreen.NewPasswordScreen


@Composable
fun FloatingButtonNavigation(navController:NavHostController){
    NavHost(navController = navController, startDestination = "home"){
        composable(route = "home"){
            HomeScreen()
        }
        composable(route = "newPassword"){
            NewPasswordScreen()
        }
    }
}