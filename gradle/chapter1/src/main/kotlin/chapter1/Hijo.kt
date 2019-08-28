package chapter1

class Hijo(override var nombre:String?=null, override var apellido:String?=null,override var edad:Int?=0.0, override var peso:Double?=0.0, override var talla:Double?=0.0):Persona(nombre,apellido,edad,peso,talla){
  init{
    println("Se ha creado e inicializado objeto 'Hijo'")
  }
}
