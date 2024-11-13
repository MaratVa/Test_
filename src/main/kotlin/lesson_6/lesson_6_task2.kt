package org.example.lesson_6

fun main() {
    var seconds = 10

    while (seconds > 0) {
        println("Прошло ${seconds--} секунд ")
        Thread.sleep(1000)
    }
}