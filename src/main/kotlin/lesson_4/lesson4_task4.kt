package org.example.lesson_4

fun main() {
    val trainingDay = 5


    val armsAndAbs = trainingDay == 1 || trainingDay == 3 || trainingDay == 5 // Руки/пресс
    val legsAndBack = trainingDay == 2 || trainingDay == 4 // Ноги/спина

    println(
        "Упражнения для рук:       ${armsAndAbs}\n" +
                "Упражнения для ног:       ${legsAndBack}\n" +
                "Упражнения для спины:     ${legsAndBack}\n" +
                "Упражнения для пресса:    ${armsAndAbs}"
    )
}