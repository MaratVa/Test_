package org.example.Lesson_8

fun main() {
    val ingredients = mutableListOf("Мука", "Яйца", "Сахар", "Масло", "Молоко")


    println("Текущий список ингредиентов: $ingredients")


    print("Введите ингредиент для замены: ")
    val ingredientToReplace = readLine()!!.toString()


    val index = ingredients.indexOf(ingredientToReplace)
    if (index == -1) {
        println("Ингредиент $ingredientToReplace не найден в списке.")
    } else {

        print("Введите новый ингредиент: ")
        val newIngredient = readLine()!!.toString()


        ingredients[index] = newIngredient


        println("Готово! Вы сохранили следующий список: $ingredients")
    }
}