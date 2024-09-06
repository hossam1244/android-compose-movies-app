package com.example.sample_movies_app_android.data.model

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItemModel(
    val name: String,
    val route: String,
    val icon: ImageVector,
    val badgeCount: Int = 0
)


