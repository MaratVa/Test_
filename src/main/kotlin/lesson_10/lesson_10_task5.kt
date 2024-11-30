package org.example.lesson_10

fun generateToken(): String {
    val lowercaseChars = ('a'..'z')
    val uppercaseChars = ('A'..'Z')
    val digits = ('0'..'9')
    val allChars = lowercaseChars + uppercaseChars + digits
    return (1..32).map { allChars.random() }.joinToString("")
}

fun authorize(login: String, password: String): String? {
    return if (login.lowercase() == VALID_LOGIN.lowercase() && password == VALID_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getShoppingCart(token: String?): List<String>? {
    return if (token != null) {
        listOf("Товар 1", "Товар 2", "Товар 3")
    } else {
        null
    }
}

fun main() {
    print("Введите логин: ")
    val login = readLine() ?: ""
    print("Введите пароль: ")
    val password = readLine() ?: ""

    val token = authorize(login, password)
    val cart = getShoppingCart(token)

    if (cart != null) {
        println("Корзина: $cart")
    } else {
        println("Авторизация не удалась.")
    }
}

const val VALID_LOGIN = "validuser"
const val VALID_PASSWORD = "validpassword"