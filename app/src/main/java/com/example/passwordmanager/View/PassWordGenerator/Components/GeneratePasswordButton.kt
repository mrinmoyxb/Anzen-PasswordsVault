package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.ViewModel.PasswordGenerator.PasswordGeneratorViewModel
import com.example.passwordmanager.ui.theme.inter

@Composable
fun GeneratePasswordButton(viewModel: PasswordGeneratorViewModel) {

    val p1 = listOf(Color(0xFF2B32FF), Color(0xFF00ECEC))
    Card(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(0.7f)
            .offset(x=-1.dp)
            .clickable{
                      viewModel.generateRandomPassword()
            },
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.linearGradient(p1)),
            contentAlignment = Alignment.Center

        ) {
            Text(
                "Generate Password",
                fontSize = 23.sp,
                color = Color.White,
                fontFamily = inter,
                fontWeight = FontWeight.Medium,
            )
        }
    }
}

