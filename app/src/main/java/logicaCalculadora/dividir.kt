package logicaCalculadora

class dividir(c: CharArray, p: Int) : calcular(c, p) {

    var texto_valor_uno = c.copyOfRange(0,p).concatToString()
    var texto_valor_dos = c.copyOfRange(p+1 , c.size).concatToString()
    var primerNumero = texto_valor_uno.toDouble()
    var segundoNumero = texto_valor_dos.toDouble()
    var resultado : Double = primerNumero!! / segundoNumero!!


    fun resultado_limpio () : String {
        var resultado_check : String = ""

        if (terminacion_cero(resultado.toString())==true) {
            var largo = resultado.toString().length
            resultado_check = resultado.toString().substring(0,largo-2)
        } else {
            resultado_check = resultado.toString()
        }


        return resultado_check
    }
}