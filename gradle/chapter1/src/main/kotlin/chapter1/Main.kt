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
      var division = 9.0 / 0.0
   }catch(except:Exception){
      println("Ha ocurrido una Excepcion")
      except.printStackTrace()
   }
}

fun main(args: Array<String>) {
    //mockTestA()
    //mockTestB()
    mockTestC()
}
