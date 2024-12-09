package org.example.Lesson_15

abstract class ForumUser(val username: String) {
    open fun readForum() {
        println("$username читает форум.")
    }

    open fun postMessage(message: String) {
        println("$username пишет сообщение: $message")
    }

    abstract fun canDeleteMessages(): Boolean
    abstract fun canDeleteUsers(): Boolean

}

class RegularUser(username: String) : ForumUser(username) {
    override fun canDeleteMessages(): Boolean = false
    override fun canDeleteUsers(): Boolean = false

}

class Administrator(username: String) : ForumUser(username) {
    override fun canDeleteMessages(): Boolean = true
    override fun canDeleteUsers(): Boolean = true

    fun deleteMessage(message: String) {
        println("$username удаляет сообщение: $message")
    }

    fun deleteUser(user: ForumUser) {
        println("$username удаляет пользователя: ${user.username}")
    }
}

fun main() {
    val regularUser = RegularUser("User1")
    val admin = Administrator("Admin")

    regularUser.readForum()
    regularUser.postMessage("Привет всем!")

    admin.readForum()
    admin.postMessage("Добро пожаловать!")
    admin.deleteMessage("Нежелательное сообщение")
    admin.deleteUser(regularUser)

}