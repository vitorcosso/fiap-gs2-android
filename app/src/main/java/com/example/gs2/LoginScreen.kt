package com.example.gs2

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
// RM 98231 Vitor Cosso
// RM 550186 Thiago Scaciota
@Composable
fun LoginScreen(navController: NavController) {

    var user by remember { mutableStateOf("") }
    var pass by remember { mutableStateOf("") }
    var error by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(value = user, onValueChange = { user = it }, label = { Text("Usuário") })
        Spacer(modifier = Modifier.height(10.dp))

        TextField(value = pass, onValueChange = { pass = it }, label = { Text("Senha") })
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            if (user == "admin" && pass == "123456") {
                error = ""
                navController.navigate("menu")
            } else {
                error = "Usuário inválido!"
            }
        }) {
            Text("Entrar")
        }

        if (error.isNotEmpty()) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(error, color = MaterialTheme.colorScheme.error)
        }
    }
}
