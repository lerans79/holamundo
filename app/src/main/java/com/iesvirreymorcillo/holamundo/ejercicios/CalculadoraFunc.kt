package com.iesvirreymorcillo.holamundo.ejercicios

fun add(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun subtract(num1: Double, num2: Double): Double {
    return num1 - num2
}

fun multiply(num1: Double, num2: Double): Double {
    return num1 * num2
}

fun divide(num1: Double, num2: Double): Double {
    if (num2 == 0.0) {
        println("Division by zero not allowed.")
        return Double.NaN // Indicate an error
    }
    return num1 / num2
}

fun main() {
    println("Calculadora")
    println("Introduce dos numeros:")

    val num1 = readLine()?.toDoubleOrNull()
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Entrada no valida. Por favor, introduce numeros.")
        return
    }

    println("Elige una operacion:")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicación")
    println("4. División")

    val choice = readLine()?.toIntOrNull()

    if (choice == null || choice !in 1..4) {
        println("Invalid choice.")
        return
    }

    val result = when (choice) {
        1 -> add(num1, num2)
        2 -> subtract(num1, num2)
        3 -> multiply(num1, num2)
        4 -> divide(num1, num2)
        else -> {
            println("Entrada no valida.")
            return
        }
    }

    if (!result.isNaN()) {
        println("Resultado: $result")
    }
}