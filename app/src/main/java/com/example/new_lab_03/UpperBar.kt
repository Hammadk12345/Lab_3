package com.example.new_lab_03

import androidx.compose.foundation.clickable
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController

@Composable
fun UpperBar(navController: NavHostController) {
    TopAppBar(
        title = { Text(text = "Details Activity") },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.ArrowBack,
                    contentDescription = null,
                    Modifier.clickable { navController.navigate(Friends.route)}
                )

            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.MoreVert, contentDescription = null)
            }
        },
        backgroundColor = Color.Black,
        contentColor = Color.White,
    )
}




@Preview
@Composable

fun UpperBarPreview(){
//    UpperBar()
}