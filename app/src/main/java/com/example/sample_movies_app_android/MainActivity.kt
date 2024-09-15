package com.example.sample_movies_app_android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.BadgedBox
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sample_movies_app_android.data.model.BottomNavigationItemModel
import com.example.sample_movies_app_android.navigation.NavGraph
import com.example.sample_movies_app_android.ui.theme.MoviesAppTheme
import com.example.sample_movies_app_android.utils.Constants.FAVORITES
import com.example.sample_movies_app_android.utils.Constants.MOVIES
import com.example.sample_movies_app_android.utils.Constants.PROFILE

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterialApi::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesAppTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
//                Scaffold(
//                    modifier = Modifier.background(Color.LightGray),
//                    bottomBar = {
//                        BottomNavigationBar(
//                            items = listOf(
//                                BottomNavigationItemModel(
//                                    name = stringResource(R.string.movies),
//                                    route = MOVIES,
//                                    icon = Icons.Default.Home
//                                ),
//                                BottomNavigationItemModel(
//                                    name = stringResource(R.string.favorites),
//                                    route = FAVORITES,
//                                    icon = Icons.Default.Favorite,
//                                    badgeCount = 0
//                                ),
//                                BottomNavigationItemModel(
//                                    name = stringResource(R.string.profile),
//                                    route = PROFILE,
//                                    icon = Icons.Default.Person,
//                                    badgeCount = 0
//                                ),
//                            ),
//                            navController = navController,
//                            onItemClick = {
//                                navController.navigate(it.route)
//                            }
//                        )
//                    }
//                ) {
//                    NavGraph(navController = navController)
//                }
            }
        }
    }




}