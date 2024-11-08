package org.example.lesson_4

fun main() {
    val trainingDay = 5

    val armsAndAbs = (trainingDay % 2) == 1
    val legsAndBack = (trainingDay % 2) == 0

    println(
        "Упражнения для рук:       $armsAndAbs\n" +
                "Упражнения для ног:       $legsAndBack\n" +
                "Упражнения для спины:     $legsAndBack\n" +
                "Упражнения для пресса:    $armsAndAbs"
    )
}