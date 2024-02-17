package com.example.passwordmanager.View.PasswordHealth.PasswordHealthScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.View.PasswordHealth.Components.CharacterButton
import com.example.passwordmanager.View.PasswordHealth.Components.CheckHealthButton
import com.example.passwordmanager.View.PasswordHealth.Components.ContentButton
import com.example.passwordmanager.View.PasswordHealth.Components.CustomComponent
import com.example.passwordmanager.View.PasswordHealth.Components.GeneratePasswordHealth
import com.example.passwordmanager.View.PasswordHealth.Components.InputPasswordBar
import com.example.passwordmanager.ui.theme.inter


@Preview(showBackground = true)
@Composable
fun PasswordHealthScreen(){

    val p1 = listOf(Color(0xFF42e695), Color(0xFF3bb2b8))

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
            .padding(10.dp)
    ){
        item{

            // Heading:
            Spacer(modifier = Modifier.height(30.dp))
            Heading("Passwords", FontWeight.Bold, "Health Check Up", FontWeight.Medium)
            Spacer(modifier = Modifier.height(10.dp))


            // Password Input Bar:
            Text(
                "Enter Your Password", fontSize = 20.sp, color = Color.White,
                fontFamily = inter, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(start = 2.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                InputPasswordBar()
                Spacer(modifier = Modifier.width(8.dp))
                CheckHealthButton()
            }
            Spacer(modifier = Modifier.height(15.dp))


            // Password Result Screen:
            Card(
                modifier = Modifier
                    .height(550.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(Color.Transparent)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Brush.linearGradient(p1))
                        .padding(top = 10.dp, start = 2.dp, end = 2.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxWidth()) {
                            CustomComponent()
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            CharacterButton(number = "7", label = "Uppercase")
                            CharacterButton(number = "2", label = "Lowercase")
                            CharacterButton(number = "0", label = "Numbers")
                            CharacterButton(number = "7", label = "Symbols")
                        }

                        Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            ContentButton(state = "Strong", label = "Password Strength")
                            ContentButton(state = "Seconds to minutes", label = "Time to crack")
                        }
                    }
                }
            }

            // Generate Password:
            Spacer(modifier = Modifier.height(10.dp))
            GeneratePasswordHealth()
            Spacer(modifier = Modifier.height(30.dp))
        }

    }
}