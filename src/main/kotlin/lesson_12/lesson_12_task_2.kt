package org.example.lesson_12

import java.time.LocalDate

class DailyWeatherReport(
    private val dailyTemperature: Double,
    private val nightTemperature: Double,
    private val precipitation: Boolean
) {
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
    val weatherReport = DailyWeatherReport(25.5, 18.2, true)
    weatherReport.displayWeather()
}