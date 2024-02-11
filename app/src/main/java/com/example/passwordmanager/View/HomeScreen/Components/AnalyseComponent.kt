package com.example.passwordmanager.View.HomeScreen.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.passwordmanager.R


// 1. Total Passwords
// 2. Reused
// 3. Weak Passwords
// 4. Strong Passwords

@Composable
fun AnalyseComponent(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.white))
    ){

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
        NameComponent("Mrinmoy")
        AnalyseComponent()
    }
}