package chapter1

fun saludar(nombre:String?=null):String{
   return "Hola, ${nombre}"
}

fun mockTestA():Unit{
   val nombre:String = "John Wallager"
   println(saludar(nombre))
}

fun main(args: Array<String>) {
    mockTestA()
}
