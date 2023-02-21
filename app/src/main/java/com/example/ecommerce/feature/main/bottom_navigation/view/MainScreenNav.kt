package com.example.ecommerce.feature.main.bottom_navigation.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.ecommerce.feature.app.theme.Neutral50
import com.example.ecommerce.feature.app.theme.Primary100
import com.example.ecommerce.feature.main.bottom_navigation.model.BottomNavScreen
import com.example.ecommerce.feature.main.bottom_navigation.model.BottomNavScreen.Companion.items


@Composable
fun MainScreenNav(

) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = MaterialTheme.colors.background,
                elevation = 0.dp
            ) {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                items.forEach { screen ->
                    BottomNavigationItem(
                        icon = { Icon(painter = painterResource(id = screen.icon), contentDescription = null) },
                        label = { Text(screen.name) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        selectedContentColor = Primary100,
                        unselectedContentColor = Neutral50,
                        onClick = {
                            navController.navigate(screen.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(navController, startDestination = BottomNavScreen.Feed.route, Modifier.padding(innerPadding)) {
            composable(BottomNavScreen.Feed.route) {

            }
            composable(BottomNavScreen.Market.route) {

            }
            composable(BottomNavScreen.Profile.route) {

            }
        }
    }
}