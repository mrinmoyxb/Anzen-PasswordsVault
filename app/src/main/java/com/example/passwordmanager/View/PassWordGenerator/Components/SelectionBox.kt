package com.example.passwordmanager.View.PassWordGenerator.Components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.passwordmanager.R
import com.example.passwordmanager.ViewModel.PasswordGenerator.PasswordGeneratorViewModel
import com.example.passwordmanager.ui.theme.inter

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun SelectionBox(viewModel: PasswordGeneratorViewModel){

    var upperChecked by remember{ mutableStateOf(viewModel._uppercaseState.value)}
    var numberChecked by remember{ mutableStateOf(viewModel._numberState.value)}
    var lowerChecked by remember{ mutableStateOf(viewModel._lowercaseState.value)}
    var symbolChecked by remember{ mutableStateOf(viewModel._symbolState.value)}

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp),
        colors = CardDefaults.cardColors(Color.Transparent),
        shape = RoundedCornerShape(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp),
                ) {


                    //UPPERCASE: ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp)
                                .clickable {
                                    upperChecked = !upperChecked
                                    viewModel.uppercaseOnClick()
                                }
                                .background(Color.Transparent),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(if (upperChecked) colorResource(id = R.color.black) else Color.Transparent),
                            border = BorderStroke(
                                width = 3.dp,
                                color = if (upperChecked) colorResource(id = R.color.black) else Color.Black
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                if (upperChecked) {
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
                            "Uppercase",
                            fontSize = 20.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = inter
                        )
                    }
                    Spacer(modifier = Modifier.width(30.dp))


                    // NUMBERS:
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp)
                                .clickable {
                                    numberChecked = !numberChecked
                                    viewModel.numberOnClick()
                                }
                                .background(Color.Transparent),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(if (numberChecked) colorResource(id = R.color.black) else Color.Transparent),
                            border = BorderStroke(
                                width = 3.dp,
                                color = if (numberChecked) colorResource(id = R.color.black) else Color.Black
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                if (numberChecked) {
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
                            "Numbers",
                            fontSize = 20.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = inter
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp),
                ) {

                    // LOWERCASE
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp)
                                .clickable {
                                    lowerChecked = !lowerChecked
                                    viewModel.lowercaseOnClick()
                                }
                                .background(Color.Transparent),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(if (lowerChecked) colorResource(id = R.color.black) else Color.Transparent),
                            border = BorderStroke(
                                width = 3.dp,
                                color = if (lowerChecked) colorResource(id = R.color.black) else Color.Black
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                if (lowerChecked) {
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
                            "Lowercase",
                            fontSize = 20.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = inter
                        )
                    }

                    Spacer(modifier = Modifier.width(30.dp))

                    // SYMBOLS
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Card(
                            modifier = Modifier
                                .height(40.dp)
                                .width(40.dp)
                                .clickable {
                                    symbolChecked = !symbolChecked
                                    viewModel.symbolOnClick()
                                }
                                .background(Color.Transparent),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(if (symbolChecked) colorResource(id = R.color.black) else Color.Transparent),
                            border = BorderStroke(
                                width = 3.dp,
                                color = if (symbolChecked) colorResource(id = R.color.black) else Color.Black
                            )
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                if (symbolChecked) {
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
                            "Symbols",
                            fontSize = 20.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Left,
                            fontWeight = FontWeight.Medium,
                            fontFamily = inter
                        )
                    }
                }
            }
        }
    }

}




