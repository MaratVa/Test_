package org.example.lesson_9

fun main() {
    val ingredientsPerServing = listOf(2, 50, 15)

    print("Введите количество порций: ")
    val numServings = readLine()!!.toInt()

    if (numServings <= 0) {
        println("Количество порций должно быть больше 0.")
        return
    }

    val totalIngredients = ingredientsPerServing.map { it * numServings }

    println("На $numServings порций вам понадобится: Яиц – ${totalIngredients[0]}, молока – ${totalIngredients[1]}, сливочного масла – ${totalIngredients[2]}")
}