package chapter2

/**
*
*@author Fer Carraro
*@date 07/09/2019
*/

import spark.Spark.*


//http://localhost:4567/holaKotlin
fun getHola(){
   get("/holaKotlin") { req, res -> "Bienvenidos a Kotlin en ejemplos." }
}
