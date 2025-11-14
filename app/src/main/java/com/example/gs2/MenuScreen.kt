package com.example.gs2


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("imc") }
        ) {
            Text("Cálculo de IMC")
        }

        Spacer(Modifier.height(20.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("equipe") }
        ) {
            Text("Equipe")
        }

        Spacer(Modifier.height(20.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("login") }
        ) {
            Text("Sair (Login)")
        }
    }
}
