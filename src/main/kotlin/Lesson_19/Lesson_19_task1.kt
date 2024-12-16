package org.example.Lesson_19

import java.util.*

enum class FishType {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun main() {
    println("В аквариум можно добавить следующие виды рыб:")
    FishType.entries.forEach { fishType ->
        println("- ${fishType.name.lowercase(Locale.getDefault()).replace("_", " ")}")
    }
}