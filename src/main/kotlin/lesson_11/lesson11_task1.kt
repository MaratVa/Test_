package org.example.lesson_11

data class User(
    val userId: Int,
    val login: String,
    val password: String,
    val email: String
)

fun main() {
    val user1 = User(1, "johndoe", "password123", "john.doe@example.com")
    val user2 = User(2, "janedoe", "securepass", "jane.doe@example.com")

    println("User 1: $user1")
    println("User 2: $user2")
}