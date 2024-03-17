package com.example.passwordmanager.View.HomeScreen.Components

import android.graphics.Paint
import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.passwordmanager.R
import com.example.passwordmanager.ui.theme.inter


//@Composable
//fun IconComponent(icon: Painter, label: String, color: Color, navHostController: NavHostController, route: String
//    ) {
//    val p1 = listOf(Color(0xFF2B32FF), Color(0xFF00ECEC))
//    Card(modifier = Modifier.width(200.dp).height(200.dp).padding(10.dp).clickable {navHostController.navigate(route)},
//        shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(Color.Transparent)) {
//        Box(
//            modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1), shape = RoundedCornerShape(20.dp))
//        ) {
//            Column(modifier = Modifier.fillMaxSize().padding(start = 10.dp, bottom = 10.dp), verticalArrangement = Arrangement.Bottom) {
//                Icon(painter = icon, contentDescription = "icon", modifier = Modifier.size(70.dp), tint = Color.White)
//                Text(
//                    label, fontSize = 20.sp, textAlign = TextAlign.Center,
//                    fontFamily = inter, fontWeight = FontWeight.Medium, color = Color.White
//                )
//            }
//        }
//    }
//}


//@Preview(showBackground = true)
//@Composable
//fun Display(){
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.brand_color))
//    ) {
//        //NameComponent("Mrinmoy")
//        AnalyseComponent()
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            IconComponent(icon = painterResource(id = R.drawable.social),
//                label = "Socials",
//                color = colorResource(id = R.color.supporting_color1), onClick = {})
//            IconComponent(icon = painterResource(id = R.drawable.payment_icon1),
//                label = "Payments",
//                color = colorResource(id = R.color.supporting_color2), onClick = {})
//        }
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            IconComponent(icon = painterResource(id = R.drawable.application_icon1),
//                label = "Apps",
//                color = colorResource(id = R.color.supporting_color1), onClick = {})
//            IconComponent(icon = painterResource(id = R.drawable.notes_icon),
//                label = "Notes",
//                color = colorResource(id = R.color.supporting_color2), onClick = {})
//        }
//    }
//}




