package org.example.Lesson_16

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun calculateCircumference(): Double {
        return 2 * pi * radius
    }

    fun calculateArea(): Double {
        return pi * radius * radius
    }
}

fun main() {
    val myCircle = Circle(5.0)
    val circumference = myCircle.calculateCircumference()
    val area = myCircle.calculateArea()

    println("Длина окружности: $circumference")
    println("Площадь круга: $area")
}