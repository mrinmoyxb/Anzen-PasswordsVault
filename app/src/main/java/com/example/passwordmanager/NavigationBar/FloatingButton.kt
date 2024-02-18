package com.example.passwordmanager.NavigationBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.passwordmanager.R

@Composable
fun FloatingButton(){
    FloatingActionButton(onClick = { /*TODO*/ },
        shape = CircleShape,
        containerColor = Color.White,
        modifier = Modifier
            .size(80.dp)
            .offset(y = -30.dp),
        elevation = FloatingActionButtonDefaults.elevation(10.dp)
        ) {
            Icon(painter = painterResource(id = R.drawable.plus),
                contentDescription = "new password",
                modifier = Modifier.size(40.dp)
                )
        }
    }


@Preview(showBackground = true)
@Composable
fun dd(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        FloatingButton()
    }
}