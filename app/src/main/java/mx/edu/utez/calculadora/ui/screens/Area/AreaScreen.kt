package mx.edu.utez.calculadora.ui.screens.Area

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

@Composable
fun AreaScreen (
    viewModel: AreaViewModel = viewModel(),
    padding: Modifier,//lo conectamos a el otro archivo
){
    Column(
        modifier = Modifier.padding(100.dp),//escoge el tamaño de la plantilla
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )  {
        Text("CALCULA LA AREA DE UN TRIANGULO")
        Text("Base:")
        TextField(
            value = viewModel.base,
            onValueChange = {viewModel.Basep(it)},//se hace el panel para que el usuario escriba
            label = {Text("Escribe aqui")}
        )
        Text("Altura:")
        TextField(
            value = viewModel.altura,//se conecta a viewmodel que es la parte loghica de el programa
            onValueChange = {viewModel.alturap(it)},
            label = {Text("Escribe aqui")}
        )
        Button(onClick={viewModel.Calcular()}){
            Text("guardar")
        }
        Text(viewModel.resultado)

    }
}
@Preview(showBackground = true)//esto es lo que hace que la pantalla se pueda ver
@Composable
fun AreaSreenPreview (){
    CalculadoraTheme() {
        AreaScreen(padding = Modifier.padding(16.dp))
    }
}