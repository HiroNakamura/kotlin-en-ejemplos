import io.javalin.Javalin

/**
*@author Fer Carraro
*@date 11/09/2019
*/


//http://localhost:8888/saludo
fun mockTestA() {
    val app = Javalin.create().start(8888)
    app.get("/saludo") { ctx -> ctx.result("Javalin for Kotlin.") }
}
