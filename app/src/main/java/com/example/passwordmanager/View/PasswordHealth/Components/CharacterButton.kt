package com.example.passwordmanager.View.PasswordHealth.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.MaterialTheme.colors
import com.example.passwordmanager.ui.theme.inter

@Composable
fun CharacterButton(number: String, label: String, modifier: Modifier = Modifier){
    Card(
        modifier = Modifier
            .height(110.dp)
            .width(87.dp)
            .then(modifier),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF5347E5))){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 3.dp, end = 3.dp, top = 3.dp, bottom = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(number, fontSize = 52.sp,
                    fontFamily = inter,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Text(label,
                    fontSize = 15.sp,
                    fontFamily = inter,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.offset(y=-8.dp)
                    )
            }
        }
    }
}



@Composable
fun ContentButton(state: String, label: String, modifier: Modifier = Modifier){
    Card(
        modifier = Modifier
            .height(110.dp)
            .width(177.dp)
            .then(modifier),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF5347E5))){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 3.dp, end = 3.dp, top = 3.dp, bottom = 10.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(state, fontSize = 25.sp,
                    fontFamily = inter,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        label,
                        fontSize = 15.sp,
                        fontFamily = inter,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayChar(){
    val p1 = listOf(Color(0xFF42e695), Color(0xFF3bb2b8))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(10.dp)
    ){
        Card(modifier = Modifier
            .height(500.dp)
            .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.Transparent)
        ){
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Brush.linearGradient(p1))
                .padding(top = 10.dp, start = 2.dp, end = 2.dp)
                ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
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
    }
}