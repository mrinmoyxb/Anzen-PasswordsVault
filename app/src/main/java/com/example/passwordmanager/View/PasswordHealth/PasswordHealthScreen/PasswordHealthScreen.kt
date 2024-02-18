package com.example.passwordmanager.View.PasswordHealth.PasswordHealthScreen

import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.passwordmanager.R
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.View.PasswordHealth.Components.CharacterButton
import com.example.passwordmanager.View.PasswordHealth.Components.CheckHealthButton
import com.example.passwordmanager.View.PasswordHealth.Components.ComplexityBar
import com.example.passwordmanager.View.PasswordHealth.Components.ContentButton
import com.example.passwordmanager.View.PasswordHealth.Components.GeneratePasswordHealth
import com.example.passwordmanager.View.PasswordHealth.Components.InputPasswordBar
import com.example.passwordmanager.ViewModel.PasswordHealthChecker.PasswordHealthViewModel
import com.example.passwordmanager.ui.theme.inter


@Preview(showBackground = true)
@Composable
fun PasswordHealthScreen(){

    val viewModel: PasswordHealthViewModel = viewModel()
    val uppercaseCount by viewModel._uppercaseCount.collectAsState(0)
    val lowercaseCount by viewModel._lowercaseCount.collectAsState(0)
    val numbersCount by viewModel._numbersCount.collectAsState(0)
    val symbolsCount by viewModel._symbolsCount.collectAsState(0)
    val strength by viewModel._strength.collectAsState("")
    val timeToCrack by viewModel._timeToCrack.collectAsState("")
    val complexityScore by viewModel._complexityScore.collectAsState(0.0f)

    val p1 = listOf(Color(0xFF42e695), Color(0xFF3bb2b8))
    val p2 = listOf(Color(0xFF8E2DE2), Color(0xFF4A00E0))

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
            .padding(10.dp)
    ){
        item{

            // Heading:
            Spacer(modifier = Modifier.height(30.dp))
            Heading("Passwords", FontWeight.Bold, "Health Check Up", FontWeight.Medium)
            Spacer(modifier = Modifier.height(10.dp))


            // Password Input Bar:
            Text(
                "Enter Your Password", fontSize = 20.sp, color = Color.White,
                fontFamily = inter, fontWeight = FontWeight.SemiBold, modifier = Modifier.padding(start = 2.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row {
                InputPasswordBar(viewModel)
                Spacer(modifier = Modifier.width(8.dp))
                CheckHealthButton(viewModel)
            }
            Spacer(modifier = Modifier.height(15.dp))


            // Password Result Screen:
            Card(
                modifier = Modifier
                    .height(520.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(Color.Transparent)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Brush.linearGradient(p2))
                        .padding(top = 10.dp, start = 2.dp, end = 2.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Box(contentAlignment = Alignment.Center,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            ComplexityBar()
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .offset(y = -15.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            CharacterButton(number = uppercaseCount.toString(), label = "Uppercase")
                            CharacterButton(number = lowercaseCount.toString(), label = "Lowercase")
                            CharacterButton(number = numbersCount.toString(), label = "Numbers")
                            CharacterButton(number = symbolsCount.toString(), label = "Symbols")
                        }

                        //Spacer(modifier = Modifier.height(8.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .offset(y = -8.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            ContentButton(state = strength, label = "Password Strength")
                            ContentButton(state = timeToCrack, label = "Time to crack")
                        }
                    }
                }
            }

            // Generate Password:
            Spacer(modifier = Modifier.height(10.dp))
            GeneratePasswordHealth()
            Spacer(modifier = Modifier.height(80.dp))
        }

    }
}