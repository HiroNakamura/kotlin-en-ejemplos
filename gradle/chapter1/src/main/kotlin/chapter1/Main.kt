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
   println("${persona}")
   println("${servicioPersona.isMayor(persona)? 'Es mayor de edad' : 'Es menor de edad'}")
   println("${servicioPersona.getImc(persona)}")
}

fun main(args: Array<String>) {
    mockTestA()
    mockTestB()
}
