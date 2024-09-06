package com.example.sample_movies_app_android.navigation

import android.provider.ContactsContract.Profile
import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.sample_movies_app_android.ui.screens.favorite.FavoriteScreen
import com.example.sample_movies_app_android.ui.screens.home.HomeScreen
import com.example.sample_movies_app_android.ui.screens.profile.ProfileScreen


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Home.path
    ) {
        addHomeScreen(navController, this)
        addFavoritesScreen(navController, this)
        addProfileScreen(navController, this)
    }
}

private fun addHomeScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Home.path) {
        HomeScreen()
    }
}

private fun addFavoritesScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Favorites.path) {
        FavoriteScreen()
    }
}


private fun addProfileScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Profile.path) {
        ProfileScreen()
    }
}

