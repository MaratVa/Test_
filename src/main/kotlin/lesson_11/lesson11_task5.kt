package org.example.lesson_11

data class ForumMember(
    val userId: Int,
    val userName: String
)

data class ForumMessage(
    val authorId: Int,
    val message: String
)

class Forum {
    private val members: MutableList<ForumMember> = mutableListOf()
    private val messages: MutableList<ForumMessage> = mutableListOf()
    private var nextUserId = 1

    fun createNewUser(userName: String): ForumMember {
        val newMember = ForumMember(nextUserId++, userName)
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage? {
        if (members.any { it.userId == authorId }) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            return newMessage
        }
        return null
    }

    fun printThread() {
        messages.forEach { message ->
            val author = members.find { it.userId == message.authorId }?.userName ?: "Unknown User"
            println("$author: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("JohnDoe")
    val user2 = forum.createNewUser("JaneDoe")

    forum.createNewMessage(user1.userId, "Привет всем!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Отличный день!")
    forum.createNewMessage(user2.userId, "А у вас?")

    forum.printThread()
}