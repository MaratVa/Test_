package org.example.lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()

    while (ingredients.size < 5) {
        print("Введите ингредиент ${ingredients.size + 1}: ")
        val ingredient = readLine()?.trim()?.lowercase() ?: continue

        ingredients.add(ingredient)
    }

    val sortedIngredients = ingredients.sorted()

    val output = sortedIngredients.joinToString(
        separator = ", ",
        transform = { it.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() } }
    )

    println("Список ингредиентов: $output")
}