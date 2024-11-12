package org.example.lesson_5

fun main() {
    val hiddenNum1 = 9
    val hiddenNum2 = 11

    println("Введите первое число от 0 до 42")
    val num1 = readln().toInt()
    println("Введите второе число от 0 до 42")
    val num2 = readln().toInt()


    val result = if ((num1 == hiddenNum1 && num2 == hiddenNum2) || (num1 == hiddenNum2 && num2 == hiddenNum1))
        "Поздравляем! Вы выиграли главный приз!"
    else if (num1 == hiddenNum1 || num1 == hiddenNum2 || num2 == hiddenNum1 || num2 == hiddenNum2)
        "Вы выиграли утешительный приз!"
    else "Неудача!"

    println("Загаданные числа: $hiddenNum1 и $hiddenNum2")
    println(result)
}