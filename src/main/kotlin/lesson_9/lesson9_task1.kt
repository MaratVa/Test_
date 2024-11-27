package org.example.lesson_9

fun main() {
    val ingredients = mutableListOf("Мука", "Яйца", "Сахар", "Масло", "Молоко", "Соль", "Разрыхлитель")

    println("В рецепте есть следующие ингредиенты: $ingredients")

    println("\nСписок ингредиентов (детализированный):")
    ingredients.forEach { println(it) }
}