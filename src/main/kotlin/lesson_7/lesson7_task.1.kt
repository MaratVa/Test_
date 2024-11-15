package org.example.lesson_7

fun main() {
    val passwordLength = 6
    val password = buildString {
        for (i in 0 until passwordLength) {
            val char = if (i % 2 == 0) ('a'..'z').random() else ('0'..'9').random()
            append(char)
        }
    }
    println("Сгенерированный пароль: $password")
}