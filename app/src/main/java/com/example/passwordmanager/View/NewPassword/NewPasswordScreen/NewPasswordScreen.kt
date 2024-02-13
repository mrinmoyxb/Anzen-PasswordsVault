package com.example.passwordmanager.View.NewPassword.NewPasswordScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.MaterialTheme.colors
import com.example.passwordmanager.R
import com.example.passwordmanager.View.NewPassword.Componenets.DropDown
import com.example.passwordmanager.View.NewPassword.Componenets.InputCard
import com.example.passwordmanager.View.NewPassword.Componenets.NewPasswordScreenHeading
import com.example.passwordmanager.ui.theme.inter


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPasswordScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
            .padding(10.dp)
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        NewPasswordScreenHeading()
        Spacer(modifier = Modifier.height(10.dp))
        Card(
            modifier = Modifier
                .height(500.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colorResource(R.color.brand_color), RoundedCornerShape(20.dp))
                    .padding(15.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text("Category", fontSize = 20.sp, color = Color.Black,
                        fontFamily = inter, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(10.dp))
                    DropDown()
                    Spacer(modifier = Modifier.height(10.dp))
                    InputCard(
                        "Username",
                        "Enter Username",
                        painterResource(id = R.drawable.nerd_face)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    InputCard(
                        "Email",
                        "Enter Email",
                        painterResource(id = R.drawable.email)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    InputCard(
                        "Password",
                        "Enter Password",
                        painterResource(id = R.drawable.lock_img)
                    )
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewPasswordScreenDisplay(){
    NewPasswordScreen()
}