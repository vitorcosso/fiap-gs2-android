package com.example.gs2


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
// RM 98231 Vitor Cosso
// RM 550186 Thiago Scaciota
@Composable
fun ImcScreen(navController: NavController) {

    var nome by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().padding(20.dp)) {

        TextField(value = nome, onValueChange = { nome = it }, label = { Text("Seu Nome") })
        Spacer(Modifier.height(10.dp))

        TextField(value = peso, onValueChange = { peso = it }, label = { Text("Peso (kg)") })
        Spacer(Modifier.height(10.dp))

        TextField(value = altura, onValueChange = { altura = it }, label = { Text("Altura (m)") })
        Spacer(Modifier.height(20.dp))

        Button(onClick = {
            val p = peso.toDoubleOrNull()
            val a = altura.toDoubleOrNull()

            if (p != null && a != null && a > 0) {
                val imc = p / (a * a)
                resultado = "$nome, seu IMC é %.2f".format(imc)
            } else {
                resultado = "Valores inválidos!"
            }

        }) {
            Text("Calcular IMC")
        }

        Spacer(Modifier.height(20.dp))

        if (resultado.isNotEmpty()) {
            Text(resultado)
        }

        Spacer(Modifier.height(30.dp))

        Button(onClick = { navController.navigate("menu") }) {
            Text("Voltar ao Menu")
        }
    }
}
