package com.example.passwordmanager.View.PasswordHealth.Components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.ui.theme.inter

//@Composable
//fun CustomPasswordButton(text: String, onClick:() -> Unit) {
//
//    val p1 = listOf(Color(0xFF2B32FF), Color(0xFF00ECEC))
//    val context = LocalContext.current
//
//    Card(modifier = Modifier.height(100.dp).fillMaxWidth().offset(x=-1.dp).clickable{ onClick
//                Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show() },
//        shape = RoundedCornerShape(20.dp),
//        colors = CardDefaults.cardColors(Color.Transparent),
//    ) {
//        Box(modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1)), contentAlignment = Alignment.Center) {
//            Text(text, fontSize = 23.sp, color = Color.White, fontFamily = inter, fontWeight = FontWeight.Medium,
//            )
//        }
//    }
//}