# Javalin


A simple web framework for Java and Kotlin.


<b>Main.kt</b>

```java

import io.javalin.Javalin

fun main() {
    val app = Javalin.create().start(7000)
    app.get("/") { ctx -> ctx.result("Hello World") }
}
```



Sitio oficial:
* [Javalin](https://javalin.io)


Github:
* [Javalin en Github](https://github.com/tipsy/javalin/)

