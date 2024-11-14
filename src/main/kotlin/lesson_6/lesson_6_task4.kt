package org.example.lesson_6

fun main() {
    val hiddenNumber = (1..9).random()
    var attemptsLeft = 5

    println("Добро пожаловать в числовую угадайку!")
    println("Угадайте число от 1 до 9. У вас есть 5 попыток.")

    while (attemptsLeft > 0) {
        print("Введите число: ")
        val guess = readLine()?.toIntOrNull() ?: continue

        if (guess == hiddenNumber) {
            println("Это была великолепная игра!")
            break
        } else {
            println("Неверно. Осталось попыток: ${attemptsLeft - 1}")
            attemptsLeft--
        }
    }

    if (attemptsLeft == 0) {
        println("Было загадано число: $hiddenNumber")
    }
}