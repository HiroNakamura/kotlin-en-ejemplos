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
https://javalin.io


Github:
https://github.com/tipsy/javalin/

