package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.ui.theme.roboto

@Composable
fun Heading() {
    Card(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(colorResource(id = R.color.theme5))
    ) {
            Row(
                modifier = Modifier.fillMaxSize().padding(10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Pass****",
                    fontSize = 37.sp,
                    color = Color.Black,
                    fontFamily = roboto,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Generator",
                    fontSize = 37.sp,
                    color = Color.Black,
                    fontFamily = roboto,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
