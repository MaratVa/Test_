package org.example.lesson_5

fun main() {
    val winningNumbers = List(3) { (0..42).random() }
    val userNumbers = mutableListOf<Int>()

    println("Введите три числа от 0 до 42:")
    for (i in 1..3) {
        var number: Int? = null
        while (number == null) { // Цикл, пока не будет введено корректное число
            print("Число $i: ")
            number = readln().toIntOrNull()
            if (number != null && number in 0..42) {
                userNumbers.add(number)
            } else {
                println("Пожалуйста, введите корректное число от 0 до 42.")
            }
        }
    }

    val matches = userNumbers.intersect(winningNumbers.toSet()).size

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