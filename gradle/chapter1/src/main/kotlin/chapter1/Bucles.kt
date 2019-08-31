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
     if(cont%3 == 0 && cont%5==0){
       println("Hola no. $cont")
     }
  }
  
  println()
  cont = 0
  while(cont < TAM){
    if(cont%4==0){
      println("$cont")
    }
    cont++;
  }
  
}


fun ciclo_for(){
   var conteo:Int=0;
   val miLista = listOf("Aldebran","Casius","Andromeda","Apolo")
   println("#Ciclo for:")
   //for range
   for(i in 0..TAM){
     if(i%3==0 && i%5==0){
       println("$conteo: $i")
     }
     conteo++;
   }
  println()
  //for collection
  for(item in miLista){
    println("item: $item")
  }
  println()
  //for until
  for(i in 20 until TAM){
    if(i%5==0 && i%3==0){
      println("Ciao no. $i")
    }
  }
  println()
  //for downTo
  for(i in 40 downTo 0){
    if(i%5==0 && i%3==0){
      println("Ciao no. $i")
    }
  }
  println()
  //for downTo, step
  for(i in TAM downTo 0 step 10){
    if(i%5==0 && i%3==0){
      println("Ciao no. $i")
    }
  }
  
  
}
