package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val winningNumbers = List(3) { Random.nextInt(0, 43) }
    val userNumbers = mutableListOf<Int>()

    println("Введите три числа от 0 до 42:")
    for (i in 1..3) {
        print("Число $i: ")
        val number = readLine()?.toIntOrNull()
        if (number != null && number in 0..42) {
            userNumbers.add(number)
        } else {
            println("Пожалуйста, введите корректное число от 0 до 42.")
        }
    }

    val matches = userNumbers.intersect(winningNumbers).size

    println("Выигрышные числа: $winningNumbers")

    when (matches) {
        3 -> {
            println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        }

        2 -> {
            println("Поздравляем! Вы угадали два числа и получаете крупный приз!")
        }

        1 -> {
            println("Поздравляем! Вы угадали одно число и получаете утешительный приз!")
        }

        else -> {
            println("К сожалению, вы не угадали ни одного числа. Попробуйте еще раз!")
        }
    }
}