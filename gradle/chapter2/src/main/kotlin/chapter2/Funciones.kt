package chapter2

/**
*
*@author Fer Carraro
*@date 07/09/2019
*/

import spark.Spark.*
import spark.Request
import spark.Response
import com.fasterxml.jackson.databind.ObjectMapper


val departamentoDao = DepartamentoDao()
val objectMapper:ObjectMapper  = ObjectMapper();

//http://localhost:4567/holaKotlin
fun getHola(){
   get("/holaKotlin") { req, res -> "Bienvenidos a Kotlin en ejemplos." }
}


fun Request.qp(key: String): String = this.queryParams(key)

//http://localhost:4567/api/
fun rest_api(){
   
   path("/api") {
      
      //http://localhost:4567/api/departamentos
      get("/departamentos"){ req, res->
         objectMapper.writeValueAsString(departamentoDao.departamentos)
      }

      //http://localhost:4567/api/departamentos/1
      get("/departamentos/:id") { req, res ->
         departamentoDao.findById(req.params("id").toLong())
      }
      
      //http://localhost:4567/api/departamentos/Informatica
      get("/departamentos/:nombre") { req, res ->
        departamentoDao.findByNombre(req.params("nombre"))
      }
      
      //http://localhost:4567/api/departamentos/create
      post("/departamentos/create") { req, res ->
        departamentoDao.save(nombre = req.qp("nombre"), responsable = req.qp("responsable"))
        res.status(201)
        "ok"
      }
      
      //http://localhost:4567/api/departamentos/delete/1
      delete("/departamentos/delete/:id") { req, res ->
        departamentoDao.delete(req.params("id").toLong())
        "ok"
      }
      
      //http://localhost:4567/api/departamentos/update/1
      patch("/departamentos/update/:id") { req, res ->
        departamentoDao.update(
                id = req.params("id").toLong(),
                nombre = req.qp("nombre"),
                responsable = req.qp("responsable")
        )
         "ok"
       }
      
   }
   
}
