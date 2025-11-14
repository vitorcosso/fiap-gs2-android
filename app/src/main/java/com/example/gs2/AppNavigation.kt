package com.example.gs2


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.gs2.ui.*
// RM 98231 Vitor Cosso
// RM 550186 Thiago Scaciota
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {

        composable("login") { LoginScreen(navController) }
        composable("menu") { MenuScreen(navController) }
        composable("imc") { ImcScreen(navController) }
        composable("equipe") { EquipeScreen(navController) }
    }
}
