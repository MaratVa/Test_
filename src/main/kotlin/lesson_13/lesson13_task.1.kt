package org.example.lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long, val company: String?
) {
}

fun main() {
    val contact1 = Contact("Иван Иванов", 1234567890, "OpenAI")
    val contact2 = Contact(
        "Петр Петров",
        9876543210,
        null
    )
    println("Контакт 1: ${contact1.name}, ${contact1.phoneNumber}, ${contact1.company}")
    println("Контакт 2: ${contact2.name}, ${contact2.phoneNumber}, ${contact2.company}")
}