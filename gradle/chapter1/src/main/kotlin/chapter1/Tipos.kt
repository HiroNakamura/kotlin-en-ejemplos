package chapter1


/**
*
*@author Fer Carraro
*@date 01/diciembre/2019
*/



fun tipos():Unit{
  //Decimales sin punto flotante
  val b: Byte = 2
  val s: Short = 3
  val i:Int = 32
  val clave: Long = 2344L

  //Numéricos con valor flotante
  val real:Float = 34.5f
  val numero:Double = 354.90

  //Caracter
  var caracter:Char = '\u9090'

  //Boooleano
  val verdadero:Boolean = 34 > 21

  //String
  val cadena: String = "Aprendiendo Kotlin comosi fuera en primero."

  //Array
  var numeros:Array<Int> = arrayOf(0,9,8,7,6,5);

  //Lista
  var miLista:List<String> =listOf("java","kotlin","ceylon","groovy","scala"); 

  println("Byte: $b")
  println("Short: $s")
  println("Int: $i")
  println("Long: $clave")
  println("Float: $real")
  println("Double: $numero")
  println("Char: $caracter")
  println("Boolean: $verdadero")
  println("String: $cadena")
  println("Array: $numeros")
  println("List: $miLista")
}
