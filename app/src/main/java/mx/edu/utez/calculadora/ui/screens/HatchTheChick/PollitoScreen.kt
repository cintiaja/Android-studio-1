package mx.edu.utez.calculadora.ui.screens.HatchTheChick

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import mx.edu.utez.calculadora.ui.theme.CalculadoraTheme

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun PollitoSreen (){
    var huevo by remember { mutableStateOf(false) }
    Column() {
        Text("HATCH THE CHICK!!")
        AnimatedContent(//anima el cambio entre dos cosas distintos
            targetState = huevo,//este es el que hace que
            //se logre, cada que el huevo ( varuiable) cambie de false a true
            //arranca la animacion(es el interruptor)
            transitionSpec = {//aqui se decide la animacion o bueno como de hace
                fadeIn(tween(800)) togetherWith fadeOut(tween(800))
                //fedeInt: el contenido se muestra poco a poco, fedeOut: el contenido anterior se desaparece.
                //togetherWith: al mismo tiempo, y el tween (800): dura 800 milisegundos
            }
        ){eclosianado ->//el contenido, es como la funcion que decide como esta la cosa
            Text (if (eclosianado) "🐣" else "🥚")//si es true (if) sale el pollo, si es false ( el valor actual de pollo, se queda en huevo.
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PollitoSreenPreview (){
    CalculadoraTheme() {
        PollitoSreen()
    }
}