package com.example.passwordmanager.View.HomeScreen.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.View.PasswordHealth.Components.CharacterButton
import com.example.passwordmanager.ui.theme.inter


// 1. Total Passwords
// 2. Reused
// 3. Weak Passwords
// 4. Strong Passwords

@Composable
fun AnalyseComponent(){
    val p3 = listOf(Color(0xFF8E2DE2), Color(0xFF4A00E0))
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(185.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.White)
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Brush.linearGradient(p3), shape = RoundedCornerShape(20.dp))
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Row(modifier = Modifier.fillMaxWidth().padding(start = 5.dp, top = 5.dp)) {
                    Text(
                        "Number of Passwords",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
                Row(
                    modifier = Modifier.fillMaxSize().padding(top = 10.dp, bottom = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    CharacterButton(number = "10", label = "Socials")
                    CharacterButton(number = "0", label = "Payments")
                    CharacterButton(number = "5", label = "Apps")
                    CharacterButton(number = "0", label = "Documents")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayAnalyse(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.brand_color))
    ) {
        //NameComponent("Mrinmoy")
        AnalyseComponent()
    }
}