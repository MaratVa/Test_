package org.example.lesson_4

fun main() {
    val hasDamage = false
    val crew = 60
    val provisions = 65
    val goodWeather = true


    val canSail = (
            // Основные условия
            (!hasDamage && crew in MIN_CREW..MAX_CREW && provisions > MIN_PROVISIONS)
                    // Альтернативные условия
                    || (hasDamage && crew == MAX_CREW && goodWeather && provisions >= MIN_PROVISIONS)
            )

    println("Корабль может отправиться в плавание: $canSail")
}

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50
