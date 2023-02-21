package com.example.ecommerce.feature.navigation.model


sealed class AppScreen(
    val name: String,
    val route: String,
) {

    object MainScreen : AppScreen(
        name = "Feed",
        route = "feed_screen",
    )

}
