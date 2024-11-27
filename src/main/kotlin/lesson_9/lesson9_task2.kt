package org.example.lesson_9

fun main() {
    val baseIngredients = mutableListOf("Мука", "Яйца", "Сахар")

    println("В рецепте есть базовые ингредиенты: $baseIngredients")

    print("Желаете добавить еще? (да/нет): ")
    val addMore = readLine()?.lowercase()

    if (addMore?.equals("да") == true) {
        print("Какой ингредиент вы хотите добавить? ")
        val newIngredient = readLine()!!.toString()
        baseIngredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $baseIngredients")
    } else {
        println("Программа завершена.")
    }
}