package com.example.passwordmanager.View.HomeScreen.HomeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.passwordmanager.NavigationBar.ButtonBar
import com.example.passwordmanager.NavigationBar.FloatingButton
import com.example.passwordmanager.R
import com.example.passwordmanager.View.HomeScreen.Components.AnalyseComponent
import com.example.passwordmanager.View.HomeScreen.Components.IconComponent
import com.example.passwordmanager.View.HomeScreen.Components.NameComponent
import com.example.passwordmanager.View.PassWordGenerator.Components.PasswordNavigationCard

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Scaffold(
        floatingActionButton = { FloatingButton() }
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .background(colorResource(id = R.color.brand_color))
        ) {
            item {
                Spacer(modifier = Modifier.height(30.dp))

                NameComponent("Mrinmoy")

                AnalyseComponent()


                // 3. Buttons Row 1
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconComponent(icon = painterResource(id = R.drawable.social),
                        label = "Socials",
                        color = colorResource(id = R.color.supporting_color1), onClick = {})
                    IconComponent(icon = painterResource(id = R.drawable.payment_icon1),
                        label = "Payments",
                        color = colorResource(id = R.color.supporting_color2), onClick = {})
                }

                // 4. Buttons Row 2
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    IconComponent(icon = painterResource(id = R.drawable.application_icon1),
                        label = "Apps",
                        color = colorResource(id = R.color.supporting_color2), onClick = {})
                    IconComponent(icon = painterResource(id = R.drawable.notes_icon),
                        label = "Notes",
                        color = colorResource(id = R.color.supporting_color2), onClick = {})
                }

                Spacer(modifier = Modifier.height(80.dp))
            }
        }
    }
}
