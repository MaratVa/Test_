package org.example.lesson_10

import kotlin.random.Random

fun rollDice(): Int {
    return Random.nextInt(1, 7)
}

fun main() {
    println("Игра начинается!")

    val playerRoll = rollDice()
    println("Игрок бросил кости: $playerRoll")

    val computerRoll = rollDice()
    println("Компьютер бросил кости: $computerRoll")

    val winner = when {
        playerRoll > computerRoll -> "Победило человечество!"
        computerRoll > playerRoll -> "Победила машина!"
        else -> "Победила дружба!"
    }

    println(winner)
}