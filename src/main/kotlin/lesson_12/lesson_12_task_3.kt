package org.example.lesson_12

import java.time.LocalDate

class WeatherReportInCelsius(
    private val precipitation: Boolean,
    kelvinTemperatureDay: Int,
    kelvinTemperatureNight: Int
) {
    private val dailyTemperatureKelvin: Int = kelvinTemperatureDay
    private val nightTemperatureKelvin: Int = kelvinTemperatureNight

    private val dailyTemperatureCelsius: Int
        get() = dailyTemperatureKelvin - 273

    private val nightTemperatureCelsius: Int
        get() = nightTemperatureKelvin - 273

    fun displayWeather() {
        val precipitationString = if (precipitation) "Да" else "Нет"
        println("Дата: ${LocalDate.now()}")
        println("Дневная температура: ${dailyTemperatureCelsius}°C")
        println("Ночная температура: ${nightTemperatureCelsius}°C")
        println("Осадки: $precipitationString")
        println("------------------")
    }
}

fun main() {
    val weatherReport = WeatherReportInCelsius(true, 298, 291)
    weatherReport.displayWeather()
}