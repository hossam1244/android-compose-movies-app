package com.example.sample_movies_app_android.ui.screens.login

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoginScreen() {
    var text by remember { mutableStateOf("") }

    Scaffold {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            // two ways of declaring mutable state
            var userName by remember { mutableStateOf("") }
            var passWord: MutableState<String> = remember { mutableStateOf("") }
            Spacer(modifier = Modifier.height(40.dp))
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Username") }
            )
        }
    }
}