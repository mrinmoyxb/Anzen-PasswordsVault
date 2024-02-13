package com.example.passwordmanager.View.PasswordHealth.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun PasswordBar(){

    val p1 = listOf(Color(0xFF42e695), Color(0xFF3bb2b8))

    Column(
        modifier = Modifier.fillMaxSize().background(Color.Black).padding(10.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.Transparent)
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
                    .background(Brush.linearGradient(p1)),
                contentAlignment = Alignment.Center
            ) {

            }
        }
    }
}