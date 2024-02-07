package com.example.passwordmanager.View.PassWordGenerator.PassWordGeneratorScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.View.PassWordGenerator.Components.CopyToClipboard
import com.example.passwordmanager.View.PassWordGenerator.Components.CustomCheckBox
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.View.PassWordGenerator.Components.LengthSlider
import com.example.passwordmanager.View.PassWordGenerator.Components.PassWordDisplay
import com.example.passwordmanager.View.PassWordGenerator.Components.RefreshButton
import com.example.passwordmanager.View.PassWordGenerator.Components.SelectionBox
import com.example.passwordmanager.ui.theme.roboto

@Composable
fun PasswordGeneratorScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.black))
            .padding(10.dp)
    ) {

        Spacer(modifier = Modifier.height(30.dp))

        Heading()

        Spacer(modifier = Modifier.height(10.dp))
        PassWordDisplay(password = "********")
        Spacer(modifier = Modifier.height(12.dp))
        LengthSlider()
        Spacer(modifier = Modifier.height(12.dp))


        // selection box ->
        SelectionBox()

        Spacer(modifier = Modifier.height(10.dp))

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
            ){
            CopyToClipboard()
            Spacer(modifier = Modifier.width(5.dp))
            RefreshButton()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayPassword(){
    PasswordGeneratorScreen()
}