package org.example.lesson_12

import java.time.LocalDate

class DayWeather {
    var dailyTemperature: Double = 0.0
    var nightTemperature: Double = 0.0
    var precipitation: Boolean = false

    fun displayWeather() {
        val precipitationString = if (precipitation) "Да" else "Нет"
        println("Дата: ${LocalDate.now()}")
        println("Дневная температура: ${dailyTemperature}°C")
        println("Ночная температура: ${nightTemperature}°C")
        println("Осадки: $precipitationString")
        println("------------------")
    }
}

fun main() {
    val weather1 = DayWeather()
    weather1.dailyTemperature = 25.5
    weather1.nightTemperature = 18.2
    weather1.precipitation = true

    val weather2 = DayWeather()
    weather2.dailyTemperature = 30.0
    weather2.nightTemperature = 22.0
    weather2.precipitation = false

    weather1.displayWeather()
    weather2.displayWeather()
}