package org.example.lesson_2

fun main() {

    val startHours = 9
    val startMinute = 39

    val travel = 457

    val start = startHours * 60 + startMinute

    val finish = start + travel

    val finishHours = finish / 60
    val finishMinutes = finish - finishHours * 60

    println(finishHours)
    println(finishMinutes)
}