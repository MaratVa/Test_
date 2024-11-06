package org.example.lesson_3

fun main() {
    val str = "D2-D4;0"
    val parts = str.split(';', '-')

    val start = parts[0]
    val finish = parts[1]
    val strokeNumber = parts[2].toInt()

    println("Начало: $start")
    println("Конец: $finish")
    println("Номер хода: $strokeNumber")
}