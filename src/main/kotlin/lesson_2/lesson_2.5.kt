package org.example.lesson_2

import kotlin.math.pow


fun main() {
    val principalAmount = 70000.0
    val interestRatePercentage = 16.7
    val interestRateDecimal = 1 + interestRatePercentage / 100

    val years = 20

    val finalAmount = principalAmount * interestRateDecimal.pow(years.toDouble())

    println("Сумма через $years лет: ${String.format("%.3f", finalAmount)}")
}