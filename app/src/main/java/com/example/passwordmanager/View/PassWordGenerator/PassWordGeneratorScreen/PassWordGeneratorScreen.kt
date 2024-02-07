package com.example.passwordmanager.View.PassWordGenerator.PassWordGeneratorScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
            Text(
                text = "Password",
                fontSize = 32.sp,
                color = Color.White,
                fontFamily = roboto,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        PassWordDisplay(password = "1234567890abcdefghij")
        Spacer(modifier = Modifier.height(10.dp))
        LengthSlider()
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            CustomCheckBox("Uppercase")
            CustomCheckBox("Number")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            CustomCheckBox("Lowercase")
            CustomCheckBox("Symbol")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayPassword(){
    PasswordGeneratorScreen()
}