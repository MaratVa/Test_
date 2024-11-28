package org.example.lesson_10

fun validateLength(input: String, minLength: Int): Boolean {
    return input.length >= minLength
}

fun main() {
    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    if (validateLength(login, 4) && validateLength(password, 4)) {
        println("Добро пожаловать!")
    } else {
        println("Длина логина или пароля меньше 4 символов.")
    }
}