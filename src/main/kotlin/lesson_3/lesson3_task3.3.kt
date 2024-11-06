package org.example.lesson_3

fun main() {
    val number = 8
    val theMultiplicationTable = "$number x 1 = ${number * 1}\n" +
            "$number x 2 = ${number * 2}\n" +
            "$number x 3 = ${number * 3}\n" +
            "$number x 4 = ${number * 4}\n" +
            "$number x 5 = ${number * 5}\n" +
            "$number x 6 = ${number * 6}\n" +
            "$number x 7 = ${number * 7}\n" +
            "$number x 8 = ${number * 8}\n" +
            "$number x 9 = ${number * 9}\n" +
            "$number x 10 = ${number * 10}"

    println(theMultiplicationTable)
}