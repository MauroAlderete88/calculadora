package logicaCalculadora

import logicaCalculadora.reglas_calculadora.terminacion_en_cero

open class calcular (c : CharArray , p :Int) : terminacion_en_cero {

    internal var cadena : CharArray ?= null
    internal var posicion : Int ?= null

    init {
        this.cadena = c
        this.posicion = p
    }



}