package com.example.passwordmanager.NavigationBar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.passwordmanager.Model.Database.PasswordDatabase
import com.example.passwordmanager.View.HomeScreen.HomeScreen.HomeScreen
import com.example.passwordmanager.View.NewPassword.NewPasswordScreen.NewPasswordScreen
import com.example.passwordmanager.View.NewPassword.SavedPasswords.SavePasswordScreens.SavedPasswordScreen
import com.example.passwordmanager.View.PassWordGenerator.PassWordGeneratorScreen.PasswordGeneratorScreen
import com.example.passwordmanager.View.PasswordHealth.PasswordHealthScreen.PasswordHealthScreen
import com.example.passwordmanager.ViewModel.AddPassword.AddPassword

@Composable
fun BottomNavGraph(navController: NavHostController){
    val context = LocalContext.current
    val viewModel = AddPassword(PasswordDatabase.getInstance(context).passwordDao())

    var getSocial = viewModel.getSocials.collectAsState(emptyList())
    var getApp = viewModel.getApps.collectAsState(emptyList())
    var getPayments = viewModel.getPayments.collectAsState(emptyList())
    var getDocument = viewModel.getDocuments.collectAsState(emptyList())

    NavHost(navController = navController, startDestination = BottomBarScreensData.Home.route){
        composable(
            route = BottomBarScreensData.Home.route){
            HomeScreen(navController)
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
            NewPasswordScreen(viewModel)
        }
        composable(route = "savedPasswordSocial"){
            SavedPasswordScreen(categoryName = "Social", getSocial.value)
        }
        composable(route = "savedPasswordApps"){
            SavedPasswordScreen(categoryName = "Apps", getApp.value)
        }
        composable(route = "savedPasswordPayments"){
            SavedPasswordScreen(categoryName = "Payments", getPayments.value)
        }
        composable(route = "savedPasswordDocuments"){
            SavedPasswordScreen(categoryName = "Documents", getDocument.value)
        }
    }
}

