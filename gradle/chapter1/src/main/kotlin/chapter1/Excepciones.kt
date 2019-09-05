
package chapter1

/**
*@author Fer Carraro
*@date 03/septiembre/2019
*/

fun excepcionTestA():Unit{
    println("Excepciones:")
    try {
      println(45/0)
    }
    catch (e: Exception) {
        println("Alguna Exception ha ocurrido: ${e.toString()}")
        e.printStackTrace();
    }
    finally {
    	println("Esto siempre se ejecutara")
    }
}

fun excepcionTestB():Unit{
    println("Excepciones:")
    try{
       println(45/0)
    }
    catch(ae:ArithmeticException){
      println("Ha ocurrido una ArithmeticException: ${ae.toString()}")
    }
    catch(re:RuntimeException){
      println("Alguna RuntimeException ha ocurrido: ${re.toString()}")
    }
    catch(ex:Exception){
       println("Alguna Exception ha ocurrido: ${ex.toString()}")
       ex.printStackTrace();
    }
    finally{
       println("Ha finalizado el bloque")
    }
}


fun excepcionTestC(message:String):Nothing{
	throw RuntimeException(message)
}

fun excepcionTestD():Unit{
	println("##Excepciones:")
	val input = "123X";
	println("$input")
	val a = try { input.toInt() } catch (e: NumberFormatException) { null }
}


fun excepcionTestE():Unit{
  println("Excepciones:")
  var nombre:String = "12ED"
  try{
    val numero = nombre.toInt()
  }catch(re:RuntimeException){
    println("Ha ocurrido una RuntimeException: ${re.toString()}")
  }catch(e:Exception){
    println("Ha ocurrido una Exception: ${e.toString()}")
  }
  finally{
    println("Este bloque finaliza todo")
  }

  println()
  var tuNombre = "eusebio"
  try{
    tuNombre = tuNombre.capitalize()
  }finally{
    println("Nombre: $tuNombre")
  }



}








