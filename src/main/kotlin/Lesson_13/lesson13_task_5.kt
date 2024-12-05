package org.example.Lesson_13


class ContactEntry(
    val name: String,
    val phoneNumber: Long?,
    val company: String?
)

fun main() {
    val contacts = mutableListOf<ContactEntry>()
    while (true) {
        println("Введите имя контакта (или 'end' для завершения):")
        val name = readLine() ?: continue
        if (name.lowercase() == "end") break

        println("Введите номер телефона:")
        val phoneNumberStr = readLine() ?: ""
        val phoneNumber: Long? = try {
            phoneNumberStr.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка: Некорректный формат номера телефона. Запись не добавлена.")
            null
        }

        println("Введите компанию (или оставьте пустым):")
        val company = readLine()

        if (phoneNumber != null) {
            contacts.add(ContactEntry(name, phoneNumber, company))
        }
    }

    println("\nСозданные контакты:")
    contacts.forEach { contact ->
        println("Имя: ${contact.name}, Телефон: ${contact.phoneNumber}, Компания: ${contact.company}")
    }
}
