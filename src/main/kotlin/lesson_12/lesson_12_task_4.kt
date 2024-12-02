package lesson_12

import java.time.LocalDate

class WeatherData(
    private val dailyTemperatureKelvin: Int,
    private val nightTemperatureKelvin: Int,
    private val precipitation: Boolean
) {

    private val dailyTemperatureCelsius: Int get() = dailyTemperatureKelvin - 273
    private val nightTemperatureCelsius: Int get() = nightTemperatureKelvin - 273

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
    WeatherData(298, 273, true)
}