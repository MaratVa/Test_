package org.example.Lesson_16

class User(
    var login: String,
    private val password: String
) {
    fun validatePassword(passwordAttempt: String): Boolean {
        return passwordAttempt == password
    }
}

fun main() {
    val user = User("johndoe", "secretPassword")
    println("Initial login: ${user.login}")
    user.login = "janedoe"
    println("Changed login: ${user.login}")
    val passwordAttempt = "secretPassword"
    val isCorrect = user.validatePassword(passwordAttempt)
    println("Введенный пароль корректен: $isCorrect")
}