package org.example.lesson_3

fun main() {
    val welcome1 = "Добрый день!"
    val welcome2 = "Добрый вечер!"
    val userName = "Марат"

    var welcomeMessage = welcome1
    println("$welcomeMessage, $userName!")

    welcomeMessage = welcome2
    println("$welcomeMessage, $userName!")
}