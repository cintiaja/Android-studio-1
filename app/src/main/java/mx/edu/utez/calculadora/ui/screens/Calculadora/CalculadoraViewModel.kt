package mx.edu.utez.calculadora.ui.screens.Calculadora

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculadoraViewModel: ViewModel() {

    //Variables para los operandos, los operadores
    var operando1 by mutableStateOf("")
    var operando2 by mutableStateOf("")
    var operador by mutableStateOf("")
    var texto by mutableStateOf("")

    //Funciones para los botones
    fun clickOn1(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "1"
    }
    fun clickOn2(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "2"
    }
    fun clickOn3(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "3"
    }
    fun clickOn4(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "4"
    }
    fun clickOn6(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "6"
    }
    fun clickOn8(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "8"
    }
    fun clickOn9(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "9"
    }
    fun clickOn0(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "0"
    }
    fun clickOn7(){
        //Cuando le demos click en 7 se agregue el numero al input
        texto += "7"
    }

    fun clickOn5(){
        //Cuando le demos click en 5 se agregue el numero al input
        texto += "5"
    }

    //Función para el input
    fun onChanged(texto_input: String){
        texto = texto + texto_input
    }

    //función de la operación
    fun sumar(){
        if(!operador.equals("+")){
            operador = "+" //guardar el tipo de operación
            operando1 = texto //guardar el numero 1
            texto = "" //limpiar el input
        }
    }
    fun restar(){
        if(!operador.equals("-")){
            operador = "-" //guardar el tipo de operación
            operando1 = texto //guardar el numero 1
            texto = "" //limpiar el input
        }
    }
    fun multiplicacion(){
        if(!operador.equals("*")){
            operador = "*" //guardar el tipo de operación
            operando1 = texto //guardar el numero 1
            texto = "" //limpiar el input
        }
    }
    fun division(){
        if(!operador.equals("/")){
            operador = "/" //guardar el tipo de operación
            operando1 = texto //guardar el numero 1
            texto = "" //limpiar el input
        }
    }
    fun resultado(){
        operando2 = texto
        texto = ""
        when(operador){
            "+" -> texto = (operando1.toDouble() + operando2.toDouble()).toString()
        }
    }

}