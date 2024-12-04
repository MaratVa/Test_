package org.example.Lesson_14

import java.util.UUID

open class Message(val id: UUID, val text: String, val author: String) {
    open fun displayMessage() {
        println("$id - $author: $text")
    }
}

class ChildMessage(id: UUID, text: String, author: String, val parentMessageId: UUID) : Message(id, text, author) {
    override fun displayMessage() {
        println("\t$id - $author: $text")
    }
}

class Chat {
    private val messages = mutableListOf<Message>()

    fun addMessage(text: String, author: String): Message {
        val newMessage = Message(UUID.randomUUID(), text, author)
        messages.add(newMessage)
        return newMessage
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: UUID) {
        messages.add(ChildMessage(UUID.randomUUID(), text, author, parentMessageId))
    }

    fun printChat() {
        val messagesCopy = messages.toList()

        messagesCopy.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                else -> message.id
            }
        }.forEach { (parentId, messagesInThread) ->
            val parentMessage = messagesCopy.find { it.id == parentId }
            if (parentMessage != null) {
                parentMessage.displayMessage()
                messagesInThread.filter { it.id != parentId }.forEach { it.displayMessage() }
            }
        }
    }
}

fun main() {
    val chat = Chat()
    val message1 = chat.addMessage("Привет всем!", "User1")
    chat.addMessage("Как дела?", "User2")
    chat.addThreadMessage("Хорошо!", "User1", message1.id)
    chat.addThreadMessage("А у тебя?", "User2", message1.id)
    chat.addMessage("Отлично!", "User3")

    chat.printChat()
}