package org.example.Lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long?,
    val company: String?
) {
    companion object {
        fun printContacts(contacts: List<Contact>) {
            contacts.forEach { contact ->
                println("Имя: ${contact.name}, Телефон: ${contact.phoneNumber}, Компания: ${contact.company}")
            }
        }
    }
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
    Contact.printContacts(contacts)
}
