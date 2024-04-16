package com.register.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.register.mvvm.ui.theme.screens.about.About
import com.register.mvvm.ui.theme.screens.home.Homescreen
import com.register.mvvm.ui.theme.screens.home1.Homefoods
import com.register.mvvm.ui.theme.screens.login.Logins
import com.register.mvvm.ui.theme.screens.register.Register


@Composable
fun Appnavhost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME
               ) { NavHost(navController = navController,
                   modifier=Modifier,
                   startDestination=startDestination){
                   composable(ROUTE_HOME){
                       Homescreen(navController)
                   }
    composable(ROUTE_ABOUT){
        About(navController)
    }
    composable(ROUTE_HOMEFOOD){
        Homefoods(navController)
    }
    composable(ROUTE_LOGIN){
        Logins(navController)
    }
    composable(ROUTE_REGISTER){
        Register(navController)
    }

}

}
