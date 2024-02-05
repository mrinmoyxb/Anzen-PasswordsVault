package com.example.passwordmanager.View.HomeScreen.Components

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.ui.theme.roboto

@Composable
fun NameComponent(name: String){
    val c = listOf(Color(0xFFffffff), Color(0xFF80ffdb))
    val d = listOf(Color(0xFFffffff), Color(0xFFe0aaff), Color(0xFF758bfd))
    val e = listOf(Color(0xFFffffff), Color(0xFF80b918))
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Box(
            modifier = Modifier.fillMaxSize().background(Brush.linearGradient(d))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    "Hello, ",
                    fontSize = 30.sp,
                    fontFamily = roboto,
                    fontWeight = FontWeight.Normal
                )
                Text(name, fontSize = 38.sp, fontFamily = roboto, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayNameComponent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background_color))
    ) {
        NameComponent(name = "Mrinmoy")
    }
}