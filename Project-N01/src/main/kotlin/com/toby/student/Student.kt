package com.toby.kotlin

fun main() {
    val stu = Student("Toby", 98, 84)
    stu.print()
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math + "\t" +
                (english + math) / 2)
    }
}