package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val num1 = Random.nextInt(1, 10)
    val num2 = Random.nextInt(1, 10)

    println("Введите сумму чисел $num1 + $num2:")
    val answer = readLine()!!.toInt()
    val correctAnswer = num1 + num2

    if (answer == correctAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}