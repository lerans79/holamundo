package com.iesvirreymorcillo.holamundo

fun main()
{
    val opciones= arrayOf("Piedra", "Papel", "Tijera")
    val opcMaquina=opciones.random()
    val opcJugador=getOpcJugador(opciones)
    imprimeResultado(opcMaquina, opcJugador)
}
//Recibe un array de opciones y devuelve una de ellas
fun getOpcJugador(opciones:Array<String>):String
{
    var valido=false
    var opcUsuario=""

    while(!valido)
    {
        println("Elige una opcion: ")
        for (i in opciones) print(" $i")
        println(".")
        val opc= readLine()
        if (opc != null && opc in opciones)
        {
            valido=true
            opcUsuario=opc
        }

        if (!valido) println("Opcion no valida")
    }
    return opcUsuario
}
//Recibe las ocpion elegida por la maquina y el jugador y muestra por pantalla la elección de cada uno
//y el resultado (ganar, perder o empate)
fun imprimeResultado(opcMaquina:String, opcJugador:String)
{
    val resultado: String

    if (opcMaquina==opcJugador) resultado="Empate"
    else if ((opcMaquina=="Piedra" && opcJugador=="Papel") ||
            (opcMaquina=="Papel" && opcJugador=="Tijera") ||
            (opcMaquina=="Tijera" && opcJugador=="Piedra")) resultado="Ganaste"
    else resultado="Perdiste"

    println("La maquina ha elegido $opcMaquina y tu has elegido $opcJugador. $resultado")
}