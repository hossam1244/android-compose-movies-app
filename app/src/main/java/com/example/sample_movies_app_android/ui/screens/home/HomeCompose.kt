package com.example.sample_movies_app_android.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.sample_movies_app_android.ui.component.MovieCardItem

@Composable
fun HomeScreen() {
    LazyColumn {
       items(10) {
           MovieCardItem()
       }
    }

}



