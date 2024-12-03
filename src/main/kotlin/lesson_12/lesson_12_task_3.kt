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
        get() = dailyTemperatureKelvin - TemperatureConstants.KELVIN_OFFSET

    private val nightTemperatureCelsius: Int
        get() = nightTemperatureKelvin - TemperatureConstants.KELVIN_OFFSET

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
    val weatherReport =
        WeatherReportInCelsius(true, TemperatureConstants.DAY_TEMP_KELVIN, TemperatureConstants.NIGHT_TEMP_KELVIN)
    weatherReport.displayWeather()
}

object TemperatureConstants {
    const val KELVIN_OFFSET = 273
    const val DAY_TEMP_KELVIN = 298
    const val NIGHT_TEMP_KELVIN = 291
}