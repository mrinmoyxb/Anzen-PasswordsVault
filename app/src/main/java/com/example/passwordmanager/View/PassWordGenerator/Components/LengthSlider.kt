package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LengthSlider(){
    var sliderValue by remember{
        mutableStateOf(8)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Slider(
            value = sliderValue.toFloat(), // Convert for Slider
            onValueChange = { newSliderValue ->
                sliderValue = newSliderValue.toInt() // Update state with integer
            },
            valueRange = 8f..20f,
            steps = 0,
            thumb = {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(30.dp)
                            .background(
                                colorResource(
                                    id = R.color.thumb1
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ){
                        Box(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(30.dp)
                                .padding(5.dp)
                                .background(
                                    colorResource(
                                        id = R.color.white
                                    ),
                                    shape = RoundedCornerShape(30.dp)
                                ),
                            contentAlignment = Alignment.Center
                        ){
                            Text(sliderValue.toString(), textAlign = TextAlign.Center)
                        }

                    }
            },
            colors = SliderDefaults.colors(
                thumbColor = colorResource(id = R.color.thumb1),
                activeTrackColor = colorResource(id = R.color.thumb1),
                inactiveTrackColor = Color.White
            )
        )
    }
    Text("slider value: ${sliderValue}", color = Color.White, fontSize = 32.sp)
}


@Preview(showBackground = true)
@Composable
fun DisplaySlider(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.background_color))
    ) {
        LengthSlider()
    }
}