package com.toby.kotlin

import java.util.*

fun main() {
    // userInput()

    var test = 123
    println("Test is $test")

    val stu = Student("Toby", 77, 99)
    stu.print()
    println("Highest Score: ${stu.highest()}")
}

class Student(var name: String?, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" +
               getAverage() + "\t" + if (getAverage() >= 60) "Pass" else "Failed")
    }

    fun getAverage() : Int {
        return (english + math) / 2
    }

    fun nameCheck() {
        println(name?.length)
    }

    fun highest() : Int {
        // var max =

        /* if (english > math) {
            max = english
        } else {
            max = math
        } */

        return if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name:")
    // var name = scanner.next()
    var name = null
    print("Please enter student's english score:")
    var english = scanner.nextInt()
    print("Please enter student's math score:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
    stu.nameCheck()
}