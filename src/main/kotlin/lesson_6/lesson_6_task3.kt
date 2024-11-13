package org.example.lesson_6

fun main() {
    var seconds = 10

    while (seconds > 0) {
        println("Осталось секунд ${seconds--} ")
        Thread.sleep(1000)
    }
    println("Время вышло")
}