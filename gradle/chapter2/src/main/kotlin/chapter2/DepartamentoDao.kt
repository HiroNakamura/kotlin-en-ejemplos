package chapter2

/**
*@author Fer Carraro
*@date 09/09/2019
*/


import java.util.concurrent.atomic.AtomicLong

class DepartamentoDao{

    val departamentos = hashMapOf(0 to Departamento(1L, "Direccion General", "Thomas Muller")
    ,1 to Departamento(2L, "Recursos Humanos", "Irene Villa")
    ,2 to Departamento(3L, "Informatica", "Carlos Castelar")
    )

    var ultimoId: AtomicLong = AtomicLong(departamentos.size.toLong() - 1)
    

}
