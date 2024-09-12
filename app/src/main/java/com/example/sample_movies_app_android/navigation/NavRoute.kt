package com.example.sample_movies_app_android.navigation

sealed class NavRoute(val path: String) {

    object Login : NavRoute("login")
    object Movies : NavRoute("movies")
    object Favorites : NavRoute("favorites")
    object Profile : NavRoute("profile")


    // build navigation path (for screen navigation)
    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

    // build and setup route format (in navigation graph)
    fun withArgsFormat(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach { arg ->
                append("/{$arg}")
            }
        }
    }
}