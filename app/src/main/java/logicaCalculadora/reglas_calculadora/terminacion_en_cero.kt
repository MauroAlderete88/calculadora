package logicaCalculadora.reglas_calculadora

/**
 * La calculadora se ejecuta en variables tipo Double, por ende su terminacion siempre es en .0
 * La idea de esto es sacarle ese .0 cuando el numero sea redondo.
 */
interface terminacion_en_cero {

    fun terminacion_cero (resultado : String) : Boolean {
        var cadena : Int = resultado.length
        if (resultado.substring(cadena-2,cadena).equals(".0")){
          return true
        } else {
            return false
        }

    }


}