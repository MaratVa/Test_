package org.example.lesson_7

fun main() {
    print("Введите количество секунд: ")
    val seconds = readLine()?.toIntOrNull() ?: run {
        println("Ошибка: Некорректный ввод. Пожалуйста, введите целое число.")
        return
    }

    if (seconds <= 0) {
        println("Ошибка: Введите положительное число секунд.")
        return
    }

    val startTime = System.currentTimeMillis()
    for (i in seconds downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)

    }

    println("Время вышло")
}