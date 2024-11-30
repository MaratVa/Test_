package org.example.lesson_11

class VoiceChatUser(
    val id: Int,
    val nickname: String,
    val avatarUrl: String
)

class Room(
    private val coverUrl: String,
    private val name: String,
    private val participants: MutableList<VoiceChatUser> = mutableListOf(),
    private val participantStatuses: MutableMap<Int, String> = mutableMapOf()
) {
    fun addParticipant(user: VoiceChatUser) {
        participants.add(user)
        participantStatuses[user.id] = "микрофон выключен"
    }

    fun updateParticipantStatus(userId: Int, newStatus: String) {
        participantStatuses[userId] = newStatus
    }

    fun printRoomInfo() {
        println("Название комнаты: $name")
        println("Обложка: $coverUrl")
        println("Участники:")
        participants.forEach { user ->
            val status = participantStatuses[user.id] ?: "Неизвестно"
            println("  - ${user.nickname} (${user.avatarUrl}) - $status")
        }
    }
}

fun main() {
    val user1 = VoiceChatUser(1, "user123", "avatar1.jpg")
    val user2 = VoiceChatUser(2, "some_user", "avatar2.png")
    val user3 = VoiceChatUser(3, "anotherOne", "avatar3.jpeg")

    val room = Room(
        "cover.jpg",
        "Комната для обсуждения Kotlin",
    )

    room.addParticipant(user1)
    room.addParticipant(user2)
    room.addParticipant(user3)
    room.updateParticipantStatus(user1.id, "разговаривает")
    room.updateParticipantStatus(user3.id, "пользователь заглушен")

    room.printRoomInfo()
}