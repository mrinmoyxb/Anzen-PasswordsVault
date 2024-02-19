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
import androidx.compose.foundation.lazy.LazyColumn
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
import androidx.compose.ui.input.key.Key.Companion.I
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
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.View.PasswordHealth.Components.CustomPasswordButton
import com.example.passwordmanager.ui.theme.inter


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPasswordScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
            .padding(10.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            Heading("Add new", FontWeight.Medium, "Password", FontWeight.Bold)
//            Card(
//                modifier = Modifier
//                    .height(600.dp)
//                    .fillMaxWidth(),
//                shape = RoundedCornerShape(20.dp),
//                colors = CardDefaults.cardColors(Color.Transparent)
//            ) {
//                Box(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .background(
//                            color = colorResource(R.color.brand_color),
//                            RoundedCornerShape(20.dp)
//                        )
//                        .padding(10.dp)
//                ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(start=5.dp, end=5.dp)
            ) {

                // 1. Category
                Text(
                    "Category", fontSize = 20.sp, color = Color.White,
                    fontFamily = inter, fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(10.dp))
                DropDown()
                Spacer(modifier = Modifier.height(10.dp))

                // 2. App Name
                InputCard(
                    "App name",
                    "Enter application name",
                    painterResource(id = R.drawable.application_icon1)
                )
                Spacer(modifier = Modifier.height(10.dp))

                // 3. Username
                InputCard(
                    "Username",
                    "Enter Username",
                    painterResource(id = R.drawable.nerd_face)
                )
                Spacer(modifier = Modifier.height(10.dp))


                // 4. Email
                InputCard(
                    "Email",
                    "Enter Email",
                    painterResource(id = R.drawable.email)
                )
                Spacer(modifier = Modifier.height(10.dp))


                // 5. Password
                InputCard(
                    "Password",
                    "Enter Password",
                    painterResource(id = R.drawable.lock_img)
                )
                Spacer(modifier = Modifier.height(22.dp))

                // 6. Add Password button
                CustomPasswordButton(text = "Save my password")
                Spacer(modifier = Modifier.height(80.dp))
            }

        }
    }
//        }
//    }
//}
}

@Preview(showBackground = true)
@Composable
fun NewPasswordScreenDisplay(){
    NewPasswordScreen()
}