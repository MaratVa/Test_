package org.example.lesson_10

fun generatePassword(length: Int): String {
    require(length > 0 && length % 2 == 0) { "Длина пароля должна быть четным положительным числом." }

    val digits = '0'..'9'
    val specialChars = "!\"#$%&'()*+,-./ "

    return buildString {
        repeat(length / 2) {
            append(digits.random())
            append(specialChars.random())
        }
    }
}

fun main() {
    print("Введите желаемую длину пароля (четное число): ")
    val length = readln().toIntOrNull() ?: run {
        println("Ошибка: Некорректный ввод.")
        return
    }

    val password = generatePassword(length)
    println("Сгенерированный пароль: $password")
}