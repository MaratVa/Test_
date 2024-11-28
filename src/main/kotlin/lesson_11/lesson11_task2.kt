package org.example.lesson_11

class User2(
    private val userId: Int,
    private val login: String,
    private var password: String,
    private val email: String,
    private var bio: String? = null
) {
    fun printUserInfo() {
        println("ID пользователя: $userId")
        println("Логин: $login")
        println("Email: $email")
        println("Информация о себе: $bio")
    }

    fun updateBio(newBio: String) {
        bio = newBio
        println("Информация о себе обновлена!")
    }

    fun changePassword(currentPassword: String, newPassword: String) {
        if (currentPassword == password) {
            password = newPassword
            println("Пароль успешно изменен!")
        } else {
            println("Неверный текущий пароль.")
        }
    }
}

fun main() {
    val user = User2(1, "johndoe", "oldpassword", "john.doe@example.com")

    user.printUserInfo()
    user.updateBio("Это моя новая информация о себе!")
    user.changePassword("oldpassword", "newpassword")
    user.printUserInfo()
}