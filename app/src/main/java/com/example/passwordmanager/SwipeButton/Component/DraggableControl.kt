package com.example.passwordmanager.SwipeButton.Component

import android.annotation.SuppressLint
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@SuppressLint("UnrememberedMutableState")
@Composable
fun DraggableControl(
    modifier: Modifier,
    progress: Float
){
    Box(
        modifier = Modifier
            .padding(4.dp)
            .shadow(
                elevation = 2.dp,
                CircleShape,
                clip = false
            )
            .background(Color.White, CircleShape),
        contentAlignment = Alignment.Center
    ){
        val isConfirmed = derivedStateOf { progress>=0.8f }

        Crossfade(targetState = isConfirmed.value, label = "") {
            if(it){
                Icon(imageVector = Icons.Filled.Done,
                    contentDescription = "", tint = Color.Green)
            }
            else{
                Icon(imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "", tint = Color.Green)
            }
        }
    }
}