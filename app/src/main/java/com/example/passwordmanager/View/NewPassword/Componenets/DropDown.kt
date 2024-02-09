package com.example.passwordmanager.View.NewPassword.Componenets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.passwordmanager.View.NewPassword.NewPasswordScreen.NewPasswordScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDown(){
    val options = listOf("Social", "Payment", "Apps", "Document")
    var isExpanded by remember{mutableStateOf(false)}
    var category by remember{mutableStateOf(options[0])}

    ExposedDropdownMenuBox(expanded = isExpanded, onExpandedChange = {isExpanded = !isExpanded
    }) {
        TextField(value = category,
            onValueChange = {},
            modifier = Modifier.menuAnchor(),
            readOnly = true,
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
        )
            ExposedDropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false }) {
                options.forEach {label->
                DropdownMenuItem(text = { Text(label) }, onClick = {
                    category = label
                    isExpanded = false
                }
                )
            }
        }
    }

}


@Preview(showBackground = true)
@Composable
fun NewPasswordScreenDisplays(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        DropDown()
    }
}