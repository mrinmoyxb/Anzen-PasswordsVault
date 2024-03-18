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
import com.example.passwordmanager.ViewModel.AddPassword.AddPasswordViewModel

@Composable
fun BottomNavGraph(navController: NavHostController){
    val context = LocalContext.current
    val viewModel = AddPasswordViewModel(PasswordDatabase.getInstance(context).passwordDao())

    val getApps = viewModel.getApps.collectAsState(emptyList())
    val getDocuments = viewModel.getDocuments.collectAsState(emptyList())
    val getSocials = viewModel.getSocials.collectAsState(emptyList())
    val getPayments = viewModel.getPayments.collectAsState(emptyList())

    val numberOfSocialPasswords = viewModel.numberOfSocialPasswords.collectAsState(0)
    val numberOfPaymentsPasswords = viewModel.numberOfPaymentsPasswords.collectAsState(0)
    val numberOfAppsPasswords = viewModel.numberOfAppsPasswords.collectAsState(0)
    val numberOfDocumentsPasswords = viewModel.numberOfDocumentsPasswords.collectAsState(0)

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
            SavedPasswordScreen(categoryName = "Social", getSocials.value, viewModel)
        }
        composable(route = "savedPasswordApps"){
            SavedPasswordScreen(categoryName = "Apps", getApps.value, viewModel)
        }
        composable(route = "savedPasswordPayments"){
            SavedPasswordScreen(categoryName = "Payments", getPayments.value, viewModel)
        }
        composable(route = "savedPasswordDocuments"){
            SavedPasswordScreen(categoryName = "Documents", getDocuments.value, viewModel)
        }
    }
}

