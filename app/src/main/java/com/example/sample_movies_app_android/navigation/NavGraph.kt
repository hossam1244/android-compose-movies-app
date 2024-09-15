package com.example.sample_movies_app_android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sample_movies_app_android.ui.screens.favorite.FavoriteScreen
import com.example.sample_movies_app_android.ui.screens.movies.MoviesListCompose
import com.example.sample_movies_app_android.ui.screens.login.LoginScreen
import com.example.sample_movies_app_android.ui.screens.main_screen.MainHomeScreen
import com.example.sample_movies_app_android.ui.screens.profile.ProfileScreen


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Login.path
    ) {
        addLoginScreen(navController, this)
        addMainHomeScreen(navController, this)
        addMoviesScreen(navController, this)
        addFavoritesScreen(navController, this)
        addProfileScreen(navController, this)
    }
}


private fun addLoginScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Login.path) {
        LoginScreen(navigateToMainHomeScreen = {
            navController.navigate(NavRoute.MainHomeScreen.withArgs())
        })
    }
}

private fun addMainHomeScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.MainHomeScreen.path) {
        MainHomeScreen(navController = navController)
    }
}


private fun addMoviesScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Movies.path) {
        MoviesListCompose()
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

