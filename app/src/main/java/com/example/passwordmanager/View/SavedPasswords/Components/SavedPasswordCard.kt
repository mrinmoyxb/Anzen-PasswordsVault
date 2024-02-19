package com.example.passwordmanager.View.SavedPasswords.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.MaterialTheme.colors


@Composable
fun SavedPasswordCard(appName: String, email: String?, userName: String?, passWord: String?) {
    val p1 = listOf(Color(0xFF8E2DE2), Color(0xFF4A00E0))
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.Transparent)
        ) {
            Box(modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1)).padding(10.dp)) {
                Column(){
                    Text(appName, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)

                    Spacer(modifier = Modifier.height(2.dp))
                    Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color.White)
                    Spacer(modifier = Modifier.height(5.dp))
                    Row() {
                        Text(
                            "Email: ",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                        Text(
                            email!!,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }
                    Row() {
                        Text(
                            "Username: ",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                        Text(
                            userName!!,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }
                    Row() {
                        Text(
                            "Password: ",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.White
                        )
                        Text(
                            passWord!!,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun DisplayCard(){
    Column(
        modifier = Modifier.fillMaxSize().background(Color.Black).padding(10.dp)
    ) {
        SavedPasswordCard("Instagram", "mrinmoy@gmail.com", "mrinxb", "123")
    }

}