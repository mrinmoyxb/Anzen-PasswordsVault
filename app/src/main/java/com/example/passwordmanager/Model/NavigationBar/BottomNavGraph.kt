package com.example.passwordmanager.Model.NavigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomBarNavigation.Home.route){
        composable(
            route = BottomBarNavigation.Home.route){

        }
    }
}