package org.example.lesson_4

fun main() {
    val sunny: Boolean = true
    val tent: Boolean = true
    val air: Int = 20
    val currentSeason: String = "Winter"

    val isSunny = true
    val isTent = true
    val targetHumidity = 20
    val favorableSeason = "Winter"

    val favorableConditions = isSunny && isTent && air == targetHumidity && currentSeason != favorableSeason

    println("Благоприятные ли условия сейчас для роста бобовых?: $favorableConditions")
}