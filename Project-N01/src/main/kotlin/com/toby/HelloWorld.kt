package com.toby

// main + tab = main function template
fun main() {
    // println("Hello Kotlin World!")

    // Human().hello()

    val h = Human(weight = 80.0f, height = 1.8f)
    h.hello()
    println(h.bmi())

    // val = value, not changeable
    // var = variable, changeable

    // If the variable / value is initialize, no need to set type (auto estimation)

    /*val age = 19
    var age2 = 19.0f*/

    // variable / value without initialization, set type with ':'

    /*val age3 : Int
    var age4 : Float
    var name : String = "Toby"*/
}

class Human(var name: String = "", var weight: Float, var height: Float) {
    init {
        println("test $weight $height")
    }

    // constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi() : Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin World!")
    }
}