package org.example.lesson_10

fun validateLength(input: String, type: String): Boolean {
    if (input.length < 4) {
        println("$type недостаточно длинный.")
        return false
    }
    return true
}

fun main() {
    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    if (validateLength(login, "Логин") && validateLength(password, "Пароль")) {
        println("Добро пожаловать!")
    }
}