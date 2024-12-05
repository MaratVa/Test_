package org.example.Lesson_13

class Contact2(
    private val name: String,
    private val phoneNumber: String, private var company: String?
) {
    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact = Contact2("Ростислав", "89123456789", null)
    contact.printContactInfo()
    val contact2 = Contact2("Иван", "1234567890", "OpenAI")
    contact2.printContactInfo()
}