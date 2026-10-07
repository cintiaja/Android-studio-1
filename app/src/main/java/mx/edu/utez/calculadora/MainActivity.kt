package mx.edu.utez.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.edu.utez.calculadora.ui.screens.Area.AreaScreen
import mx.edu.utez.calculadora.ui.screens.Area.AreaViewModel
import mx.edu.utez.calculadora.ui.screens.Calculadora.CalculadoraScreen
import mx.edu.utez.calculadora.ui.screens.Calculadora.CalculadoraViewModel
import mx.edu.utez.calculadora.ui.screens.Dado.DadoScreen
import mx.edu.utez.calculadora.ui.screens.Dado.DadoViewModel
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel1 = CalculadoraViewModel()
        val viewModel = DadoViewModel()
        val viewModel2 = AreaViewModel()
        setContent {
            CalculadoraTheme {
                var pantalla by remember { mutableStateOf("dado") }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    when (pantalla) {
                        "dado" -> DadoScreen(
                            viewModel,
                            Modifier.padding(innerPadding),
                            irCarculadora = { pantalla = "calculadora" },
                            irArea = { pantalla = "area" }
                        )
                            "calculadora" -> CalculadoraScreen(
                                viewModel1,
                                Modifier.padding(innerPadding)
                            )
                            "area" -> AreaScreen(
                                viewModel2,
                                Modifier.padding(innerPadding)
                                )
                        }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalculadoraTheme {
        Greeting("Android")
    }
}