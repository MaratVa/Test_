package org.example.Lesson_8

fun main() {
    val ingredients = listOf("Мука", "Яйца", "Сахар", "Масло", "Молоко")
    print("Введите название ингредиента: ")
    val ingredientToFind = readln().lowercase()

    if (ingredientToFind in ingredients.map { it.lowercase() }) {
        println("Ингредиент $ingredientToFind в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}