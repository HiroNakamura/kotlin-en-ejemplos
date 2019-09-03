package chapter1

public interface ICalculo{
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
