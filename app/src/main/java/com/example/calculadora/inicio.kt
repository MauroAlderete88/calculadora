package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import logicaCalculadora.*
import logicaCalculadora.reglas_calculadora.terminacion_en_cero
import org.w3c.dom.Text
import net.objecthunter.exp4j.ExpressionBuilder
import java.util.ArrayList

open class inicio : AppCompatActivity() , terminacion_en_cero {
    //views
    lateinit var visor_datos : TextView
    lateinit var resultado_visor : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interfaz)

        visor_datos = findViewById<TextView>(R.id.cargador_de_datos)
        resultado_visor = findViewById<TextView>(R.id.resultado_visor)

    }

    /**
     * Esta captura los eventos de los botones y los muestra en el visor de la UI
     */
    fun capturar(view : View) {
        visor_datos.append((view as Button).text)
    }

    /**
     * Limpia los TextView de la UI
     */
    fun borrar(view : View){
        visor_datos.setText("")
        resultado_visor.setText("")
    }

    /**
     * Ejecuta la cuenta
     */
    fun igualar (view : View) {
        //convierte la cuenta introducida en un array
        var text = visor_datos.text.toString()
        var cadena : CharArray = text.toCharArray()


        if (cadena.contains('+')) {

            var posicion : Int =cadena.indexOf('+')
            val suma = suma(cadena,posicion)
            resultado_visor.setText(suma.resultado_limpio())

        } else if (cadena.contains('-')) {

            var posicion : Int =cadena.indexOf('-')
            val resta = resta(cadena,posicion)
            resultado_visor.setText(resta.resultado_limpio())


        } else if (cadena.contains('*')) {
            var posicion : Int =cadena.indexOf('*')
            val multiplicacion = multiplicar(cadena,posicion)
            resultado_visor.setText(multiplicacion.resultado_limpio())

        } else if (cadena.contains('/')){
            var posicion : Int =cadena.indexOf('/')
            val division = dividir(cadena,posicion)
            resultado_visor.setText(division.resultado_limpio())
        }




    }


}
