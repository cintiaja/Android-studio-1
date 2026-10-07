package mx.edu.utez.calculadora.ui.screens.Calculadora

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

@Composable
fun CalculadoraScreen (
    viewModel: CalculadoraViewModel = viewModel(),
    modifier: Modifier = Modifier
){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ){
        OutlinedTextField(
            viewModel.texto,
            { viewModel.onChanged(it) },
            modifier= Modifier.fillMaxWidth())
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ){
            Button({ viewModel.sumar() }){Text("+")}
            Button({ viewModel.restar() }){Text("-")}
            Button({ viewModel.multiplicacion() }){Text("*")}
            Button({ viewModel.division() }){Text("/")}
        }

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ){
            Button({ viewModel.clickOn1() }){Text("1")}
            Button({ viewModel.clickOn2() }){Text("2")}
            Button({ viewModel.clickOn3() }){Text("3")}
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ){
            Button({ viewModel.clickOn4() }){Text("4")}
            Button({ viewModel.clickOn5() }){Text("5")}
            Button({ viewModel.clickOn6() }){Text("6")}
        }
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ){
            Button({ viewModel.clickOn7() }){Text("7")}
            Button({ viewModel.clickOn8() }){Text("8")}
            Button({ viewModel.clickOn9() }){Text("9")}
        }
        Button({viewModel.resultado()}){Text("=")}
    }
}

@Preview(showBackground = true)
@Composable
fun CalculadoraScreenPreview(){
    CalculadoraTheme() {
        CalculadoraScreen(viewModel())
    }
}