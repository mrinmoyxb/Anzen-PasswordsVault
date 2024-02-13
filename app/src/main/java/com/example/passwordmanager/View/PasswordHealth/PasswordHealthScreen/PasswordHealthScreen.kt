package com.example.passwordmanager.View.PasswordHealth.PasswordHealthScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.passwordmanager.R


@Preview(showBackground = true)
@Composable
fun PasswordHealthScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
    ){

    }
}