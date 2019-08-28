package chapter1

class PersonaServiceImpl:IPersonaService{
   
   override fun isMayor(persona:Persona):Boolean=persona.edad>18
   
   override fun getImc(persona:Persona):Double=persona.peso/(persona.talla*persona.talla)
   
}
