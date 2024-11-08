package org.example.lesson_4

fun main() {

    val minWeight = 35
    val maxWeight = 100
    val maxVolume = 100

    // Груз 1: 20 кг / 80 л
    val weight1 = 20
    val volume1 = 80
    val isAverage1 = weight1 > minWeight && weight1 <= maxWeight && volume1 < maxVolume
    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': $isAverage1")

    // Груз 2: 50 кг / 100 л
    val weight2 = 50
    val volume2 = 100
    val isAverage2 = weight2 > minWeight && weight2 <= maxWeight && volume2 < maxVolume
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': $isAverage2")
}