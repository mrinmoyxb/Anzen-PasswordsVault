package com.example.passwordmanager.View.PassWordGenerator.PassWordGeneratorScreen

import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.passwordmanager.R
import com.example.passwordmanager.View.PassWordGenerator.Components.CopyButton
import com.example.passwordmanager.View.PassWordGenerator.Components.GeneratePasswordButton
import com.example.passwordmanager.View.PassWordGenerator.Components.Heading
import com.example.passwordmanager.View.PassWordGenerator.Components.LengthSlider
import com.example.passwordmanager.View.PassWordGenerator.Components.PassWordDisplay
import com.example.passwordmanager.View.PassWordGenerator.Components.PasswordHealth
import com.example.passwordmanager.View.PassWordGenerator.Components.SelectionBox
import com.example.passwordmanager.ViewModel.PasswordGenerator.PasswordGeneratorViewModel

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun PasswordGeneratorScreen() {

    val viewModel: PasswordGeneratorViewModel = viewModel()
    val generatedPassword by viewModel.generatedPassword.collectAsState("")
    val clipboardManager = LocalClipboardManager.current
    val specialCase by viewModel.specialCase.collectAsState(false)
    val context  = LocalContext.current

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.brand_color))
            .padding(10.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(30.dp))
            Heading("Create unique", FontWeight.Medium, "Password", FontWeight.Bold)
            Spacer(modifier = Modifier.height(10.dp))

            PassWordDisplay(password = generatedPassword)
            Spacer(modifier = Modifier.height(8.dp))


            Spacer(modifier = Modifier.height(3.dp))
            LengthSlider(viewModel)
            Spacer(modifier = Modifier.height(8.dp))


            Spacer(modifier = Modifier.height(3.dp))
            SelectionBox(viewModel)
            Spacer(modifier = Modifier.height(8.dp))


            Spacer(modifier = Modifier.height(3.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                GeneratePasswordButton(viewModel, context, specialCase)
                Spacer(modifier = Modifier.width(5.dp))
                CopyButton(generatedPassword, clipboardManager, context)
            }

            Spacer(modifier = Modifier.height(10.dp))
            PasswordHealth(length = viewModel._lengthState.value)
            Spacer(modifier = Modifier.height(80.dp))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayPassword(){
    val viewModel: PasswordGeneratorViewModel = viewModel()
    PasswordGeneratorScreen()
}