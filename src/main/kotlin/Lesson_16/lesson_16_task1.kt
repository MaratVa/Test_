package org.example.Lesson_16

import kotlin.random.Random

class Dice {
    private val randomNumber: Int = Random.nextInt(1, 7)

    fun rollAndPrint() {
        println("На кубике выпало число: $randomNumber")
    }
}

fun main() {
    val dice = Dice()
    dice.rollAndPrint()
}