package com.example.passwordmanager.NavigationBar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.passwordmanager.R

@Composable
fun FloatingButton(navController: NavHostController){
    FloatingActionButton(onClick = { navController.navigate("newPassword")},
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

