package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import net.objecthunter.exp4j.ExpressionBuilder

open class inicio : AppCompatActivity() {
    lateinit var visor_datos : TextView
    lateinit var resultado_visor : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interfaz)

        visor_datos = findViewById<TextView>(R.id.cargador_de_datos)
        resultado_visor = findViewById<TextView>(R.id.resultado_visor)


    }

    fun capturar(view : View){
        visor_datos.append((view as Button).text)
    }

    fun borrar(view : View){

        visor_datos.setText("")
        resultado_visor.setText("")
    }

    fun igualar (view : View) {
        val text = visor_datos.text.toString() //to string
        val eval = ExpressionBuilder(text).build()
        val res =eval.evaluate()
        resultado_visor.text = res.toString()
    }
}

