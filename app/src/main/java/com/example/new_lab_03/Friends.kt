package com.example.new_lab_03


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun FriendsHome(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp, 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Friendsr",
            fontSize = 45.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Click on an eligible single user to learn more and see if you are compatible",
            fontSize = 20.sp,
            color = Color.Gray
        )

//        Row 1
        Row(Modifier.padding(vertical = 30.dp)){
            val route = "${Details.route}/Chandler/${R.drawable.chandler}"
            Box(Modifier.clickable{ navController.navigate(route)}){
                Column(
                    Modifier.padding(end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Image(painter = painterResource(id = R.drawable.chandler), contentDescription = null)
                    Text(
                        text = "Chandler",
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
            Box(Modifier.clickable{ navController.navigate(Details.route)}){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(id = R.drawable.joey), contentDescription = null)
                    Text(text = "Joey",
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }

        }

//        Row 2
        Row(Modifier.padding(bottom = 30.dp)){
            Box(Modifier.clickable{ navController.navigate(Details.route)}){
                Column(
                    Modifier.padding(end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Image(painter = painterResource(id = R.drawable.monica), contentDescription = null)
                    Text(text = "Monica",
                        modifier = Modifier.padding(top = 10.dp)

                    )
                }
            }
            Box(Modifier.clickable{ navController.navigate(Details.route)}){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(id = R.drawable.phoebe), contentDescription = null)
                    Text(text = "Phoebe",
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }

        }

//        Row 3
        Row(){
            Box(Modifier.clickable{ navController.navigate(Details.route)}){
                Column(
                    Modifier.padding(end = 10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Image(painter = painterResource(id = R.drawable.rachel), contentDescription = null)
                    Text(text = "Rachel",
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
            Box(Modifier.clickable{ navController.navigate(Details.route)}){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(id = R.drawable.ross), contentDescription = null)
                    Text(text = "Ross",
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }

        }



    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun FriendsHomePreview(){
//    FriendsHome()
}