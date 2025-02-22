package org.example.Lesson_21

import java.io.File

fun File.writeWordToFile(word: String) {
    val lowerCaseWord = word.lowercase()
    val existingContent = if (this.exists()) this.readText() else ""
    this.writeText("$lowerCaseWord\n$existingContent")
}

fun main() {
    val file = File("words.txt")
    file.createNewFile()

    file.writeWordToFile("Hello")
    file.writeWordToFile("World")
    file.writeWordToFile("Kotlin")

    println("Содержимое файла:")
    file.readLines().forEach { println(it) }
}