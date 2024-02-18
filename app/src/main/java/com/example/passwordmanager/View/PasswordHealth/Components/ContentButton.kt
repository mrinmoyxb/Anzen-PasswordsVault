package com.example.passwordmanager.View.PasswordHealth.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.ui.theme.inter

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
            //.background(Color(0xFF5347E5))){
            .background(Color.White)){
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
                    color = Color.Black,
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
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
    }
}