package chapter1

open class Persona(var nombre:String?=null, var apellido:String?=null
,var edad:Int?=0, var peso:Double?=0.0, var talla:Double?=0.0)
{
  
  init
  {
    println("Se ha creado e inicializado objeto 'Persona'")   
  }
  
 }
