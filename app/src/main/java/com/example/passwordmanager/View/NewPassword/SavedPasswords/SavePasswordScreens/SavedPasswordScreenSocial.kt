package com.example.passwordmanager.View.NewPassword.SavedPasswords.SavePasswordScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.Model.Database.PasswordDatabase
import com.example.passwordmanager.Model.Database.PasswordEntity
import com.example.passwordmanager.R
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.View.NewPassword.SavedPasswords.Components.SavedPasswordCard
import com.example.passwordmanager.ui.theme.inter


@Composable
fun SavedPasswordScreen(categoryName: String, passwordList: List<PasswordEntity>) {
    val p1 = listOf(Color(0xFF2B32FF), Color(0xFF00ECEC))
    Column(modifier = Modifier.fillMaxSize().padding(10.dp).background(Color.Black)) {
        Spacer(modifier = Modifier.height(30.dp))
        Heading(
            text1 = "Your Saved",
            fontweight1 = FontWeight.Medium,
            text2 = "Passwords",
            fontweight2 = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(15.dp))
        LazyColumn(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            item {
                passwordList.forEach {password->
                    Card(
                        modifier = Modifier.fillMaxWidth().height(220.dp).padding(10.dp),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize()
                                .background(
                                    Brush.linearGradient(p1),
                                    shape = RoundedCornerShape(20.dp)
                                )
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize()
                                    .padding(start = 10.dp, bottom = 10.dp),
                                verticalArrangement = Arrangement.Bottom
                            ) {
                                Text(
                                    password.userName, fontSize = 20.sp, textAlign = TextAlign.Center, fontFamily = inter, fontWeight = FontWeight.Medium, color = Color.White
                                )
                                Text(password.password, fontSize = 20.sp, textAlign = TextAlign.Center, fontFamily = inter, fontWeight = FontWeight.Medium, color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}



