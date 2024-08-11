package com.example.sample_movies_app_android

import android.app.Application

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