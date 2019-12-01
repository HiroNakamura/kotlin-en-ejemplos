# Kotlin básico

![kotlin](https://4.bp.blogspot.com/-Xr7vhY92ZOo/XEZaKcUTARI/AAAAAAAADFQ/mD7bj8Oi7nMIt_aKbYHQ91e2FT2vDLMQACLcBGAs/s1600/kotlin.png)

**Kotlin** al ser un lenguaje de programacón dependiente de la JVM nos permite interoperar con el lenguaje **Java**.

## Hola, mundo!

El clásico programa.

```java

package com.inforhomex

/**
*@author Fer Carraro
*@date 2019
*/

fun main(args:Array<String>){
	println("Hola, mundo!");
}

```
## Tipos de datos en Kotlin

```java
//Decimales sin punto flotante

val b: Byte = 2
val s: Short = 3
val i:Int = 32
val clave: Long = 2344L

//Numéricos con valor flotante
val real:Float = 34.5f
val numero:Double = 354.90

//Caracter
var caracter:Char = '\u9090'

//Boooleano
val verdadero:Boolean = 34 > 21

//String
val cadena: String = "Aprendiendo Kotlin comosi fuera en primero."

//Array
var numeros:Array<Int> = arrayOf(0,9,8,7,6,5);

//Lista
var miLista:List<String> =listOf("java","kotlin","ceylon","groovy","scala"); 

println("Byte: $b")
println("Short: $s")
println("Int: $i")
println("Long: $clave")
//...
//...
println("String: $cadena")
```
