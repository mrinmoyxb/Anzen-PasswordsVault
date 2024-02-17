package com.example.passwordmanager.NavigationBar

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView


//@Composable
//fun ButtonBar(navController: NavHostController){
//    Column(modifier = Modifier
//        .fillMaxSize()
//        .background(Color.Blue))
//    {
//        val screens = listOf(
//            BottomBarScreens.Home,
//            BottomBarScreens.PasswordGenerator,
//            BottomBarScreens.PasswordHelath
//        )
//        val navBackStackEntry by navController.currentBackStackEntryAsState()
//        val currentDestination = navBackStackEntry?.destination
//
//        Row(
//            modifier = Modifier
//                //.padding(start = 10.dp, end = 10.dp, top = 8.dp, bottom = 8.dp)
//                .fillMaxWidth().height(60.dp)
//                .background(Color(0xFF092635)),
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            screens.forEach { screen ->
//                AddItem(screen = screen, currentDestination = currentDestination, navController = navController)
//
//            }
//        }
//    }
//}
//
//@Composable
//fun RowScope.AddItem(
//        screen: BottomBarScreens,
//        currentDestination: NavDestination?,
//        navController: NavHostController
//    ){
//        val selected = currentDestination?.hierarchy?.any{
//            it.route==screen.route
//        } == true
//
//        val background = if(selected) Color.Black else Color.White
//        val contentColor = if(selected) Color.White else Color.Black
//
//        Box(
//            modifier = Modifier
//                .height(40.dp)
//                .clip(CircleShape)
//                .background(background)
//                .clickable(onClick = {
//                    navController.navigate(screen.route) {
//                        popUpTo(navController.graph.findStartDestination().id)
//                        launchSingleTop = true
//                    }
//                })
//        ) {
//            Row(
//                modifier = Modifier
//                    .padding(start = 10.dp, end = 10.dp, top = 8.dp, bottom = 8.dp),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.spacedBy(4.dp)
//            ) {
//                Icon(
//                    painter = painterResource(screen.icon),
//                    contentDescription = "icon",
//                    tint = contentColor
//                )
////                AnimatedVisibility(visible = selected) {
////                    Text(
////                        text = screen.title,
////                        color = contentColor
////                    )
////                }
//            }
//        }
//    }






