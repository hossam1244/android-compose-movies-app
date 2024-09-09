package com.example.sample_movies_app_android.ui.screens.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.sample_movies_app_android.R
import com.example.sample_movies_app_android.ui.component.CustomTopAppBar
import com.example.sample_movies_app_android.ui.component.ProfileBoxItem


@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = {
            CustomTopAppBar(appBarName = stringResource(R.string.profile))
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            AsyncImage(
                model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTH44asUcIXZa8taXFp2OlJzx7SGXDhwqDUsoD7NMgJ2Vj12CY0mV2QpgGUy_4FbKotJTA&usqp=CAU",
                contentDescription = "Profile Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
                    .border(
                        BorderStroke(4.dp, MaterialTheme.colorScheme.primary),
                        CircleShape
                    )
                    .padding(4.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Walter White",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "WalterWhite@gmail.com",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.height(30.dp))
            Box(
                modifier = Modifier
                    .height(3.dp)
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            )
            ProfileBoxItem(
                imageVector = Icons.Default.Settings,
                text = "Settings"
            )
            ProfileBoxItem(
                imageVector = Icons.Default.Lock,
                text = "Logout"
            )
        }
    }

}