package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val principalAmount = 70000.0
    val interestRate = 1.167

    val years = 20

    val finalAmount = principalAmount * interestRate.pow(years.toDouble())

    println("Сумма через $years лет: ${String.format("%.3f", finalAmount)}")
}

// Масштабируемость: Изменить количество лет очень просто, достаточно изменить значение переменной years.
// Удобство изменения: процентную ставку также можно изменить, изменив значение переменной interestRate.
// Чёткость: Код более компактный и легко читается.