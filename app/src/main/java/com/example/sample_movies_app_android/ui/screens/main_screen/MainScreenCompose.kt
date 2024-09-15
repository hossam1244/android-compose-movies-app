package com.example.sample_movies_app_android.ui.screens.main_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.sample_movies_app_android.R
import com.example.sample_movies_app_android.data.model.BottomNavigationItemModel
import com.example.sample_movies_app_android.navigation.NavGraph
import com.example.sample_movies_app_android.utils.Constants.FAVORITES
import com.example.sample_movies_app_android.utils.Constants.MOVIES
import com.example.sample_movies_app_android.utils.Constants.PROFILE


@OptIn(ExperimentalMaterialApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainHomeScreen(
    navController: NavHostController
) {

    Scaffold(
        modifier = Modifier.background(Color.LightGray),
        bottomBar = {
            BottomNavigationBar(
                items = listOf(
                    BottomNavigationItemModel(
                        name = stringResource(R.string.movies),
                        route = MOVIES,
                        icon = Icons.Default.Home
                    ),
                    BottomNavigationItemModel(
                        name = stringResource(R.string.favorites),
                        route = FAVORITES,
                        icon = Icons.Default.Favorite,
                        badgeCount = 0
                    ),
                    BottomNavigationItemModel(
                        name = stringResource(R.string.profile),
                        route = PROFILE,
                        icon = Icons.Default.Person,
                        badgeCount = 0
                    ),
                ),
                navController = navController,
                onItemClick = {
                    navController.navigate(it.route)
                }
            )
        }
    ) {
        NavGraph(navController = navController)
    }
}


@ExperimentalMaterialApi
@Composable
fun BottomNavigationBar(
    items: List<BottomNavigationItemModel>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavigationItemModel) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = modifier,
        backgroundColor = Color.White,
        elevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onItemClick(item) },
                selectedContentColor = MaterialTheme.colorScheme.primary,
                unselectedContentColor = MaterialTheme.colorScheme.secondary,
                icon = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        if (item.badgeCount > 0) {
                            BadgedBox(
                                badge = {
                                    Text(text = item.badgeCount.toString())
                                }
                            ) {
                                Icon(
                                    imageVector = item.icon,
                                    contentDescription = item.name
                                )
                            }
                        } else {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.name
                            )
                        }
                        // if (selected) {
                        Text(
                            text = item.name,
                            textAlign = TextAlign.Center,
                            fontSize = 10.sp
                        )
                        //}
                    }
                }
            )
        }
    }
}