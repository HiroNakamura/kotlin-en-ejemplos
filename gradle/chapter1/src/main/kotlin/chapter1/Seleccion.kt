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
       1 -> "Has elegido comer la pastilla de la fantasía"
       2 -> "Has elegido el libro de los secretor de Don Gaspar"
       else ->{
          "En un horizonte se ha presentado el señor conejo"
       }
    }
    println("$resultado")
}
