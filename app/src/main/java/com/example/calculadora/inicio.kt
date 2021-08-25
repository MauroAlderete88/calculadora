package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import net.objecthunter.exp4j.ExpressionBuilder
import java.util.ArrayList

open class inicio : AppCompatActivity() {
    lateinit var visor_datos : TextView
    lateinit var resultado_visor : TextView

    var primerNumero: Double? = null
    var segundoNumero: Double? = null

    var signo : Char?= null

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
        var resultado : Double? = null
        if (cadena.contains('+')) {
            var posicion : Int =cadena.indexOf('+')
            var texto_valor_uno = cadena.copyOfRange(0,posicion).concatToString()
            var texto_valor_dos = cadena.copyOfRange(posicion+1 , cadena.size).concatToString()
            primerNumero = texto_valor_uno.toDouble()
            segundoNumero = texto_valor_dos.toDouble()

           var resultado : Double = primerNumero!! + segundoNumero!!
            resultado_visor.setText(resultado.toString())


        } else if (cadena.contains('-')) {
            var posicion : Int =cadena.indexOf('-')
            var texto_valor = cadena.copyOfRange(0,posicion).concatToString()
            var texto_valor_ = cadena.copyOfRange(posicion+1 , cadena.size).concatToString()
            primerNumero = texto_valor.toDouble()
            segundoNumero = texto_valor_.toDouble()

            var resultado : Double = primerNumero!! - segundoNumero!!
            resultado_visor.setText(resultado.toString())
        } else if (cadena.contains('*')) {
            var posicion : Int =cadena.indexOf('*')
            var t = cadena.copyOfRange(0,posicion).concatToString()
            var te = cadena.copyOfRange(posicion+1 , cadena.size).concatToString()
            primerNumero = t.toDouble()
            segundoNumero = te.toDouble()

            var resultado : Double = primerNumero!! * segundoNumero!!
            resultado_visor.setText(resultado.toString())
        } else if (cadena.contains('/')){
            var posicion : Int =cadena.indexOf('/')
            var or_uno = cadena.copyOfRange(0,posicion).concatToString()
            var r_dos = cadena.copyOfRange(posicion+1 , cadena.size).concatToString()
            primerNumero = or_uno.toDouble()
            segundoNumero = r_dos.toDouble()

            var resultado : Double  = primerNumero!! / segundoNumero!!
            resultado_visor.setText(resultado.toString())
        }




    }


}

