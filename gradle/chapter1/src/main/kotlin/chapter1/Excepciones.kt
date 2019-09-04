
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
       println("Alguna Exception ha ocurrido: ${e.toString()}")
       e.printStackTrace();
    }
}
