package org.example.Lesson_22

data class Person(
    val name: String,
    val age: Int,
    val city: String
)

fun main() {
    val person = Person("Alice", 30, "New York")
    val (name, age, city) = person
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
}