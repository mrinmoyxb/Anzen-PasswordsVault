package com.example.passwordmanager.View.PassWordGenerator.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.example.passwordmanager.ui.theme.inter

@Composable
fun PasswordHealth(length: Int) {

    var pass_state: String = ""
    var pass_color: Color = colorResource(id = R.color.black)
    var pass_statement: String = ""

    when (length) {
        in 5..7 -> {
            pass_state = "Very weak"; pass_color = colorResource(id = R.color.red); pass_statement =
                "Seconds to minutes"
        }

        in 8..10 -> {
            pass_state = "Weak"; pass_color = colorResource(id = R.color.orange); pass_statement =
                "Hours to Days"
        }

        in 11..13 -> {
            pass_state = "Good"; pass_color = colorResource(id = R.color.yellow); pass_statement =
                "Months to years"
        }

        in 14..20 -> {
            pass_state = "Strong"; pass_color = colorResource(id = R.color.green); pass_statement =
                "Centuries"
        }

        else -> {
            ""
        }
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
        colors = CardDefaults.cardColors(Color.Transparent),
        shape = RoundedCornerShape(20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(20.dp))
                .padding(10.dp)
        ) {

            Column(
                modifier = Modifier.fillMaxSize()
            ) {

                Text("Password Health", fontSize = 22.sp, fontFamily = inter, fontWeight = FontWeight.Medium)
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Card(
                        modifier = Modifier
                            .height(40.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(colorResource(id = R.color.brand_color))
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(top = 5.dp, start = 8.dp, bottom = 5.dp, end = 5.dp)
                                .fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.strength),
                                contentDescription = "strength",
                                modifier = Modifier.size(30.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                "Strength: ",
                                fontSize = 18.sp,
                                fontFamily = inter,
                                fontWeight = FontWeight.Medium,
                                color = Color.White
                            )
                            Text(
                                "${pass_state}",
                                fontSize = 18.sp,
                                fontFamily = inter,
                                fontWeight = FontWeight.Medium,
                                color = pass_color
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Card(
                        modifier = Modifier
                            .height(40.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(colorResource(id = R.color.brand_color))
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(top = 5.dp, start = 8.dp, bottom = 5.dp, end = 5.dp)
                                .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.stopwatch),
                                    contentDescription = "strength",
                                    modifier = Modifier.size(30.dp)
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(
                                    "Time to crack: ",
                                    fontSize = 18.sp,
                                    fontFamily = inter,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                                Text(
                                    "${pass_statement}",
                                    fontSize = 18.sp,
                                    fontFamily = inter,
                                    fontWeight = FontWeight.Medium,
                                    color = Color.White
                                )
                            }
                        }
                    }
                }
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun DisplayP(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.brand_color))
            .padding(10.dp)
    ) {
        PasswordHealth(8)
    }
}