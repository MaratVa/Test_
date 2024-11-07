package org.example.lesson_4

fun main() {
    val hasDamage = false
    val crew = 60
    val provisions = 65
    val goodWeather = true

    val canSail = (
            // Основные условия
            (!hasDamage && crew in 55..70 && provisions > 50)
                    // Альтернативные условия
                    || (hasDamage && crew == 70 && goodWeather && provisions >= 50)
            )

    println("Корабль может отправиться в плавание: $canSail")
}
