package org.example.lesson_11

class User(
    private val userId: Int,
    private val login: String,
    private val password: String,
    private val email: String
) {
    override fun toString(): String = "User(userId=$userId, password = $password,login=$login, email=$email)"

}

fun main() {
    val user1 = User(1, "johndoe", "password123", "john.doe@example.com")
    val user2 = User(2, "janedoe", "securepass", "jane.doe@example.com")

    println("User 1: $user1")
    println("User 2: $user2")
}