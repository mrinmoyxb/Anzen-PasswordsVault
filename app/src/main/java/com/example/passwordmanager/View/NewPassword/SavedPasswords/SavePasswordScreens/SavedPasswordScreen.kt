package com.example.passwordmanager.View.NewPassword.SavedPasswords.SavePasswordScreens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.Model.Database.PasswordEntity
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.ViewModel.AddPassword.AddPasswordViewModel


@Composable
fun SavedPasswordScreen(categoryName: String, passwordList: List<PasswordEntity>, viewModel: AddPasswordViewModel) {
    //val p1 = listOf(Color(0xFF2B32FF), Color(0xFF00ECEC))
    val p1 = listOf(Color(0xFF8E2DE2), Color(0xFF4A00E0))
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .padding(10.dp)) {
        Spacer(modifier = Modifier.height(30.dp))
        Heading(
            text1 = "Your Saved",
            fontweight1 = FontWeight.Medium,
            text2 = "Passwords",
            fontweight2 = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(15.dp))
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                passwordList.forEach { password ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(190.dp),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    Brush.linearGradient(p1),
                                    shape = RoundedCornerShape(20.dp)
                                )
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(10.dp)
                            ) {
                                Row(modifier = Modifier.fillMaxWidth()) {
                                    Column(modifier = Modifier.fillMaxWidth(0.85f)) {
                                        Text(
                                            password.appName,
                                            fontSize = 37.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                    }
                                    Column(
                                        modifier = Modifier.fillMaxWidth(),
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Card(
                                            shape = CircleShape,
                                            modifier = Modifier.size(40.dp)
                                                .background(Color.Transparent).offset(y = 8.dp)
                                                .clickable { viewModel.deletePasswordFromDatabase(password.id)},
                                            colors = CardDefaults.cardColors(Color.White)
                                        )
                                        {
                                            Box(
                                                modifier = Modifier.fillMaxSize(),
                                                contentAlignment = Alignment.Center
                                            ) {
                                                Icon(
                                                    imageVector = Icons.Filled.Delete,
                                                    contentDescription = "delete",
                                                    modifier = Modifier.size(30.dp)
                                                )
                                            }
                                        }

                                    }
                                }
                                Spacer(modifier = Modifier.height(8.dp))
                                Divider(
                                    modifier = Modifier.fillMaxWidth(),
                                    color = Color.White,
                                    thickness = 2.dp
                                )
                                Spacer(modifier = Modifier.height(12.dp))
                                LazyRow(modifier = Modifier.fillMaxWidth()) {
                                    item {
                                        Text(
                                            "Username: ",
                                            fontSize = 20.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                        Text(
                                            password.userName,
                                            fontSize = 20.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Medium,
                                            color = Color.White
                                        )
                                    }
                                }

                                LazyRow(modifier = Modifier.fillMaxWidth()) {
                                    item {
                                        Text(
                                            "Email: ",
                                            fontSize = 20.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                        Text(
                                            password.email,
                                            fontSize = 20.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Medium,
                                            color = Color.White
                                        )
                                    }
                                }

                                LazyRow(modifier = Modifier.fillMaxWidth()) {
                                    item {
                                        Text(
                                            "Password: ",
                                            fontSize = 20.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Bold,
                                            color = Color.White
                                        )
                                        Text(
                                            password.password,
                                            fontSize = 20.sp,
                                            textAlign = TextAlign.Center,
                                            fontWeight = FontWeight.Medium,
                                            color = Color.White
                                        )
                                    }
                                }


                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                }
            }
        }
    }
}




