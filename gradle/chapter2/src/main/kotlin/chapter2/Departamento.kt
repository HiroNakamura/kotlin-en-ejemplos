package chapter2

/**
*@author Fer Carraro
*@date 09/09/2019
*/

import spark.Spark.*;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.*

data class Departamento(@SerializedName("id")val id:Long, 
@SerializedName("nombre")var nombre:String, 
@SerializedName("responsable")var responsable:String){
   init{
      println("Se ha creado e inicializado objeto Departamento")
   }
}
