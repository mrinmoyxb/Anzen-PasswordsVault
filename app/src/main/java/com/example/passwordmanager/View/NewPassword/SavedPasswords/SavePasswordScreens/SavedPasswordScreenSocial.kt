package com.example.passwordmanager.View.NewPassword.SavedPasswords.SavePasswordScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.Model.Database.PasswordDatabase
import com.example.passwordmanager.Model.Database.PasswordEntity
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.View.NewPassword.SavedPasswords.Components.SavedPasswordCard
import com.example.passwordmanager.ViewModel.AddPassword.AddPassword
import com.example.passwordmanager.ui.theme.inter


@Composable
fun SavedPasswordScreen(categoryName: String, passwordList: List<PasswordEntity>){

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(10.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            Heading(
                text1 = "Your Saved",
                fontweight1 = FontWeight.Medium,
                text2 = "Passwords",
                fontweight2 = FontWeight.Bold
            )
            Text(categoryName, fontSize = 22.sp, fontFamily = inter, fontWeight = FontWeight.SemiBold, color = Color.White)
            Spacer(modifier = Modifier.height(5.dp))
            SavedPasswordCard(passwordList = passwordList)
        }
    }
}


