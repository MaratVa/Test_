package org.example.Lesson_18

import kotlin.math.pow

abstract class Box {
    abstract fun surfaceArea(): Double
}

class RectangularBox(
    private val length: Double,
    private val width: Double,
    private val height: Double
) : Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubeBox(
    private val side: Double
) : Box() {
    override fun surfaceArea(): Double {
        return 6 * side.pow(2)
    }
}

fun main() {
    val rectangularBox = RectangularBox(5.0, 3.0, 2.0)
    val cubeBox = CubeBox(4.0)

    val boxes: List<Box> = listOf(rectangularBox, cubeBox)

    boxes.forEach { box ->
        println("Площадь поверхности коробки: ${box.surfaceArea()}")
    }
}