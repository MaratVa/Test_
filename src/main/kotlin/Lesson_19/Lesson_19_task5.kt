package org.example.Lesson_19

enum class Gender(
    val displayName: String
) {
    MALE("Мужской"),
    FEMALE("Женский");

    companion object {
        fun fromString(gender: String): Gender? =
            entries.firstOrNull { it.displayName.equals(gender, ignoreCase = true) }
    }
}

class Person(
    val name: String,
    val gender: Gender
)

fun main() {
    println("Инструкция: Введите имя и пол через запятую (пример: 'Иван, Мужской').")
    println("Доступные значения для пола: ${Gender.entries.joinToString { it.displayName }}")

    val peopleList = mutableListOf<Person>()

    repeat(5) { i ->
        while (true) {
            print("Введите данные человека ${i + 1}: ")
            val input = readLine() ?: continue
            val (name, genderStr) = input.split(",").map { it.trim() }
            val gender = Gender.fromString(genderStr)
            if (gender != null) {
                peopleList.add(Person(name, gender))
                break
            } else {
                println("Неверный пол. Доступные значения: ${Gender.entries.joinToString { it.displayName }}")
            }
        }
    }

    println("\nКартотека:")
    peopleList.forEach { println("Имя: ${it.name}, Пол: ${it.gender.displayName}") }
}