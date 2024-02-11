package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.ui.theme.roboto

@Composable
fun GeneratePasswordButton() {
    Card(
        modifier = Modifier
            .height(100.dp)
            .width(265.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    colorResource(id = R.color.supporting_color1),
                    shape = RoundedCornerShape(20.dp)
                ),
            contentAlignment = Alignment.Center

        ) {
            //Spacer(modifier = Modifier.width(10.dp))
            Text(
                "Generate Password",
                fontSize = 23.sp,
                color = Color.Black,
                fontFamily = roboto,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DisplayCopyToClipboards() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.background_color))
//            .padding(10.dp)
//    ) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            CopyToClipboard()
//            RefreshButton()
//    }
//}
//}
