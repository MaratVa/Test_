package org.example.Lesson_18

class Screen {
    fun draw(
        figure: String, x: Int, y: Int
    ): String {
        return "Нарисован $figure в координатах (x=$x, y=$y)"
    }

    fun draw(
        figure: String, x: Float, y: Float
    ): String {
        return "Нарисован $figure в координатах (x=$x, y=$y)"
    }
}

fun main() {
    val screen = Screen()

    val circleInt = screen.draw("круг", 10, 20)
    val squareInt = screen.draw("квадрат", 5, 15)
    val pointInt = screen.draw("точка", 3, 7)

    val circleFloat = screen.draw("круг", 10.5f, 20.5f)
    val squareFloat = screen.draw("квадрат", 5.2f, 15.8f)
    val pointFloat = screen.draw("точка", 3.1f, 7.9f)

    println(circleInt)
    println(squareInt)
    println(pointInt)
    println(circleFloat)
    println(squareFloat)
    println(pointFloat)
}