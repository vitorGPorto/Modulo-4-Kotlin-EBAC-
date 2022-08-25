package com.porto.exerciciomodulo04

import kotlin.reflect.KFunction2

class Atividade01 {


}

fun main() {

    println("Exercício 01")
    soma(2,3);

    println("Exercício 02 ")
    multiplicacao(5,9)
    println("Exercício 03 ")
    calculadora(3,4,::soma)
    calculadora(3, 4, ::multiplicacao)
}
fun soma(number01: Int, number02: Int ){

    var soma = number01 + number02
     println("SOMA ↓ \n $number01 + $number02 = $soma")
}

fun multiplicacao(number01: Int, number02: Int) = println("Resuldato da MULTIPLICAÇÃO ↓ \n " + number01 * number02)

fun calculadora(number01: Int, number02: Int, operacao: KFunction2<Int, Int, Unit>){
    operacao(number01,number02)
}


