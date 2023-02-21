package com.example.ecommerce.feature.main.bottom_navigation.model

import com.example.ecommerce.R

sealed class BottomNavScreen(
    val route: String,
    val name: String,
    val icon: Int
) {

    object Feed : BottomNavScreen(
        name = "Feed",
        route = "reed_screen",
        icon = R.drawable.feed
    )

    object Market : BottomNavScreen(
        name = "Market",
        route = "market_screen",
        icon = R.drawable.market
    )

    object Profile : BottomNavScreen(
        name = "Profile",
        route = "profile_screen",
        icon = R.drawable.profile
    )
    companion object {
        val items = listOf(
            BottomNavScreen.Feed,
            BottomNavScreen.Market,
            BottomNavScreen.Profile,
        )
    }
}
