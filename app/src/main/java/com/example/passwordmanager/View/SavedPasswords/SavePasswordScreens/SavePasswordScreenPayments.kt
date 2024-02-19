package com.example.passwordmanager.View.SavedPasswords.SavePasswordScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.View.SavedPasswords.Components.SavedPasswordCard
import com.example.passwordmanager.ui.theme.inter


@Composable
fun SavedPasswordScreenPayments(categoryName: String){
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
            //Spacer(modifier = Modifier.height(5.dp))
            Text(categoryName, fontSize = 22.sp, fontFamily = inter, fontWeight = FontWeight.SemiBold, color = Color.White)
            Spacer(modifier = Modifier.height(5.dp))

            SavedPasswordCard("Instagram", "mrinmoy@gmail.com", "mrinxb", "123")
            Spacer(modifier = Modifier.height(10.dp))
            SavedPasswordCard("Pintrest", "mrinmoy@gmail.com", "mrinxbpin", "12345wedfk")
            Spacer(modifier = Modifier.height(10.dp))
            SavedPasswordCard("Facebook", "mrinmoy@gmail.com", "mrinxbfb", "#jfjg123")
            Spacer(modifier = Modifier.height(10.dp))
            SavedPasswordCard("Facebook", "mrinmoy@gmail.com", "mrinxbfb", "#jfjg123")
            Spacer(modifier = Modifier.height(10.dp))
            SavedPasswordCard("Facebook", "mrinmoy@gmail.com", "mrinxbfb", "#jfjg123")
        }
    }
}


