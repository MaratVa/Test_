package org.example.lesson_7


fun main() {
    print("Введите число: ")
    val inputNumber = readLine()?.toIntOrNull() ?: run {
        println("Ошибка: Некорректный ввод. Пожалуйста, введите целое число.")
        return
    }

    if (inputNumber < 0) {
        println("Ошибка: Введите неотрицательное число.")
        return
    }

    println("Чётные числа от 0 до $inputNumber:")
    for (i in 0..inputNumber step 2) {
        println(i)
    }
}