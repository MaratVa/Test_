package org.example.lesson_1

fun main () {
    val secondsInSpace = 6480

    val minutes = secondsInSpace / SECONDS_IN_MINUTE
    val hours = minutes / SECONDS_IN_MINUTE
    val remainingMinutes = minutes % SECONDS_IN_MINUTE
    val remainingSeconds = secondsInSpace % SECONDS_IN_MINUTE
    val formattedTime = String.format("%02d:%02d:%02d", hours, remainingMinutes, remainingSeconds)
    println("Время проведенное в космосе:$formattedTime")
}
val SECONDS_IN_MINUTE = 60