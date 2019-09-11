package chapter3

/**
 * 
 *@author Fer Carraro
 *@date 11/09/2019
 *
 */

data class Contacto(
    val id:Long,
    var nombre:String, 
    var apellido:String,
    var email:String,
    var numeros:MutableList<String>){
    
    init{
        println("Objeto contacto creado e inicializado")
        println("Nombre: $nombre $apellido")
        println("Correo: $email")
        for(numero in numeros){
            println("$numero")
        }
    }

}