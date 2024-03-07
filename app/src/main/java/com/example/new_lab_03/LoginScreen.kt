package com.example.new_lab_03

//import Signup
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(38, 175, 145)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var text by remember { mutableStateOf("") }
        var pass by remember { mutableStateOf("") }
        TextField(
            label = { Text("Email") },
            textStyle = TextStyle(fontSize = 20.sp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, bottom = 10.dp),
            value = text,
            onValueChange = { newText ->
                text = newText
            },
        )

        TextField(
            label = { Text("Password") },
            textStyle = TextStyle(fontSize = 20.sp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)

            ,
            value = pass,
            onValueChange = { newText ->
                pass = newText
            },
            visualTransformation = PasswordVisualTransformation(),

            )

        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 30.dp)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(238,239,243),
                contentColor = Color(38, 175, 145)
            ),
            shape = RectangleShape
        ) {
            Text(text = "LOGIN",
                fontSize = 20.sp
            )
        }

        Row(Modifier.padding(top = 50.dp)){
            Text(
                text = "Not a member? ",
                color = Color(238,239,243),
                fontSize = 20.sp
            )
            Text(
                text = "Sign up Now.",
                color = Color(238,239,243),
                fontSize =20.sp,
                modifier = Modifier.clickable {
                    navController.navigate(Signup.route)
                }
            )
        }

    }
}
