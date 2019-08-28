package chapter1 

import kotlin.test.assertEquals
import org.junit.Test

fun saludar(nombre:String?=null):String{
    return "Hola, ${nombre}"
}
    
class TestSource{
    @Test fun f() {
        assertEquals("Hola, John Wallager", saludar("Hola, John Wallager"))
    }
}
