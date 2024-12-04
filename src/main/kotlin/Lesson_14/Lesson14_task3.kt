package org.example.Lesson_14

import kotlin.math.PI

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(color: String, private val radius: Double) : Figure(color) {
    override fun calculateArea(): Double = PI * radius * radius
    override fun calculatePerimeter(): Double = 2 * PI * radius
}

class Rectangle(color: String, private val width: Double, private val height: Double) : Figure(color) {
    override fun calculateArea(): Double = width * height
    override fun calculatePerimeter(): Double = 2 * (width + height)
}

fun main() {
    val figures = listOf(
        Circle("черный", 5.0),
        Rectangle("белый", 4.0, 6.0),
        Circle("черный", 3.0),
        Rectangle("белый", 2.0, 8.0),
        Circle("белый", 7.0)

    )

    var sumOfBlackPerimeters = 0.0
    var sumOfWhiteAreas = 0.0

    for (figure in figures) {
        when (figure.color) {
            "черный" -> sumOfBlackPerimeters += figure.calculatePerimeter()
            "белый" -> sumOfWhiteAreas += figure.calculateArea()
        }
    }

    println("Сумма периметров черных фигур: $sumOfBlackPerimeters")
    println("Сумма площадей белых фигур: $sumOfWhiteAreas")
}