package org.example.lesson_6

fun main() {
    var attemptsLeft = 3

    while (attemptsLeft > 0) {
        val num1 = (1..9).random()
        val num2 = (1..9).random()
        val correctAnswer = num1 + num2

        println("Решите пример: $num1 + $num2 = ?")
        val userAnswer = readLine()?.toIntOrNull()

        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно. Попробуйте еще раз.")
            attemptsLeft--
        }
    }

    println("Доступ запрещен.")
}