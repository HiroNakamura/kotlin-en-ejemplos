package chapter1

/**
*@author Fer Carraro
*@date 06/09/2019
*/

fun seleccion_if(edad:Int):Unit{
  if(edad == 18 || edad > 18){
    println("Ya estas listo para votar")
  }else{
    println("Todavia no puedes votar")
  }
  
  var resultado = if (edad == 18 || edad > 18) "Ya estas listo para votar" else "Todavia no puedes votar"
  println("$resultado")
} 

fun seleccion_when(opc:Int):Unit{
    val resultado = when(opc){
       1 -> "Has elegido comer la pastilla de la fantasía."
       2 -> "Has elegido el libro de los secretos del Péndulo de Foucault."
       3 -> "Las interminencias del tablero de las llamas." 
       in 4..10 -> "Las fabulosas galletas de la abuela."
       else ->{
          "En un horizonte se ha presentado el señor conejo."
       }
    }
    println("$resultado")
}

fun seleccion_when_any(dato:Any):String{
    val resultado = when(dato){
       is Byte -> "El dato $dato es Byte."
       is Short -> "El dato $dato es Short."
       is Char -> "El dato $dato es Char."
       is Int -> "El dato $dato es Int."
       is Long -> "El dato $dato es Long."
       is Float -> "El dato $dato es Float."
       is Double -> "El dato $dato es Double."
       is Boolean -> "El dato $dato es Boolean."
       is String -> "El dato $dato es String."
       else ->{
          "No es un dato conocido"
       }
    }
  return resultado;
}
