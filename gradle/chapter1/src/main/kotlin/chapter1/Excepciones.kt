
package chapter1

/**
*@author Fer Carraro
*@date 03/septiembre/2019
*/

fun excepcionTestA():Unit{
    try {
      println(45/0)
    }
    catch (e: Exception) {
        println("Alguna Exception ha ocurrido: ${e.toString()}")
    }
    finally {
    	println("Esto siempre se ejecutara")
    }
}
