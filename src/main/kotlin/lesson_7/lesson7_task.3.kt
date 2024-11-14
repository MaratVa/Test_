package org.example.lesson_7

import kotlin.random.Random

fun main() {
    print("Введите число: ")
    val n = readLine()?.toIntOrNull() ?: run {
        println("Ошибка: Некорректный ввод. Пожалуйста, введите целое число.")
        return
    }

    if (n < 0) {
        println("Ошибка: Введите неотрицательное число.")
        return
    }

    println("Чётные числа от 0 до $n:")
    for (i in 0..n step 2) {
        println(i)
    }
}