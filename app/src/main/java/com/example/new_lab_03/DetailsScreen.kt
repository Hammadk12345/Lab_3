package com.example.new_lab_03

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)


@Composable
fun DetailsScreen(navController: NavHostController, name: String, imageId: String) {
    var rating by remember { mutableStateOf(0) }

    Scaffold(
        topBar = { UpperBar(navController) },
        content = { innerPadding ->
            Surface(
                color = Color.White,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
            ) {
                Column(Modifier.fillMaxSize(),horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.height(16.dp)) // Add space between UpperBar and StarRating
                    StarRating(
                        rating = rating,
                        onRatingChanged = { newRating ->
                            rating = newRating
                        }
                    )
                    Image(painter = painterResource(id = imageId), contentDescription = null)
                }

            }
        }
    )
}


@Composable
fun StarRating(
    rating: Int,
    onRatingChanged: (Int) -> Unit
) {
    Row(
        modifier = Modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        (1..5).forEach { index ->
            val iconRes = if (index <= rating) R.drawable.filled_star else R.drawable.outlne_star
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .clickable { onRatingChanged(index) }
            )
        }
    }
}

@Preview
@Composable

fun DetailsScreenPreview(){
//    DetailsScreen()
}