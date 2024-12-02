package org.example.lesson_12

import java.time.LocalDate
import kotlin.random.Random

class DailyWeather(
    private val dailyTemperatureKelvin: Int,
    private val nightTemperatureKelvin: Int,
    val precipitation: Boolean
) {
    val dailyTemperatureCelsius: Int get() = dailyTemperatureKelvin - 273
    val nightTemperatureCelsius: Int get() = nightTemperatureKelvin - 273

    init {
        displayWeather()
    }

    private fun displayWeather() {
        val precipitationString = if (precipitation) "Да" else "Нет"
        println("Дата: ${LocalDate.now()}")
        println("Дневная температура: ${dailyTemperatureCelsius}°C")
        println("Ночная температура: ${nightTemperatureCelsius}°C")
        println("Осадки: $precipitationString")
        println("------------------")
    }
}

fun main() {
    val random = Random(System.currentTimeMillis())
    val weatherData = mutableListOf<DailyWeather>()

    for (i in 1..30) {
        val dailyTemp = random.nextInt(273 + 10, 273 + 35)
        val nightTemp = random.nextInt(273, 273 + 30)
        val hasPrecipitation = random.nextBoolean()
        weatherData.add(DailyWeather(dailyTemp, nightTemp, hasPrecipitation))
    }

    val dailyTemps = weatherData.map { it.dailyTemperatureCelsius }
    val nightTemps = weatherData.map { it.nightTemperatureCelsius }
    val precipitationDays = weatherData.count { it.precipitation }

    val averageDailyTemp = dailyTemps.average()
    val averageNightTemp = nightTemps.average()

    println("Средняя дневная температура: $averageDailyTemp°C")
    println("Средняя ночная температура: $averageNightTemp°C")
    println("Количество дней с осадками: $precipitationDays")
}