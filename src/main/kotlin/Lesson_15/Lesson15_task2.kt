package org.example.Lesson_15

abstract class WeatherStationStats {
    abstract fun getReport(): String
}

class Temperature(
    private val value: Double,
    private val unit: String = "°C"
) : WeatherStationStats() {
    override fun getReport(): String {
        return "Температура: $value$unit"
    }
}

class PrecipitationAmount(
    private val value: Double,
    private val unit: String = "мм"
) : WeatherStationStats() {
    override fun getReport(): String {
        return "Количество осадков: $value$unit"
    }
}

class WeatherServer {
    fun sendReport(report: WeatherStationStats) {
        println("Отправлено на сервер: ${report.getReport()}")
    }
}

fun main() {
    val server = WeatherServer()
    val temperature = Temperature(25.5)
    val precipitation = PrecipitationAmount(10.2)

    server.sendReport(temperature)
    server.sendReport(precipitation)
}