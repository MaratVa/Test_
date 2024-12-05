package org.example.Lesson_13

class Contact3(
    private val name: String,
    private val phoneNumber: String,
    var company: String?
) {

    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contactList = listOf(
        Contact3("Ростислав", "89123456789", null),
        Contact3("Иван", "1234567890", "OpenAI"),
        Contact3("Петр", "9876543210", null),
        Contact3("Сидор", "5555555555", "null"),
        Contact3("Федор", "1112223333", "OpenAI")
    )

    val companies = contactList.mapNotNull { it.company }
        .filter { it != "null" }
        .toSet()

    println("Список всех существующих компаний:")
    if (companies.isEmpty()) {
        println("<Список компаний пуст>")
    } else {
        companies.forEach { println(it) }
    }

    println("\nИнформация о всех контактах:")
    contactList.forEach { it.printContactInfo(); println("---") }
}
