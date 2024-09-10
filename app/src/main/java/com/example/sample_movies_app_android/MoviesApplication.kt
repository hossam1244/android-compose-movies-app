package com.example.sample_movies_app_android

import android.app.Application

/**
 *  MVVM Architecture
 *  Bottom Navigation Bar ( done )
 *  Side Menu
 *  Navigation Component
 *  List of Movies
 *  Movie Details
 *  Movie Search
 *  DB for Movies
 *  Networking
 *  Dependency Injection
 *  Unit Testing
 *  Coroutines
 *  Data Binding
 *  Flow
 *  LiveData
 *  View Binding
 *  Room
 *  Retrofit
 *  Hilt
 */
class MoviesApplication : Application() {

    companion object {
        lateinit var instance: MoviesApplication
        // Members of the companion object
        const val CONSTANT_VALUE = 42
        fun staticFunction() {
            print("this is an example of using static function in kotlin")
            // Code for the static function
        }
    }
    override fun onCreate() {
        super.onCreate()
    }

}