package chapter1 

import kotlin.test.assertEquals
import org.junit.Test

class TestSource{
    @Test fun f() {
        assertEquals("Hola, John Wallager", saludar("Hola, John Wallager"))
    }
}
