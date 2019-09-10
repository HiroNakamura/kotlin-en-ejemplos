package chapter2

/**
*@author Fer Carraro
*@date 09/09/2019
*/

data class Departamento(val id:Long, var nombre:String, var responsable:String){
   init{
      println("Se ha creado e inicializado objeto Departamento")
   }
}
