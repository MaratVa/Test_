package org.example.lesson_1

fun main () {
    val seconds = 6480

    val hour = (seconds / 3600)

    val remainingSeconds = (seconds % 3600)

    val minute = (remainingSeconds / 60)

    val second = (remainingSeconds % 60)

    println("0" + hour + ":" + minute + ":" + second + "0")
}