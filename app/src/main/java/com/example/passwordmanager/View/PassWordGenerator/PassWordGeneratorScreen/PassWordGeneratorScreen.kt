package com.example.passwordmanager.View.PassWordGenerator.PassWordGeneratorScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.View.PassWordGenerator.Components.CustomCheckBox
import com.example.passwordmanager.View.PassWordGenerator.Components.LengthSlider
import com.example.passwordmanager.View.PassWordGenerator.Components.PassWordDisplay
import com.example.passwordmanager.ui.theme.roboto

@Composable
fun PasswordGeneratorScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background_color))
            .padding(10.dp)
    ) {

        Spacer(modifier = Modifier.height(18.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Pass****",
                    fontSize = 32.sp,
                    color = Color.White,
                    fontFamily = roboto,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = " Generator",
                    fontSize = 32.sp,
                    color = Color.White,
                    fontFamily = roboto,
                    fontWeight = FontWeight.Thin
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        PassWordDisplay(password = "1234567890abcdefghij")
        Spacer(modifier = Modifier.height(12.dp))
        LengthSlider()
        Spacer(modifier = Modifier.height(12.dp))


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp),
            colors = CardDefaults.cardColors(Color.Transparent),
            shape = RoundedCornerShape(20.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White, shape = RoundedCornerShape(20.dp))
            ) {
                Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        CustomCheckBox(label = "Uppercase")
                        Spacer(modifier = Modifier.width(30.dp))
                        CustomCheckBox(label = "Numbers")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        CustomCheckBox(label = "Lowercase")
                        Spacer(modifier = Modifier.width(30.dp))
                        CustomCheckBox(label = "Symbols")
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayPassword(){
    PasswordGeneratorScreen()
}