package chapter1

/**
*@author Fer Carraro
*@date 30/agosto/2019
*/

class PersonaServiceImpl:IPersonaService{
   
   override fun isMayor(persona:Persona):Boolean=persona.edad>18
   
   override fun getImc(persona:Persona):Double=persona.peso/(persona.talla*persona.talla)
   
}
