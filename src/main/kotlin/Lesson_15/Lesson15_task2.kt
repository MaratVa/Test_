package org.example.Lesson_15

abstract class WeatherStationStats {
    abstract fun getReport(): String
}

class Temperature(
    val value: Double,
    val unit: String = "°C"
) : WeatherStationStats() {
    override fun getReport(): String {
        return "Температура: $value$unit"
    }
}

class PrecipitationAmount(
    val value: Double,
    val unit: String = "мм"
) : WeatherStationStats() {
    override fun getReport(): String {
        return "Количество осадков: $value$unit"
    }
}

class WeatherServer {
    fun sendReport(report: WeatherStationStats) {
        val reportString = when (report) {
            is Temperature -> "Температура: ${report.value}${report.unit}"
            is PrecipitationAmount -> "Количество осадков: ${report.value}${report.unit}"
            else -> "Неизвестный тип данных"
        }
        println("Отправлено на сервер: $reportString")
    }
}

fun main() {
    val server = WeatherServer()
    val temperature = Temperature(25.5)
    val precipitation = PrecipitationAmount(10.2)

    server.sendReport(temperature)
    server.sendReport(precipitation)
}