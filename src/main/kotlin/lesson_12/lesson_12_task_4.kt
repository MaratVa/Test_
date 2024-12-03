package lesson_12

import java.time.LocalDate

class WeatherData(private val precipitation: Boolean) {
    private var dailyTemperatureKelvin: Int = 0
    private var nightTemperatureKelvin: Int = 0

    init {
        dailyTemperatureKelvin = TemperatureConstants.DAY_TEMP_KELVIN
        nightTemperatureKelvin = TemperatureConstants.NIGHT_TEMP_KELVIN
        displayWeather()
    }

    private val dailyTemperatureCelsius: Int get() = dailyTemperatureKelvin - TemperatureConstants.KELVIN_OFFSET
    private val nightTemperatureCelsius: Int get() = nightTemperatureKelvin - TemperatureConstants.KELVIN_OFFSET

    private fun displayWeather() {
        val precipitationString = if (precipitation) "Да" else "Нет"
        println("Дата: ${LocalDate.now()}")
        println("Дневная температура: $dailyTemperatureCelsius°C")
        println("Ночная температура: $nightTemperatureCelsius°C")
        println("Осадки: $precipitationString")
        println("------------------")
    }
}

fun main() {
    WeatherData(true)
}

object TemperatureConstants {
    const val KELVIN_OFFSET = 273
    const val DAY_TEMP_KELVIN = 298
    const val NIGHT_TEMP_KELVIN = 273
}