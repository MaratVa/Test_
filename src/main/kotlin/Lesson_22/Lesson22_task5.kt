package org.example.Lesson_22

import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Система Альфа Центавра",
        description = "Ближайшая к нам звёздная система, состоящая из трёх звёзд: Альфа Центавра A, Альфа Центавра B и Проксима Центавра",
        eventDateTime = LocalDateTime.of(2024, 1, 1, 0, 0),
        distanceFromEarth = 4.37
    )

    val name = alphaCentauri.component1()
    val description = alphaCentauri.component2()
    val dateTime = alphaCentauri.component3()
    val distance = alphaCentauri.component4()

    println("Название: $name")
    println("Описание: $description")
    println("Дата и время: $dateTime")
    println("Расстояние от Земли: $distance световых лет")
}