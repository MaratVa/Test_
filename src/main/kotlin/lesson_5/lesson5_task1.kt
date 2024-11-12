package org.example.lesson_5

fun main() {
    val num1 = (1..10).random()
    val num2 = (1..10).random()

    println("Введите сумму чисел $num1 + $num2:")
    val answer = readLine()!!.toInt()
    val correctAnswer = num1 + num2

    if (answer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}