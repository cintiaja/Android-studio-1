package mx.edu.utez.calculadora.ui.screens.Area

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class AreaViewModel: ViewModel() {
    var base by mutableStateOf("")
        private set
    var altura by mutableStateOf("")
        private set
    var resultado by mutableStateOf("")
        private set

    fun Basep(nuevo: String) {
        base = nuevo
    }

    fun alturap(nuevo: String) {
        altura = nuevo
    }

    fun Calcular() {
        val b = base.toDoubleOrNull()
        val h = altura.toDoubleOrNull()

        resultado = (if (b == null || h == null) {
            "Escribe nuemeros validos :)"

        } else {
            "Area: ${b * h / 2}"
        })


    }

}