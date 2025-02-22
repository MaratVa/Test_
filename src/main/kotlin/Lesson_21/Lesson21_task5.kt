package org.example.Lesson_21

fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills1 = mapOf("Strength" to 50, "Agility" to 70, "Intelligence" to 30)
    println("Максимальный навык в $skills1: ${skills1.maxCategory()}")

    val skills2 = mapOf("Strength" to 100, "Agility" to 70, "Intelligence" to 100)
    println("Максимальный навык в $skills2: ${skills2.maxCategory()}")

    val skills3 = mapOf("Strength" to 20, "Agility" to 20, "Intelligence" to 20)
    println("Максимальный навык в $skills3: ${skills3.maxCategory()}")

    val skills4 = mapOf<String, Int>()
    println("Максимальный навык в $skills4: ${skills4.maxCategory()}")
}