package chapter1

class CalculoServiceImpl:ICalculo{

    override val propiedad: Double = 29.0

    override fun getCalculo(dato:Any):Any{
        //val mi_dato = dato==null?: fail("${dato} no ha sido definido")
        var resultado:Any = 220.0-dato.toString().toDouble()
        return resultado;
    }

    override fun fail(message: String): Nothing {
        throw IllegalStateException(message)
    }

    override fun mostrar(cadena:String):Unit{
        println("Valor $propiedad")
        println("$cadena")
    }
}
