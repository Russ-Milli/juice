package com.register.mvvm.ui.theme.screens.about

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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.register.mvvm.navigation.ROUTE_ABOUT
import com.register.mvvm.navigation.ROUTE_HOME

@Composable
fun About(navController:NavHostController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text(text = "This is about us page",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black
            )

        Button(onClick = {navController.navigate(ROUTE_HOME)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Home",
                fontSize = 25.sp)

        }
    }



}

@Preview
@Composable
private fun Aboutprev() {
    About(navController = rememberNavController())

}