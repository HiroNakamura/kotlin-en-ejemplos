package chapter3


import io.javalin.Javalin


//http://localhost:8888/saludo
fun mockTestA() {
    val app = Javalin.create().start(8888)
    app.get("/saludo") { ctx -> ctx.result("Javalin for Kotlin.") }
}

//http://localhost:7000/contacto
fun mockTestB(){
    val app = Javalin.create().start(7000)
    val telefonos:MutableList<String> = mutableListOf("555-432","555-122")
    val cliente = Contacto(1L,"Joaquin","Perdave","perdave.joaquin@gmail.com",telefonos)
    app.get("/contacto"){ ctx -> ctx.result(cliente.toString())  }
}
