package com.example.passwordmanager.View.PasswordHealth.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.passwordmanager.R
import com.example.passwordmanager.ViewModel.PasswordHealthChecker.PasswordHealthViewModel


@Composable
fun CheckHealthButton(viewModel: PasswordHealthViewModel) {
    val p1 = listOf(Color(0xFF2B32FF), Color(0xFF00ECEC))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        Card(
            modifier = Modifier
                .height(70.dp)
                .fillMaxWidth()
                .clickable {viewModel.calculateButton()},
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.Transparent)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.background(Brush.linearGradient(p1), shape = RoundedCornerShape(20.dp))
                    .padding(5.dp)
            ) {
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "generate result",
                    modifier = Modifier.size(100.dp),
                    tint = Color.White
                )
            }
        }
    }
}