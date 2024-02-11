package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.passwordmanager.R

@Composable
fun CustomCheckBox(label: String, onClick: ()-> Unit) {

    var checked by remember { mutableStateOf(false) }

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .height(40.dp)
                .width(40.dp)
                .clickable { checked = !checked
                    onClick
                }
                .background(Color.Transparent),
            shape = CircleShape,
            colors = CardDefaults.cardColors(if(checked) colorResource(id = R.color.black) else Color.Transparent),
            border = BorderStroke(width = 3.dp, color = if(checked) colorResource(id = R.color.black) else Color.Black)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                if (checked) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        modifier = Modifier.size(30.dp),
                        contentDescription = "",
                        tint = Color.White,
                    )
                }

            }

        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            label,
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.Medium
        )
    }
}



@Preview(showBackground = true)
@Composable
fun DisplayPasswords() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.brand_color))
    ) {
        Spacer(modifier = Modifier.height(18.dp))
        CustomCheckBox(label = "Uppercase", onClick = {})
    }
}