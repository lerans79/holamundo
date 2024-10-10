package com.iesvirreymorcillo.holamundo.ejercicios

/**
 * Las entradas de cine suelen tener un precio diferente según la edad de los espectadores.
 *
 * En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que calcule los precios de estas entradas basados en la edad:
 *
 *     Un precio de entrada infantil de 3 € para personas de 12 años o menos.
 *     Un precio de entrada estándar de 8 € para personas de entre 13 y 60 años. Los lunes, un precio estándar con descuento de 6 €
 *     Un precio para adultos mayores de 5 € para personas de 61 años o más (asumimos que la edad máxima de un espectador es de 100 años)
 *     Un valor de -1 para indicar que el precio no es válido cuando un usuario ingresa una edad fuera de las especificaciones
 *
 */

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val x=5
    val y=8

    val isMonday = true
    println(if (x > y) "x is greater than y" else "x is not greater than y")

    println("El precio de la entrada para una persona de $child es de ${ticketPrice(child, isMonday)} €.")
    println("El precio de la entrada para una persona de $adult es de ${ticketPrice(adult, isMonday)} €.")
    println("El precio de la entrada para una persona de $senior es de ${ticketPrice(senior, isMonday)} €.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    when (age)
    {
        in 0..12 -> return 3
        in 13..60 -> return if (isMonday) 6 else 8
        in 61..100 -> return 5
        else -> return -1
    }
}

