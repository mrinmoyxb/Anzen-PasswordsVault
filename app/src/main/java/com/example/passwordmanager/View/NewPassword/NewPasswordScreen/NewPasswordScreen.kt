package com.example.passwordmanager.View.NewPassword.NewPasswordScreen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.I
import androidx.compose.ui.platform.LocalContext
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
import com.example.passwordmanager.Model.Database.PasswordDatabase
import com.example.passwordmanager.R
import com.example.passwordmanager.View.NewPassword.Componenets.DropDown
import com.example.passwordmanager.View.NewPassword.Componenets.InputCard
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.ViewModel.AddPassword.AddPasswordViewModel
import com.example.passwordmanager.ui.theme.inter


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPasswordScreen(viewModel: AddPasswordViewModel) {
    val p1 = listOf(Color(0xFF2B32FF), Color(0xFF00ECEC))
    val context = LocalContext.current

    var category by remember { mutableStateOf("") }
    var appName by remember{mutableStateOf("")}
    var userName by remember{mutableStateOf("")}
    var email by remember{mutableStateOf("")}
    var password by remember{mutableStateOf("")}

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
            .padding(10.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            Heading("Add new", FontWeight.Medium, "Password", FontWeight.Bold)

            Column(
                modifier = Modifier.fillMaxSize().padding(start=5.dp, end=5.dp)
            ) {

                // 1. Category
                Text(
                    "Category", fontSize = 20.sp, color = Color.White,
                    fontFamily = inter, fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(10.dp))
                category =  DropDown()
                Spacer(modifier = Modifier.height(10.dp))

                // 2. App Name:
                Text("App name", fontSize = 20.sp, color = Color.White,
                    fontFamily = inter, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(40.dp))
                        .fillMaxWidth()
                        .height(60.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                ) {
                    TextField(value = appName, onValueChange = {appName = it}, modifier = Modifier.fillMaxSize().padding(5.dp),
                        placeholder = { Text("Enter your app name", fontSize = 13.sp, color = Color.Black, fontFamily = inter, fontWeight = FontWeight.Medium)},
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent, cursorColor = Color.Black,
                            focusedIndicatorColor = Color.White, unfocusedIndicatorColor = Color.White),
                        keyboardOptions = KeyboardOptions(KeyboardCapitalization.None, autoCorrect = true,
                            keyboardType = KeyboardType.Text, imeAction = ImeAction.Next
                        ),
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                // 3. Username:
                Text("Username", fontSize = 20.sp, color = Color.White,
                    fontFamily = inter, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(40.dp))
                        .fillMaxWidth()
                        .height(60.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                ) {
                    TextField(value = userName, onValueChange = {userName = it}, modifier = Modifier.fillMaxSize().padding(5.dp),
                        placeholder = { Text("Enter your username", fontSize = 13.sp, color = Color.Black, fontFamily = inter, fontWeight = FontWeight.Medium)},
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent, cursorColor = Color.Black,
                            focusedIndicatorColor = Color.White, unfocusedIndicatorColor = Color.White),
                        keyboardOptions = KeyboardOptions(KeyboardCapitalization.None, autoCorrect = true,
                            keyboardType = KeyboardType.Text, imeAction = ImeAction.Next
                        ),
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                // 4. Email:
                Text("Email", fontSize = 20.sp, color = Color.White,
                    fontFamily = inter, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(40.dp))
                        .fillMaxWidth()
                        .height(60.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                ) {
                    TextField(value = email, onValueChange = {email = it}, modifier = Modifier.fillMaxSize().padding(5.dp),
                        placeholder = { Text("Enter your email", fontSize = 13.sp, color = Color.Black, fontFamily = inter, fontWeight = FontWeight.Medium)},
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent, cursorColor = Color.Black,
                            focusedIndicatorColor = Color.White, unfocusedIndicatorColor = Color.White),
                        keyboardOptions = KeyboardOptions(KeyboardCapitalization.None, autoCorrect = true,
                            keyboardType = KeyboardType.Text, imeAction = ImeAction.Next
                        ),
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))


                // 5. Password:
                Text("Password", fontSize = 20.sp, color = Color.White,
                    fontFamily = inter, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(40.dp))
                        .fillMaxWidth()
                        .height(60.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                ) {
                    TextField(value = password, onValueChange = {password = it}, modifier = Modifier.fillMaxSize().padding(5.dp),
                        placeholder = { Text("Enter your password", fontSize = 13.sp, color = Color.Black, fontFamily = inter, fontWeight = FontWeight.Medium)},
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent, cursorColor = Color.Black,
                            focusedIndicatorColor = Color.White, unfocusedIndicatorColor = Color.White),
                        keyboardOptions = KeyboardOptions(KeyboardCapitalization.None, autoCorrect = true,
                            keyboardType = KeyboardType.Text, imeAction = ImeAction.Next
                        ),
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))

                // 6. Add Password button
                Card(modifier = Modifier.height(100.dp).fillMaxWidth().offset(x= (-1).dp).clickable{ viewModel.addPasswordToDatabase(category, appName, userName, email, password)
                    Toast.makeText(context, "Saved", Toast.LENGTH_SHORT).show() },
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(Color.Transparent),
                ) {
                    Box(modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1)), contentAlignment = Alignment.Center) {
                        Text("Save Password", fontSize = 23.sp, color = Color.White, fontFamily = inter, fontWeight = FontWeight.Medium)
                    }
                }
                Spacer(modifier = Modifier.height(80.dp))
            }

        }
    }

}

