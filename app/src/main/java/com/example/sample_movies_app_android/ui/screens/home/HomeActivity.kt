package com.example.sample_movies_app_android.ui.screens.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sample_movies_app_android.ui.theme.MoviesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesAppTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.primary)

                ) {
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text(text = "Hello, World!")
                        Text(text = "Hello, World!")
                        Row {
                            Text(text = "Hello, World!")
                            Text(text = "Hello, World!")
                        }
                        LazyColumn {
                            items(100) {
                                Text(text = "Hello, World!")
                            }
                        }
                    }
                }
            }
        }
    }


    @Composable
    @Preview
    fun PreviewHomeScreen() {
        MoviesAppTheme {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(16.dp)

            ) {
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    LazyColumn {
                        items(5) { index ->
                            Text(text = "Hello, World!")
                        }
                    }
                    LazyRow {
                        items(5) { index ->
                            Text(text = "Hello, World!")
                        }
                    }
                    for (i in 0..3) {
                        Text(text = "Hello, World! $i")
                    }
                    Text(text = "Hello, World!")
                    if (2 < 3) {
                        Text(text = "Hello, World!")
                    }
                    Row(
                        modifier = Modifier
                            .padding(16.dp)
                    ) {
                        Text(text = "Hello, World!")
                        Text(text = "Hello, World!")
                    }
                    LazyColumn {
                        items(10) {
                            Text(text = "Hello, World!")
                        }
                    }
                }
            }
        }
    }
}
