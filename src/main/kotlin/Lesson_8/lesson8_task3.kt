package org.example.Lesson_8

fun main() {
    val ingredients = arrayOf("Мука", "Яйца", "Сахар", "Масло", "Молоко")
    print("Введите название ингредиента: ")
    val ingredientToFind = readLine()!!.toString()

    if (ingredients.contains(ingredientToFind)) {
        println("Ингредиент $ingredientToFind в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}