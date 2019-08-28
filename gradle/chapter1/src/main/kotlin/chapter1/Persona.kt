package chapter1

open class Persona(open var nombre:String?=null,
                   open var apellido:String?=null,
                   open var edad:Int?=0,
                   open var peso:Double?=0.0,
                   open var talla:Double?=0.0){
  init{
    println("Se ha creado e inicializado objeto 'Persona'")   
  }
  
  init{
    println("Nombre ${nombre}  ${apellido}")
  }
  
 }
