package org.example.lesson_4

fun main() {
    val sunny: Boolean = true
    val tent: Boolean = true
    val air = 20
    val season = "Winter"

    val favorableConditions = sunny && tent && air == 20 && season != "Winter"
    println("Благоприятные ли условия сейчас для роста бобовых?: $favorableConditions")
}