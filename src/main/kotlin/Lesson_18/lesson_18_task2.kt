package org.example.Lesson_18

import kotlin.random.Random

abstract class Dice {
    abstract val sides: Int
    abstract fun roll()
}

class FourSidedDice : Dice() {
    override val sides = 4
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Бросок 4-гранной кости: $result")
    }
}

class SixSidedDice : Dice() {
    override val sides = 6
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Бросок 6-гранной кости: $result")
    }
}

class EightSidedDice : Dice() {
    override val sides = 8
    override fun roll() {
        val result = Random.nextInt(1, sides + 1)
        println("Бросок 8-гранной кости: $result")
    }
}

fun main() {
    val dice1 = FourSidedDice()
    val dice2 = SixSidedDice()
    val dice3 = EightSidedDice()

    val diceList: List<Dice> = listOf(dice1, dice2, dice3 )

    diceList.forEach { dice ->
        dice.roll()
    }
}