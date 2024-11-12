package org.example.lesson_5

fun main() {
    val currentYear = 2024
    println("Введите ваш год рождения:")
    val userYear = readln().toIntOrNull() ?: return

    val userAge = currentYear - userYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}

const val AGE_OF_MAJORITY = 18