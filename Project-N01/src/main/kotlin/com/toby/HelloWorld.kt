package com.toby

// main + tab = main function template
fun main() {
    // println("Hello Kotlin World!")

    // Human().hello()

    val h = Human()
    h.hello()

    // val = value, not changeable
    // var = variable, changeable

    // If the variable / value is initialize, no need to set type (auto estimation)
    val age = 19
    var age2 = 19.0f

    // variable / value without initialization, set type with ':'
    val age3 : Int
    var age4 : Float

    var name : String = "Toby"
}

class Human {
    fun hello() {
        println("Hello Kotlin World!")
    }
}