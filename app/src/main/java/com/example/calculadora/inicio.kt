package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

open class inicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interfaz)
        var uno: Button = findViewById<Button>(R.id.boton_uno)
        var dos: Button = findViewById<Button>(R.id.boton_dos)
        var tres: Button = findViewById<Button>(R.id.boton_tres)
        var cuatro: Button = findViewById<Button>(R.id.boton_cuatro)
        var cinco: Button = findViewById<Button>(R.id.boton_cinco)
        var seis: Button = findViewById<Button>(R.id.boton_seis)
        var siete: Button = findViewById<Button>(R.id.boton_siete)
        var ocho: Button = findViewById<Button>(R.id.boton_ocho)
        var nueve: Button = findViewById<Button>(R.id.boton_nueve)
        var cero: Button = findViewById<Button>(R.id.boton_cero)
        var mas: Button = findViewById<Button>(R.id.boton_sumar)
        var menos: Button = findViewById<Button>(R.id.boton_restar)
        var multiplicar: Button = findViewById<Button>(R.id.boton_multiplicar)
        var dividir: Button = findViewById<Button>(R.id.boton_dividir)
        var coma : Button = findViewById<Button>(R.id.boton_coma)
        var visor_datos = findViewById<TextView>(R.id.cargador_de_datos)
        var borrar : Button = findViewById<Button>(R.id.boton_borrar)
        var lista = ""



        fun mostrar(){
            visor_datos.setText(lista)
        }

           uno.setOnClickListener {
                lista += "1"
                mostrar()
            }
            dos.setOnClickListener {
                lista += "2"
                mostrar()
            }
            tres.setOnClickListener {
                lista += "3"
                mostrar()
            }
            cuatro.setOnClickListener {
                lista += "4"
                mostrar()
            }
            cinco.setOnClickListener {
                lista += "5"
                mostrar()
            }
            seis.setOnClickListener {
                lista += "6"
                mostrar()
            }
            siete.setOnClickListener {
                lista += "7"
                mostrar()
            }
            ocho.setOnClickListener {
                lista += "8"
                mostrar()
            }
            nueve.setOnClickListener {
                lista += "9"
                mostrar()
            }
            cero.setOnClickListener{
                lista+="0"
                mostrar()
            }
            mas.setOnClickListener {
                lista += "+"
                mostrar()
            }
            menos.setOnClickListener {
                lista += "-"
                mostrar()
            }
            multiplicar.setOnClickListener {
                lista += "x"
                mostrar()
            }
            dividir.setOnClickListener {
                lista += "%"
                mostrar()
            }
            coma.setOnClickListener {
                lista += ","
                mostrar()


        }

     }



    }



//En inicio tendria que tener metodos de sintaxis matematica, por ejemplo la posicion del cero y la coma
    //Este metodo escribirlo una vez sola y que los hijos lo hereden asi se escribe una sola vez.


