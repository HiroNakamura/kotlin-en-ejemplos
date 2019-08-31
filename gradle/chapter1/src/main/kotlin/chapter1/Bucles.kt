package chapter1


/**
*
*@author Fer Carraro
*@date 30/agosto/2019
*/

val TAM:Int = 100

fun ciclo_while():Unit{
  var cont:Int = 0
  while(cont++ < TAM){
     println("Hola no. $cont")
  }
}
