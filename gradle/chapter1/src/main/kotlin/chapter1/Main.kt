package chapter1

fun saludar(nombre:String?=null):String{
   return "Hola, ${nombre}"
}

fun mockTestA():Unit{
   val nombre:String = "John Wallager"
   println(saludar(nombre))
}

fun mockTestB():Unit{
   val persona:Persona = Persona("Juan Jacobo","Rosseau",45,67.9,1.80)
   val servicioPersona:IPersonaService = PersonaServiceImpl()
   println("Nombre: ${persona.nombre} ${persona.apellido} - Edad: ${persona.edad}")
   val mayor =   if (servicioPersona.isMayor(persona)) "Es mayor de edad" else "Es menor de edad"  
   println("${persona.nombre} : ${mayor}")
   println("Imc: ${servicioPersona.getImc(persona)}")
}

fun mockTestC():Unit{
   println("#Mock Test C:")
   try{
      var division:Int = 9/0
      println("${division}")
   }catch(e: ArithmeticException){
      println("Ha ocurrido una ArithmeticExcepcion")
   }finally{
      println("Ha finalizado en bloque")
   }
}

fun mockTestD():Unit{
  var b:Byte = 10
  var s:Short = 123
  var c:Char = '\u9087'
  var e:Int = 123
  var l:Long = 12L
  var f:Float = 12.3f
  var d:Double = 123.90
  var verdadero:Boolean = true
  var cad:String = "El general no tiene quien le escriba"
  println("#Variables en Kotlin")
  println("Byte: ${b}")
  println("Short: ${s}")
  println("Char: ${c}")
  println("Int: ${e}")
  println("Long: ${l}")
  println("Float: ${f}")
  println("Double: ${d}")
  println("Boolean: ${verdadero}")
  println("String: ${cad}")
} 

fun mockTestE():Unit{
  val categoria:Categoria= Categoria.NORMAL
  println("${categoria}")
  (when(categoria){
    Categoria.STANDAR -> println("Precio Standard")
    Categoria.NORMAL -> println("Precio Normal")
    Categoria.VIP -> println("Precio VIP")
    Categoria.PREMIUM -> println("Precio PREMIUM")
    else -> {
      println("Precio PREMIUM")
    }
  })
}

fun main(args: Array<String>) {
    //mockTestA()
    //mockTestB()
    //mockTestC()
    //mockTestD()
    mockTestE()
}
