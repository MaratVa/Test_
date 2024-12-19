package org.example.Lesson_21

import java.io.File
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.FileReader
import java.io.FileWriter


fun File.writeWordToFile(word: String) {
    val lowerCaseWord = word.lowercase()
    val tempFile = File.createTempFile("temp", null)

    BufferedReader(FileReader(this)).use { reader ->
        BufferedWriter(FileWriter(tempFile)).use { writer ->
            writer.write("$lowerCaseWord\n")
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                writer.write("$line\n")
            }
        }
    }

    this.delete()
    tempFile.copyTo(this, overwrite = true)
    tempFile.delete()
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