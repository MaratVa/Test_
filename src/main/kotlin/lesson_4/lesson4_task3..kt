package org.example.lesson_4

fun main() {
    val sunny: Boolean = true
    val tent: Boolean = true
    val air: Int = 20
    val currentSeason: String = "Winter"

    val favorableConditions = sunny && tent && air == TARGET_HUMIDITY && currentSeason != FAVORABLE_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых?: $favorableConditions")
}

const val TARGET_HUMIDITY = 20
const val FAVORABLE_SEASON = "Winter"