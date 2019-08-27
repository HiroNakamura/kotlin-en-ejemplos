package chapter1


fun saludar(nombre:String?=null):String{
   return "Hola, ${nombre}"
}

fun main(args: Array<String>) {
    val nombre:String = "John Wallager"
    println(saludar(nombre))
}
