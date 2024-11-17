package org.example.lesson_7

fun main() {
    val passwordLength = 6
    val lowercaseLetters = 'a'..'z'
    val digits = '0'..'9'

    val password = buildString {
        for (i in 0 until passwordLength) {
            val char = if (i % 2 == 0) lowercaseLetters.random() else digits.random()
            append(char)
        }
    }
    println("Сгенерированный пароль: $password")
}