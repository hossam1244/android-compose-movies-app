package com.example.sample_movies_app_android.ui.screens.login

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp


@Composable
fun LoginScreen(
    navigateToMainHomeScreen: () -> Unit
) {
    val context = LocalContext.current
    // two ways of declaring mutable state
    // 1. using remember
    // 2. using rememberSaveable ( to save the state when the screen is destroyed and recreated)
    var username: MutableState<String> = rememberSaveable { mutableStateOf("") }
    var passWord: MutableState<String> = rememberSaveable { mutableStateOf("") }

    StatelessLoginScreen(username, passWord, context, navigateToMainHomeScreen)
}
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
private fun StatelessLoginScreen(
    userName: MutableState<String>,
    passWord: MutableState<String>,
    context: Context,
    navigateToMainHomeScreen: () -> Unit
) {

    Scaffold {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Spacer(modifier = Modifier.height(40.dp))
            TextField(
                value = userName.value,
                onValueChange = { userName.value = it },
                label = { Text("Username") }
            )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                value = passWord.value,
                visualTransformation = PasswordVisualTransformation(),

                onValueChange = { passWord.value = it },
                label = { Text("Password") }
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                if (userName.value.isNotEmpty() && passWord.value.isNotEmpty()) {
                    // show toast
                    Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
                    navigateToMainHomeScreen()
                } else {
                    Toast.makeText(
                        context,
                        "Please enter username and password",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }) {
                Text("Login")
            }
        }
    }
}