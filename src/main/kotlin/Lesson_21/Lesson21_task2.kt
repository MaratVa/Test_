package org.example.Lesson_21

fun List<Int>.evenNumbersSum(): Int {
    var sum = 0
    for (number in this) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}

fun main() {
    val numbers1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Сумма четных чисел в списке $numbers1: ${numbers1.evenNumbersSum()}")

    val numbers2 = listOf(1, 3, 5, 7, 9)
    println("Сумма четных чисел в списке $numbers2: ${numbers2.evenNumbersSum()}")

    val numbers3 = listOf(2, 4, 6, 8, 10)
    println("Сумма четных чисел в списке $numbers3: ${numbers3.evenNumbersSum()}")

    val numbers4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12)
    println("Сумма четных чисел в списке $numbers4: ${numbers4.evenNumbersSum()}")
}