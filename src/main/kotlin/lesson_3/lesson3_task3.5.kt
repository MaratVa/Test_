package org.example.lesson_3

fun main() {
    val str = "D2-D4;0"
    val scoresList: List<String> = str.split(";")

    val start = scoresList[0].split("-")[0]
    val finish = scoresList[0].split("-")[1]
    val strokeNumber = scoresList[1].toInt()

    println("Начало: $start")
    println("Конец: $finish")
    println("Номер хода: $strokeNumber")
}