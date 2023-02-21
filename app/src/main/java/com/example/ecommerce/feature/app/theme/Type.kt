package com.example.ecommerce.feature.app.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ecommerce.R

val HeyWow = FontFamily(
    Font(R.font.heywow_bold, weight = FontWeight.Bold),
    Font(R.font.heywow_regular, weight = FontWeight.Normal),
    Font(R.font.heywow_semibold, weight = FontWeight.SemiBold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = HeyWow,
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
)