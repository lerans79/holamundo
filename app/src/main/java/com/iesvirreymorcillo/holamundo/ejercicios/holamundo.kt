package com.iesvirreymorcillo.holamundo

//Esto es un comentario

/**
Esto es un conjunto de comentarios
 */
fun main() {

        for (i in 1..100){
                val multiplo3 = i % 3 == 0;
                val multiplo5 = i % 5 == 0;

                if (multiplo3 && multiplo5)
                        println("FizzBuzz")
                else if (multiplo3)
                        println("Fizz")
                else if (multiplo5)
                        println("Buzz")
                else
                        println(i)
        }

   // getMonth(4)
}

fun getMonth(number: Int) = when (number) {
        1 ->  "Enero"
        2 ->  "Febrero"
        3 ->  "Marzo"
        4 ->  "Abril"
        5 ->  "Mayo"
        6 ->  "Junio"
        7 ->  "Julio"
        8 ->  "Agosto"
        9 ->  "Septiembre"
        10 ->  "Octubre"
        11 ->  "Noviembre"
        12 ->  "Diciembre"
        else ->  "No es un mes valido"
  }


