package com.example.passwordmanager.View.HomeScreen.HomeScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.passwordmanager.NavigationBar.ButtonBar
import com.example.passwordmanager.NavigationBar.FloatingButton
import com.example.passwordmanager.R
import com.example.passwordmanager.View.HomeScreen.Components.AnalyseComponent
import com.example.passwordmanager.View.HomeScreen.Components.IconComponent
import com.example.passwordmanager.View.HomeScreen.Components.NameComponent
import com.example.passwordmanager.View.PassWordGenerator.Components.PasswordNavigationCard
import com.example.passwordmanager.ui.theme.inter

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navHostController: NavHostController) {
    val p1 = listOf(Color(0xFF2B32FF), Color(0xFF00ECEC))
    Scaffold(
        floatingActionButton = { FloatingButton(navController = navHostController) }
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.brand_color))
        ) {
            item {
                Spacer(modifier = Modifier.height(30.dp))

                // 1. Name of user
                NameComponent("Mrinmoy")

                // 2. Analyse Component
                AnalyseComponent()

                // 3. Buttons Row 1
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {

                    // Social
                    Card(modifier = Modifier.width(200.dp).height(200.dp).padding(10.dp).clickable { navHostController.navigate("savedPasswordSocial") },
                        shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Box(modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1), shape = RoundedCornerShape(20.dp))) {
                            Column(modifier = Modifier.fillMaxSize().padding(start = 10.dp, bottom = 10.dp), verticalArrangement = Arrangement.Bottom
                            ) {
                                Icon(painter = painterResource(id = R.drawable.social), contentDescription = "icon", modifier = Modifier.size(70.dp), tint = Color.White)
                                Text("Social", fontSize = 20.sp, textAlign = TextAlign.Center, fontFamily = inter, fontWeight = FontWeight.Medium, color = Color.White
                                )
                            }
                        }
                    }

                    // Payments
                    Card(
                        modifier = Modifier.width(200.dp).height(200.dp).padding(10.dp).clickable { navHostController.navigate("savedPasswordPayments") },
                        shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(Color.Transparent)
                    ) {
                        Box(modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1), shape = RoundedCornerShape(20.dp))) {
                            Column(modifier = Modifier.fillMaxSize().padding(start = 10.dp, bottom = 10.dp), verticalArrangement = Arrangement.Bottom
                            ) {
                                Icon(painter = painterResource(id = R.drawable.payment_icon1), contentDescription = "icon", modifier = Modifier.size(70.dp), tint = Color.White)
                                Text("Payments", fontSize = 20.sp, textAlign = TextAlign.Center, fontFamily = inter, fontWeight = FontWeight.Medium, color = Color.White
                                )
                            }
                        }
                    }

                    // 4. Buttons Row 2
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        // Apps
                        Card(
                            modifier = Modifier.width(200.dp).height(200.dp).padding(10.dp).clickable { navHostController.navigate("savedPasswordApps") },
                            shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(Color.Transparent)) {
                            Box(modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1), shape = RoundedCornerShape(20.dp))) {
                                Column(modifier = Modifier.fillMaxSize().padding(start = 10.dp, bottom = 10.dp), verticalArrangement = Arrangement.Bottom
                                ) {
                                    Icon(painter = painterResource(id = R.drawable.application_icon1), contentDescription = "icon", modifier = Modifier.size(70.dp), tint = Color.White)
                                    Text("Apps", fontSize = 20.sp, textAlign = TextAlign.Center, fontFamily = inter, fontWeight = FontWeight.Medium, color = Color.White)
                                }
                            }
                        }
                        // Documents
                        Card(
                            modifier = Modifier.width(200.dp).height(200.dp).padding(10.dp).clickable { navHostController.navigate("savedPasswordDocuments") },
                            shape = RoundedCornerShape(20.dp), colors = CardDefaults.cardColors(Color.Transparent)) {
                            Box(modifier = Modifier.fillMaxSize().background(Brush.linearGradient(p1), shape = RoundedCornerShape(20.dp))) {
                                Column(modifier = Modifier.fillMaxSize().padding(start = 10.dp, bottom = 10.dp), verticalArrangement = Arrangement.Bottom
                                ) {
                                    Icon(painter = painterResource(id = R.drawable.notes_icon), contentDescription = "icon", modifier = Modifier.size(70.dp), tint = Color.White)
                                    Text("Documents", fontSize = 20.sp, textAlign = TextAlign.Center, fontFamily = inter, fontWeight = FontWeight.Medium, color = Color.White)
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(80.dp))
                }
            }
        }
    }
}
