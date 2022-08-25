package com.porto.exerciciomodulo04

class Atividade02 {
}

fun main() {

     parte01()
     parte02()
}

fun  parte01(){
    var array: IntArray = IntArray(100)

    println("Parte 1")
    var filterList = array.indices.filter{ it % 2 == 0 }
    println("Os números pares")
     filterList.forEach{ println(it) }
}
fun parte02(){
    println("Parte 2")
    val names = listOf("Vitor","Marcela","Rafael","Sabrine")
    val helloList = names.map{ "olá $it" }

    helloList.forEach{
        println(it)
    }
}

