package mx.edu.utez.calculadora.ui.screens.Dado

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlin.random.Random


class DadoViewModel: ViewModel() {

    var resultado by mutableStateOf("")

    fun tirar_dado(){
        resultado = Random.nextInt(1,7).toString()
    }


}