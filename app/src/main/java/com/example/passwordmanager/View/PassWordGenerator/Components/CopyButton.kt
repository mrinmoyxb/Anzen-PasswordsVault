package com.example.passwordmanager.View.PassWordGenerator.Components

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.example.passwordmanager.R
import com.example.passwordmanager.ViewModel.PasswordGenerator.PasswordGeneratorViewModel

@Composable
fun CopyButton(text: String, clipboardManager: ClipboardManager, context: Context){

    Card(
        modifier = Modifier
            .height(100.dp)
            .width(100.dp)
            .clickable{clipboardManager.setText(AnnotatedString(text))
                Toast.makeText(context,
                    "Password Copied",
                    Toast.LENGTH_SHORT).show()
                      },
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(id = R.drawable.copy_icon),
                contentDescription = "refresh",
                tint = Color.Black,
                modifier = Modifier.size(50.dp))
        }
    }
}

