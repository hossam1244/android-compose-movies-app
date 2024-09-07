package com.example.sample_movies_app_android.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.sample_movies_app_android.R
import com.example.sample_movies_app_android.ui.component.CustomTopAppBar
import com.example.sample_movies_app_android.ui.component.MovieCardItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            CustomTopAppBar(appBarName = stringResource(R.string.movies))
        },
    ) { innerPadding ->
        MoviesList(innerPadding)
    }
}


@Composable
fun MoviesList(padding: PaddingValues) {
    LazyColumn(
      modifier = Modifier.padding(top = 70.dp, bottom = 70.dp)
    ) {
        items(10) {
            MovieCardItem(imageUrl = null, movieName = null)
        }
    }
}



