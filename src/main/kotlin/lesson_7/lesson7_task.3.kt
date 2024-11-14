package org.example.lesson_7

import kotlin.random.Random

fun main() {
    val chars = ('a'..'z').toList() + ('0'..'9').toList()
    val passwordLength = 6
    val password = buildString {
        for (i in 0 until passwordLength) {
            val charType = if (i % 2 == 0) 0 else 1
            val randomIndex = Random.nextInt(if (charType == 0) 26 else 10)
            if (charType == 0) {
                append(chars[randomIndex])
            } else {
                append(chars[randomIndex + 26])
            }
        }
    }
    println("Сгенерированный пароль: $password")
}