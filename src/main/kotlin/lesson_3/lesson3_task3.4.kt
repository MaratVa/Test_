package org.example.lesson_3

fun main() {
    var start = "E2"
    var finish = "E4"
    var strokeNumber = 1

    var moveString = "$start-$finish;$strokeNumber"

    println(moveString)

    start = "D2"
    finish = "D4"
    strokeNumber = 1

    moveString = "$start-$finish;$strokeNumber"

    println(moveString)
}