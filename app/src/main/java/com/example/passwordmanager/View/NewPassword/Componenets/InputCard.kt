package com.example.passwordmanager.View.NewPassword.Componenets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R
import com.example.passwordmanager.ui.theme.inter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputCard(value: String, onValueChange: (newValue: String) -> Unit, heading: String, label: String, /*painter: Painter*/){
    Column() {
                Text(heading, fontSize = 20.sp, color = Color.White,
                    fontFamily = inter, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(40.dp))
                        .fillMaxWidth()
                        .height(60.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(20.dp))
                ) {
                    TextField(value = value, onValueChange = onValueChange, modifier = Modifier.fillMaxSize().padding(5.dp),
                        placeholder = { Text(label, fontSize = 13.sp, color = Color.Black, fontFamily = inter, fontWeight = FontWeight.Medium)},
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.Transparent, cursorColor = Color.Black,
                            focusedIndicatorColor = Color.White, unfocusedIndicatorColor = Color.White),
                        keyboardOptions = KeyboardOptions(KeyboardCapitalization.None, autoCorrect = true,
                            keyboardType = KeyboardType.Text, imeAction = ImeAction.Next
                        ),
                    )
                }
        }
}
