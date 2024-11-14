package org.example.lesson_7

import kotlin.random.Random

fun main() {
    val code = Random.nextInt(9000) + 1000
    println("Ваш код авторизации:$code")

    while (true) {
        print("введите код автоизации:")
        val inputCode = readLine()?.toIntOrNull()

        if (inputCode != null && inputCode == code) {
            println("Авторизация успешна!")
            return
        } else if (inputCode == null) {
            println("Ошибка: Неккоректный ввод. Пожалуйста, введите число.")
        } else {
            println("Ошибка:Неверный код. Попробуйте снова.")
            val newCode = Random.nextInt(9000) + 1000
            println("Ваш код авторизации:$newCode")
            code == newCode
        }
    }
}