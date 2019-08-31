package chapter1


/**
*
*@author Fer Carraro
*@date 30/agosto/2019
*/

val TAM:Int = 100

fun ciclo_while():Unit{
  var cont:Int = 0
  println("#Ciclo while:")
  while(cont++ < TAM){
     if(cont%3 == 0 and cont%5==0){
       println("Hola no. $cont")
     }
  }
}
