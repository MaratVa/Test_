package org.example.Lesson_15

open class Product(
    val name: String,
    var quantity: Int
)

interface Searchable {
    fun searchForAccessories(productName: String): String
}

class Instrument(name: String, quantity: Int) : Product(name, quantity), Searchable {
    override fun searchForAccessories(productName: String): String {
        return "Выполняется поиск комплектующих для $productName..."
    }
}

class Accessory(name: String, quantity: Int) : Product(name, quantity)

fun main() {
    val guitar = Instrument("Guitarra", 10)
    val strings = Accessory("Strings", 50)
    val pick = Accessory("Pick", 100)

    println("Инструмент: ${guitar.name}, количество: ${guitar.quantity}")
    println("Комплектующие: ${strings.name}, количество: ${strings.quantity}")
    println("Комплектующие: ${pick.name}, количество: ${pick.quantity}")

    println(guitar.searchForAccessories("Guitarra"))
}