package chapter1

/**
*@author Fer Carraro
*@date 30/agosto/2019
*/

fun recorrer_array():Unit{
  val arregloString = arrayOf("Garita Perez","Kotlin for Beginners","Odiseo salva la granja")
  println("Tam: ${arregloString.size}}")
  println("Valor del indice 1: "+arregloString[1])
  println("Valor del indice 0: "+arregloString.get(0))
  
  //Recorrer sin índice
  arregloString.forEach(it->{
    println(it)
  });
  
  println()
  
  val arregloInteger:Array<Int>=arrayOf<Int>(0,1,2,3,4,5,6,7,8,9)
  for(var entero:Int in arregloInteger){
    println("Hola no. ${entero}")
  }
  
  
  
}
