package chapter1

/**
*@author Fer Carraro
*@date 30/agosto/2019
*/

class Hijo(override var nombre:String, 
           override var apellido:String,
           override var edad:Int, 
           override var peso:Double, 
           override var talla:Double):Persona(nombre,apellido,edad,peso,talla){
  init{
    println("Se ha creado e inicializado objeto 'Hijo'")
  }
}
