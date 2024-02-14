package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import com.example.passwordmanager.ui.theme.inter

@Composable
fun Heading(text1: String, fontweight1: FontWeight, text2: String, fontweight2: FontWeight) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        ) {
                Text(
                    text = text1,
                    fontSize = 38.sp,
                    color = Color.White,
                    fontFamily = inter,
                    fontWeight = fontweight1
                )
                Text(
                    text = text2,
                    fontSize = 40.sp,
                    color = Color.White,
                    fontFamily = inter,
                    fontWeight = fontweight2,
                    modifier = Modifier.offset(y=-7.dp)
                )
            }
        }

