package org.example.Lesson_17

class User(
    private var login: String,
    private var password: String
) {

    var loginProperty: String = ""
        get() = login
        set(value) {
            field = value
            println("Логин успешно изменен на: $value")
        }

    var passwordProperty: String
        get() = "*".repeat(password.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {
    val user = User("initialLogin", "initialPassword")
    println("Текущий логин: ${user.loginProperty}")
    println("Текущий пароль: ${user.passwordProperty}")

    user.loginProperty = "newLogin"
    println("Новый логин: ${user.loginProperty}")

    user.passwordProperty = "newPassword"
    println("Пароль: ${user.passwordProperty}")
}