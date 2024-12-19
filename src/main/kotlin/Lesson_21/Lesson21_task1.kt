package org.example.Lesson_21

fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOU"
    var count = 0
    for (char in this) {
        if (vowels.contains(char)) {
            count++
        }
    }
    return count
}

fun main() {
    val str1 = "hello"
    println("Количество гласных в строке \"$str1\": ${str1.vowelCount()}")

    val str2 = "Programming"
    println("Количество гласных в строке \"$str2\": ${str2.vowelCount()}")

    val str3 = "Kotlin"
    println("Количество гласных в строке \"$str3\": ${str3.vowelCount()}")

    val str4 = "aEiOu"
    println("Количество гласных в строке \"$str4\": ${str4.vowelCount()}")
}