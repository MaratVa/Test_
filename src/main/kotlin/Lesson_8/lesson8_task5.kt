package org.example.Lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val numIngredients = readln().toInt()

    if (numIngredients <= 0) {
        println("Количество ингредиентов должно быть больше 0.")
        return
    }

    val ingredients = arrayOfNulls<String>(numIngredients)

    for (i in 0 until numIngredients) {
        print("Введите ингредиент ${i + 1}: ")
        ingredients[i] = readln()
    }

    println("Список ингредиентов: ${ingredients.joinToString(", ")}")
}