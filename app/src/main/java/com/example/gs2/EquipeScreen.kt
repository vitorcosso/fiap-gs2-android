package com.example.gs2



import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun EquipeScreen(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text("Integrantes da Equipe:", style = MaterialTheme.typography.headlineSmall)

        Spacer(Modifier.height(10.dp))

        Text("RM 550186 - Thiago Scaciota")
        Text("RM 98231 - Vitor Cosso")


        Spacer(Modifier.height(30.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = { navController.navigate("menu") }
        ) {
            Text("Voltar ao Menu")
        }
    }
}
