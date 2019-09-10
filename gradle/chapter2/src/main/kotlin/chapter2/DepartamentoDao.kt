package chapter2

/**
*@author Fer Carraro
*@date 09/09/2019
*/


import java.util.concurrent.atomic.AtomicLong

class DepartamentoDao{

    val departamentos = hashMapOf(1L to Departamento(1L, "Direccion General", "Thomas Muller")
    ,2L to Departamento(2L, "Recursos Humanos", "Irene Villa")
    ,3L to Departamento(3L, "Informatica", "Carlos Castelar")
    )

    var ultimoId: AtomicLong = AtomicLong(departamentos.size.toLong() - 1)
    
    fun save(nombre: String, responsable: String) {
        val id = ultimoId.incrementAndGet()
        departamentos.put(id, Departamento(id = id,nombre = nombre, responsable = responsable))
    }

    fun findById(id: Long): Departamento? {
        return departamentos[id]
    }

    fun findByNombre(nombre: String): Departamento? {
        return departamentos.values.find { it.nombre == nombre }
    }

    fun update(id: Long, nombre: String, responsable: String) {
        departamentos.put(id, Departamento(id = id, nombre = nombre, responsable = responsable))
    }

    fun delete(id: Long) {
        departamentos.remove(id)
    }

}
