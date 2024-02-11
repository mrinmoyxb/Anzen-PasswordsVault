package com.example.passwordmanager.View.NewPassword.Componenets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.ui.theme.roboto

@Composable
fun NewPasswordScreenHeading(){
    Card(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
                .background(color = colorResource(R.color.supporting_color1), RoundedCornerShape(20.dp))
                .padding(10.dp)
        ) {
            Column(
                //modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    "Add new",
                    fontSize = 25.sp,
                    color = Color.Black,
                    fontFamily = roboto,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    "Pass****",
                    fontSize = 40.sp,
                    color = Color.Black,
                    fontFamily = roboto,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}