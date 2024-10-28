package org.example.lesson_2

fun main() {
    //Зададим время отправления
    val startHours = 9
    val startMinute = 39

    //Зададим время в пути
    val travel = 457

    //Переведем время отправления в минуты
    val start = startHours * MINUTES_IN_HOUR + startMinute

    //Найдем время прибытия в минуты
    val finish = start + travel

    //Переведем время прибытия: в часы и минуты
    val finishHours = finish / MINUTES_IN_HOUR
    val finishMinutes = finish % MINUTES_IN_HOUR

    println(String.format("Время прибытия:%02d:%02d", finishHours, finishMinutes))

}

val MINUTES_IN_HOUR = 60
