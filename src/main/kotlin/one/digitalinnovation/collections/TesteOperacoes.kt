package one.digitalinnovation.collections

import kotlin.math.max

fun main() {
    val salarios = doubleArrayOf(1000.0, 2000.0, 4000.0)

    salarios.forEach { println(it) }

    println("--------------------------")

    //println(" Maior Salario: ${salarios.max()}")
    //println(" Maior Salario: ${salarios.min()}")
    println(" Media Salario: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter { it >1500.0 }
    println("--------------------------")
    salarioMaiorQue2500.forEach { println(it) }
}