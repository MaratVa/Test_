package org.example.lesson_9

fun main() {
    print("Введите 5 ингредиентов через запятую с пробелом (, ): ")
    val input = readLine() ?: ""
    val ingredients = input.split(", ").map { it.trim() }

    if (ingredients.size != 5) {
        println("Вы ввели не 5 ингредиентов.")
        return
    }

    val sortedIngredients = ingredients.sorted()

    println("Отсортированный список ингредиентов: $sortedIngredients")
}