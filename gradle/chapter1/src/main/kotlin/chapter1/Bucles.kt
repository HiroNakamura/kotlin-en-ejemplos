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

  println()
  
}

fun recorrer_personas(personas:List<Persona>):Unit{
  println("\nRecorrer personas:")
  if(personas.size > 0){
    for(persona in personas){
      println("Hola ${persona.nombre} ${persona.apellido}")
    }
  }
}

fun do_while_input():Unit{
  var numero:Int
  do {
    println("Introduce un numero entre 1 y 100")
    numero = readLine()!!.toInt()
  } while(numero !in 1..100) 
}


fun do_while():Unit{
  var numero:Int = 0
  do{
    if(numero%4==0){
      println("$numero")
    }
  }while(numero++ < TAM)
}


fun ciclo_for(){
   var conteo:Int=0;
   val miLista = listOf("Aldebran","Casius","Andromeda","Apolo")
   println("#Ciclo for:")
  for(arg in liLista){
    println("$arg")
  }
  
  miLista.forEach{ item ->
        println(item)
  }
  
   //for range
  println("For range:")
   for(i in 0..TAM){
     if(i%3==0 && i%5==0){
       println("$conteo: $i")
     }
     conteo++;
   }
  println()
  //for collection
  println("For collection:")
  for(item in miLista){
    println("item: $item")
  }
  println()
  //for until
  println("For until:")
  for(i in 20 until TAM){
    if(i%5==0 && i%3==0){
      println("Ciao no. $i")
    }
  }
  println()
  //for downTo
  println("For downTo:")
  for(i in 40 downTo 0){
    if(i%5==0 && i%3==0){
      println("Ciao no. $i")
    }
  }
  println()
  //for downTo, step
  println("For downTo, step:")
  for(i in TAM downTo 0 step 10){
    if(i%5==0 && i%3==0){
      println("Ciao no. $i")
    }
  }
  println()
  println("For in ..  continue:")
  for (num in 1..10) {
    if (num % 2 == 0) {
        continue
    }
    print("$num ")
  }
  println()
  println("For in .. break")
  for (num in 1..10) {
    if (num % 5 == 0) {
        break
    }
    print("$num ")
  }
  
  
  
}
