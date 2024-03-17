package com.example.passwordmanager.View.NewPassword.SavedPasswords.Components

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
import com.example.passwordmanager.Model.Database.PasswordEntity


@Composable
fun SavedPasswordCard(passwordList: List<PasswordEntity>) {
    val p1 = listOf(Color(0xFF8E2DE2), Color(0xFF4A00E0))

    passwordList.forEach {password ->
        Card(
            modifier = Modifier.fillMaxWidth().height(140.dp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.Transparent)
        ) {
            Box(
                modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1))
                    .padding(10.dp)
            ) {
                Column() {
                    Text(password.appName, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
                    Spacer(modifier = Modifier.height(2.dp))
                    Divider(modifier = Modifier.fillMaxWidth(), thickness = 2.dp, color = Color.White)
                    Spacer(modifier = Modifier.height(5.dp))
                    Row() {
                        Text("Email: ", fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
                        Text(password.email, fontSize = 20.sp, fontWeight = FontWeight.Medium, color = Color.White)
                    }
                    Row() {
                        Text("Username: ", fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
                        Text(password.userName, fontSize = 20.sp, fontWeight = FontWeight.Medium, color = Color.White)
                    }
                    Row() { Text("Password: ", fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
                        Text(password.password, fontSize = 20.sp, fontWeight = FontWeight.Medium, color = Color.White
                        )
                    }
                }
            }
        }
    }
}

