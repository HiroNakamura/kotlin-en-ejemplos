package chapter1

open class Persona(open var nombre:String,
                   open var apellido:String,
                   open var edad:Int,
                   open var peso:Double,
                   open var talla:Double){
  init{
    println("Se ha creado e inicializado objeto 'Persona'")   
  }
  
  init{
    println("Nombre ${nombre}  ${apellido}")
  }
  
 }
