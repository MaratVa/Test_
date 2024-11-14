package org.example.lesson_6

fun main() {
    print("Введите количество секунд...")
    val seconds = readLine()?.toIntOrNull() ?: return

    println("Запускаю таймер на $seconds секунд")
    Thread.sleep(seconds * 1000L)
    println("Прошло $seconds секунд")

}