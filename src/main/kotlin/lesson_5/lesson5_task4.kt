package org.example.lesson_5

fun main() {
    val login = "Zaphod"
    val password = "PanGalactic"

    println("Введите имя пользователя")
    val num1 = readln()
    println("Введите пароль")
    val num2 = readln()


    val result = if (num1 == login && num2 == password)
        "Ваши данные проверены Zaphod, вам разрешено входить на борт корабля Heart of Gold"
    else "Вы не зарегистрированы,пройдите регистрацию"

    println(result)
}