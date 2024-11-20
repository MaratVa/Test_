package org.example.Lesson_8

fun main() {
    val ingredients = listOf("Мука", "Яйца", "Сахар", "Масло", "Молоко")

    print("Введите название ингредиента: ")
    val ingredientToFind = readln().lowercase()


    if (ingredients.any { it.lowercase() == ingredientToFind }) {
        println("Ингредиент $ingredientToFind в рецепте есть")
        return
    }

    println("Такого ингредиента в рецепте нет")
}