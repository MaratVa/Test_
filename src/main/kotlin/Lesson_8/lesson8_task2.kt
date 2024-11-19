package org.example.Lesson_8

fun main() {

    val ingredients = arrayOf("Мука", "Яйца", "Сахар", "Масло", "Молоко")

    print("Введите название ингредиента: ")
    val ingredientToFind = readLine()!!.toString()

    var found = false
    for (ingredient in ingredients) {
        if (ingredient == ingredientToFind) {
            found = true
            break
        }
    }

    if (found) {
        println("Ингредиент $ingredientToFind в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}