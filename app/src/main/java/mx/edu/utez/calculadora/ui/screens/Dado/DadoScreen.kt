package mx.edu.utez.calculadora.ui.screens.Dado

import android.annotation.SuppressLint
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.edu.utez.calculadora.R
import mx.edu.utez.calculadora.ui.screens.Area.AreaScreen
import mx.edu.utez.calculadora.ui.screens.Calculadora.CalculadoraScreen
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

@Composable
fun DadoScreen(viewModel: DadoViewModel,
               modifier: Modifier = Modifier,
               irCarculadora: () -> Unit,//menu
               irArea: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.d),
            contentDescription = "imagen de un dado"
        )
        Text(viewModel.resultado)
        Button({ viewModel.tirar_dado() }){Text("Tirar")}
        Text("Mas paginas:")
        Button(irCarculadora) { Text("Calculadora")}
        Button(irArea) { Text("Area Triangulo")}//menu

    }
}


@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun DadoScreenPreview(){
    val viewModel: DadoViewModel = DadoViewModel()
    CalculadoraTheme{
        DadoScreen(
            viewModel,
            Modifier.padding(16.dp),
            irCarculadora = {},
            irArea = {}
        )

    }
}



