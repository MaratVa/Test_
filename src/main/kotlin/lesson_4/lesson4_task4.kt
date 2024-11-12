package org.example.lesson_4

fun main() {
    val trainingDay = 5 // День тренировки (измените это значение, чтобы проверить разные дни)

    val isArmsAndAbs = (trainingDay % 2) == 1 // Руки/пресс

    println(
        "Упражнения для рук:       $isArmsAndAbs\n" +
                "Упражнения для ног:       ${!isArmsAndAbs}\n" +
                "Упражнения для спины:     ${!isArmsAndAbs}\n" +
                "Упражнения для пресса:    $isArmsAndAbs"
    )
}