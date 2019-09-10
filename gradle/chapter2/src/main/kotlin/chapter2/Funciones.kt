package chapter2

/**
*
*@author Fer Carraro
*@date 07/09/2019
*/

import spark.Spark.*


val departamentoDao = DepartamentoDao()

//http://localhost:4567/holaKotlin
fun getHola(){
   get("/holaKotlin") { req, res -> "Bienvenidos a Kotlin en ejemplos." }
}


fun rest_api(){
   
   path("/api") {
      
      get(""){ req, res->
         jacksonObjectMapper().writeValueAsString(departamentoDao.departamentos)
      }
   
   }
   
}
