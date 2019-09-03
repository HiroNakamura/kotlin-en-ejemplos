package chapter1

/**
*@author Fer Carraro
*@date 03/septiembre/2019
*/

interface ICalculo{
  val propiedad:Double
  
  fun mostrar(cadena:String):Unit{
      println("Valor $propiedad")
      println("$cadena")
  }
  
  fun getCalculo(dato:Any):Any
  
  fun fail(message: String): Nothing {
      throw IllegalStateException(message)
  }
  
}
