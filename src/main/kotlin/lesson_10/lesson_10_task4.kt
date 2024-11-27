package org.example.lesson_10

import kotlin.random.Random

fun getDiceRoll(): Int = Random.nextInt(1, 7)

fun playRound(): Int {
    val playerRoll = getDiceRoll()
    val computerRoll = getDiceRoll()
    println("Игрок бросил: $playerRoll, Компьютер бросил: $computerRoll")
    return if (playerRoll > computerRoll) 1 else 0
}

fun main() {
    var playerWins = 0
    var keepPlaying = true

    do {
        playerWins += playRound()
        print("Хотите бросить кости еще раз? (Да/Нет): ")
        val answer = readln().lowercase()
        keepPlaying = answer == "да"
    } while (keepPlaying)

    println("Игра окончена! Вы выиграли $playerWins партий.")
}