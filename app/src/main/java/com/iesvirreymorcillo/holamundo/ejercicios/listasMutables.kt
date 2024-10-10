package com.iesvirreymorcillo.holamundo.ejercicios

fun main() {
    val comida = mutableListOf<String>()
    val comida2: MutableList<String> = mutableListOf()

    //Si queremos declar la variable con valores
    val comida3 = mutableListOf("Pizza", "Hamburguesa", "Ensalada")

    println("Añade spaghetti: ${comida3.add("spaghetti")}")
    println("Lista de comida 3: $comida3")

    val masComida = listOf("ravioli", "lasagna", "fettuccine")

    println("Añade lista: ${comida3.addAll(masComida)}")
    println("Lista de comida 3: $comida3")

    println("Borra spaghetti: ${comida3.remove("spaghetti")}")
    println("Lista comida 3: $comida3")

    println("Borra el primer elemento: ${comida3.removeAt(0)}")
    println("Lista comida 3: $comida3")

    //comida3.clear()
    println("Lista borrada: $comida3")

    println("¿Lista vacia? ${comida3.isEmpty()}")

    var index = 0
    var totalInvitados1 = 0

    while (index < comida3.size) {
        totalInvitados1 += listOf(2, 4, 1, 3)[index]
        index++
    }
    //Otra manera
    val totalInvitados2 = listOf(2, 4, 1, 3).sum()
    println("Total invitados: $totalInvitados2")

    val nombres = listOf("Luis", "Laura", "Pepe", "Alicia", "Jose")
    for (nombre in nombres) {
        println("$nombre - Numero de caracteres : ${nombre.length}")
    }

}






