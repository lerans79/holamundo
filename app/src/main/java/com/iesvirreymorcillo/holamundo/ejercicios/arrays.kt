package com.iesvirreymorcillo.holamundo.ejercicios

fun main()
{

        // Creo un array con arrayOf
        var arr1 = arrayOf(1,2,3,4,5,6,7,8,9,10)

        // Muestro el array
        println(arr1.joinToString())

        //Crea un array del 1 al 10. Usa emptyArray
        fun ejercicio1()
        {
                // Crear un array vacio
                var arr1 = emptyArray<Int>()

                // Muestro el array
                println(arr1.joinToString())

                // Relleno el array
                for (i in 1..10) {
                        arr1 += i
                }

                // Muestro el array de nuevo
                println(arr1.joinToString())
        }
        //2.	Crea un array del 1 al 10. Usa IntArray.
        fun ejercicio2()
        {
                // v1

                // Creo el array con IntArray
                var arr1 = IntArray(10)

                // Muestro el array
                println(arr1.joinToString())

                // Modifico los valores del array
                for (i in 1..10){
                        arr1[i - 1] = i
                }

                // Muestro el array
                println(arr1.joinToString())

                // v2

                // Creo el array con IntArray y lo relleno
                var arr2 = IntArray(10) { i -> i + 1 }

                // Muestro el array
                println(arr2.joinToString())

        }
        //3.	Crea un array del 1 al 10. Usa arrayOf
        fun ejercicio3()
        {
                // Creo un array con arrayOf
                var arr1 = arrayOf(1,2,3,4,5,6,7,8,9,10)

                // Muestro el array
                println(arr1.joinToString())
        }
        //4.	Crea un array del 1 al 5 y suma sus valores
        fun ejercicio4()
        {
        // Creo el array
                var arr1 = arrayOf(1,2,3,4,5)

                // Muestro la suma del array
                println("La suma de los valores es ${arr1.sum()}")
        }
        //5.	Crea un array del 1 al 5 y obten la media.
        fun ejercicio5()
        {
                // Creo el array
                var arr1 = arrayOf(1,2,3,4,5)

                // Muestro la media del array
                println("La media del array es ${arr1.average()}")
        }

        fun ejercicio6()
        {
                // Creo el array
                var arr1 = arrayOf(5,44,8,10,12)

                // Muestro el minimo y el maximo
                println("El maximo es ${arr1.max()} y el minimo es ${arr1.min()}")

        }
        //7.	Crea dos arrays y compara si son iguales
        fun ejercicio7()
        {
                // Creo dos arrays
                var arr1 = arrayOf(1,2,3,4,5)
                var arr2 = arrayOf(1,2,3,4,5)

                // Comparo si son o no iguales
                if(arr1 contentEquals arr2){
                        println("Son iguales")
                }else{
                        println("No son iguales")
                }
        }
        //8.	Crea un array del 1 al 5 y desordénalos
        fun ejercicio8(): Unit
        {
                // Creo el array
                var arr1 = arrayOf(1,2,3,4,5)

                // Lo desordeno
                arr1.shuffle()

                // Muestro el array
                println(arr1.joinToString())
        }

        //9.	Crea un array con valores desordenados y ordénalos
        fun ejercicio9()
        {
                // Creo el array
                var arr1 = arrayOf(1,2,3,4,5)

                // Desordeno el array
                arr1.shuffle()

                // Muestro el array desordenado
                println("Array desordenado: ${arr1.joinToString()}")

                // Ordeno del array (ascendente)
                arr1.sort()

                // Ordeno del array (descendente)
                // arr1.sortDescending()

                // Muestro el array
                println("Array ordenado: ${arr1.joinToString()}")
        }

}