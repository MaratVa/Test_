package org.example.Lesson_20

fun main() {
    val createGreeting: (String) -> String = { username ->
        "С наступающим Новым Годом, $username!"
    }

    val userName = "Иван"
    val greeting = createGreeting(userName)
    println(greeting)
}