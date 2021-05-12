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

    println("--------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("--------------------------")
    println(salarios.find { it == 2000.0 })
    println(salarios.find { it == 500.0 })

    println("--------------------------")
    println(salarios.any { it == 2000.0 })
    println(salarios.any { it == 500.0 })


}
