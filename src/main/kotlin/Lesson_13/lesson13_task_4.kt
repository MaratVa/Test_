package org.example.Lesson_13

class Contact(
    private val name: String,
    private val phoneNumber: Long?,
    private val company: String?
) {
    override fun toString(): String {
        return "Имя: $name, Телефон: ${phoneNumber ?: "<не указано>"}, Компания: ${company ?: "<не указано>"}"
    }
}

fun printContacts(contacts: List<Contact>) {
    if (contacts.isEmpty()) {
        println("Список контактов пуст")
        return
    }
    contacts.forEach { println(it) }
}

fun main() {
    val contacts = mutableListOf<Contact>()
    while (true) {
        println("Введите имя контакта (или 'end' для завершения):")
        val name = readLine() ?: continue
        if (name.lowercase() == "end") break

        println("Введите номер телефона:")
        val phoneNumberStr = readLine() ?: ""
        val phoneNumber = phoneNumberStr.toLongOrNull()
        if (phoneNumber == null) {
            println("Некорректный номер телефона. Запись не добавлена.")
            continue
        }

        println("Введите компанию (или оставьте пустым):")
        val company = readLine()

        contacts.add(Contact(name, phoneNumber, company))
    }

    println("\nСозданные контакты:")
    printContacts(contacts)
}
