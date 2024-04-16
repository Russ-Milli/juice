package com.register.mvvm.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.register.mvvm.navigation.ROUTE_ABOUT
import com.register.mvvm.navigation.ROUTE_HOMEFOOD

@Composable
fun Homescreen(navController: NavHostController) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ){
        Text(text = "This is Homescreen",
            fontFamily = FontFamily.Monospace,
            fontSize = 25.sp,
            color = Color.Yellow)


        Button(onClick = {navController.navigate(ROUTE_HOMEFOOD)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "About",
                fontSize = 25.sp)

        }
    }





}

@Preview
@Composable
private fun Homeprev() {
    Homescreen(navController = rememberNavController())
}