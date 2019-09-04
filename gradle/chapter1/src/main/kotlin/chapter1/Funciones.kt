package chapter1

/**
*@author Fer Carraro
*@date 30/agosto/2019
*/


import javax.swing.JOptionPane


fun Int.triple():Int{
   return this * 3
}

fun String.tam():Int{
   return this.length
}

fun Int.esMayor():Boolean{
    return this >= 18;
}

fun input_dato():String{
	return JOptionPane.showInputDialog("Introduce algo:")
}

fun print_dato(dato:String):Unit{
	JOptionPane.showMessageDialog(null, dato)
	System.exit(0)
}

fun saludar(nombre:String?=null):String{
   return "Hola, ${nombre}"
}

fun mockTestM():Unit{
  val calculo:CalculoServiceImpl = CalculoServiceImpl()
  println("Resultado = "+calculo.getCalculo(2019-1981))
}

fun mockTestL():Unit{
   ciclo_while()
   ciclo_for()
   val personas:List<Persona> = listOf<Persona>(Persona("Andres","Huertas",2019-1986,65.0,1.76),Persona("Tania","Martinez",2019-1987,70.0,1.70))
   recorrer_personas(personas)
}

//Excepciones
fun mockTestN():Unit{
  excepcionTestA()
  excepcionTestB()
  val dato = null?:excepcionTestC("Ha ocurrido una RuntimeException") 
  println("Dato: $dato")
  excepcionTestD()
}

fun mockTestO():Unit{
  println("Nada")
  excepcionTestE()
}


fun mayorEs(a:Int,b:Int):Int = if(a>b) a else b

fun menorEs(a:Int,b:Int):Int = if(a<b) a else b



fun mockTestK():Unit{
  var nombre:String="FER";
  println("$nombre -> tam: "+nombre.tam())
  nombre = "ABCDEFG"
  var tamanyo = nombre.tam()
  println("$nombre  -> tam: $tamanyo")
  var mayor = mayorEs(45,33)
  var menor = menorEs(12,43)
  println("Mayor de 45 y 33 -> $mayor : Menor de 12 y 43 -> $menor")
}

fun mockTestJ():Unit{
    recorrer_array()
    recorrer_lista()
    recorrer_mapa()
    recorrer_lista_mapa_mutables()
}


fun mockTestI():Unit{
	var nada:String?=null
	var saludar = when(nada){
		null -> "Hola, Kamyla!"
		else -> nada
	}
	println("$saludar")
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
  val CONSTANTE_STRING:String = "#Variables en Kotlin"
  var b:Byte = 10
  var s:Short = 123
  var c:Char = '\u9087'
  var e:Int = 123
  var l:Long = 12L
  var f:Float = 12.3f
  var d:Double = 123.90
  var verdadero:Boolean = true
  var cad:String = "El general no tiene quien le escriba"
  var cadena:String? = null
  val mostrar = if(cadena != null) cadena else "Hola,amigos!"
  println(CONSTANTE_STRING)
  println("Byte: ${b}")
  println("Short: ${s}")
  println("Char: ${c}")
  println("Int: ${e}")
  println("Long: ${l}")
  println("Float: ${f}")
  println("Double: ${d}")
  println("Boolean: ${verdadero}")
  println("String: ${cad}")
  println("Cadena: ${mostrar}")
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

fun mockTestF():Unit{
   var numero:Int = 9.triple()
   println("El triple de 9 es ${numero}")
   numero = 12.triple()
   println("El triple de 12 es ${numero}")
   numero = 45.triple()
   println("El triple de 45 es ${numero}")
}

fun mockTestG():Unit{
   var edad:Int = 18;
   if(edad.esMayor()){
      println("Eres mayor de edad, tu edad es ${edad}")
   }
}

fun mockTestH():Unit{
  var dato:String = input_dato()
  print_dato(dato)
}
