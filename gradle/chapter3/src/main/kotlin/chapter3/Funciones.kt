package chapter3


import io.javalin.Javalin


//http://localhost:8888/saludo
fun mockTestA() {
    val app = Javalin.create().start(8888)
    app.get("/saludo") { ctx -> ctx.result("Javalin for Kotlin.") }
}
