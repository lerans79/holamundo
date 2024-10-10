package com.iesvirreymorcillo.holamundo.ejercicios

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val diasSemana: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println("List: $numbers")
    println("Día de la semana: $diasSemana")

    println("Tamaño de la lista numbers: ${numbers.size}")
    println("Tamaño de la lista diasSemana: ${diasSemana.size}")

    //Primer elemento de la lista
    println("First element: ${numbers[0]}")

    //Ultimo elemento de la lista
    println("Last element: ${numbers[numbers.size - 1]}")

    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    println("¿Está 4 en mi lista? ${numbers.contains(4)}")
    println("Está el Miercoles en mi lista? ${diasSemana.contains("Miercoles")}")

    println("Lista ordenada: ${diasSemana.sorted()}")
    println("Lista invertida: ${numbers.reversed()}")



}