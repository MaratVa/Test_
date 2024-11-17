package org.example.lesson_7

fun main() {
    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")

        print("Введите код авторизации: ")
        val inputCode = readLine()?.toIntOrNull()

        if (inputCode == null) {
            println("Ошибка: Некорректный ввод. Пожалуйста, введите число.")
        } else if (inputCode != code) {
            println("Ошибка: Неверный код. Попробуйте снова.")
        }
    } while (inputCode != code)

    println("Авторизация успешна!")
}