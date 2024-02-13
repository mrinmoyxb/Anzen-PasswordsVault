package com.example.passwordmanager.View.PassWordGenerator.Components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderColors
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.ViewModel.PasswordGenerator.PasswordGeneratorViewModel
import com.example.passwordmanager.ui.theme.inter


@SuppressLint("StateFlowValueCalledInComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LengthSlider(viewModel: PasswordGeneratorViewModel) {
    var sliderValue by remember {
        mutableStateOf(8)
    }
    viewModel.lengthState.value = sliderValue
    Card(
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.supporting_color3), shape = RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.Center
        ) {
            Slider(
                value = sliderValue.toFloat(),
                onValueChange = { newSliderValue ->
                    sliderValue = newSliderValue.toInt()
                },
                valueRange = 5f..20f,
                steps = 0,
                thumb = {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(40.dp)
                            .background(
                                colorResource(
                                    id = R.color.black
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(40.dp)
                                .padding(8.dp)
                                .background(
                                    colorResource(
                                        id = R.color.white
                                    ),
                                    shape = RoundedCornerShape(30.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                sliderValue.toString(),
                                textAlign = TextAlign.Center,
                                color = Color.Black,
                                fontFamily = inter,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp
                            )
                        }

                    }
                },
                colors = SliderDefaults.colors(
                    thumbColor = colorResource(id = R.color.black),
                    activeTrackColor = colorResource(id = R.color.black),
                    inactiveTrackColor = Color.Black
                ),

                )
        }
    }
}

