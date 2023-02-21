package com.example.ecommerce.feature.navigation.view

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecommerce.feature.navigation.model.AppScreen
import com.example.ecommerce.feature.main.bottom_navigation.view.MainScreenNav

@Composable
fun NavigationApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = AppScreen.MainScreen.route) {
        composable(AppScreen.MainScreen.route) { backStackEntry ->
            MainScreenNav()
        }
    }
}


