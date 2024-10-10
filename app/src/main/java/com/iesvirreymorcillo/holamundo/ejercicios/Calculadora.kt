package com.iesvirreymorcillo.holamundo.ejercicios

fun main() {
    println("Simple Calculator")
    println("Enter two numbers:")

    val num1 = readLine()?.toDoubleOrNull()
    val num2 = readLine()?.toDoubleOrNull()

    if (num1 == null || num2 == null) {
        println("Invalid input. Please enter numbers only.")
        return
    }

    println("Select operation:")
    println("1. Add")
    println ("2. Subtract")
    println("3. Multiply")
    println("4. Divide")

    val choice = readLine()?.toIntOrNull()

    if (choice == null || choice !in 1..4) {
        println("Invalid choice.")
        return
    }

    val result = when (choice) {
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> if (num2 == 0.0) {
            println("Division by zero not allowed.")
            return
        } else {
            num1 / num2
        }

        else -> {
            println("Invalid choice.")
            return
        }
    }

    println("Result: $result")
}

