package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R

@Composable
fun LengthSlider(){
    var sliderValue by remember{
        mutableStateOf(8.0f)
    }
    Box(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Slider(
            value = sliderValue, onValueChange = { newValue ->
                sliderValue = newValue
            },
            valueRange = 8f..20f,
            steps = 0
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