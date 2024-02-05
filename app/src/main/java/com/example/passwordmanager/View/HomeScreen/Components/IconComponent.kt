package com.example.passwordmanager.View.HomeScreen.Components

import android.graphics.Paint
import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R

@Composable
fun IconComponent(
    icon: Painter,
    label: String,
    color: Color,
    onClick: () -> Unit,
    ){
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .padding(10.dp)
            .clickable {},
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(color)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp, bottom = 10.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Icon(painter = icon, contentDescription = "icon", modifier = Modifier.size(70.dp))
            Text(label, fontSize = 20.sp, textAlign = TextAlign.Center)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Display(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background_color))
    ) {
        NameComponent("Mrinmoy")
        AnalyseComponent()
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconComponent(icon = painterResource(id = R.drawable.social),
                label = "Socials",
                color = colorResource(id = R.color.color11), onClick = {})
            IconComponent(icon = painterResource(id = R.drawable.payment_icon1),
                label = "Payments",
                color = colorResource(id = R.color.color5), onClick = {})
        }
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconComponent(icon = painterResource(id = R.drawable.application_icon1),
                label = "Apps",
                color = colorResource(id = R.color.color4), onClick = {})
            IconComponent(icon = painterResource(id = R.drawable.notes_icon),
                label = "Notes",
                color = colorResource(id = R.color.color7), onClick = {})
        }
    }
}



