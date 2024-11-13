package org.example.lesson_6

fun main() {

    println("Введите желаемый логин:")
    val login = readLine()
    println("Введите желаемый пароль:")
    val password = readLine()


    while (true) {
        println("Введите логин:")
        val enteredLogin = readLine()
        println("Введите пароль:")
        val enteredPassword = readLine()

        if (enteredLogin == login && enteredPassword == password) {
            println("Авторизация прошла успешно!")
            break
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
    }
}