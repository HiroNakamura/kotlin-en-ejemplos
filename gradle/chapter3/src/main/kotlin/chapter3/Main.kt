package chapter3

/**
*@author Fer Carraro
*@date 11/09/2019
*/

import io.javalin.Javalin

fun main() {
    val app = Javalin.create().start(8888)
    //http://localhost:8888/saludo
    app.get("/saludo") { ctx -> ctx.result("Javalin for Kotlin") }
}
