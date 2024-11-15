package org.example.lesson_7

fun generatePassword(length: Int): String {
    if (length < 6) throw IllegalArgumentException("Длина пароля должна быть не менее 6 символов")

    val lowercaseLetters = ('a'..'z').toList()
    val uppercaseLetters = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()
    val allChars = lowercaseLetters + uppercaseLetters + digits
    val password = mutableListOf<Char>()

    password.add(lowercaseLetters.random())
    password.add(uppercaseLetters.random())
    password.add(digits.random())

    for (i in 3 until length) {
        password.add(allChars.random())
    }

    password.shuffle()
    return password.joinToString("")
}

fun main() {
    print("Введите длину пароля: ")
    val length = readLine()?.toIntOrNull() ?: run {
        println("Ошибка: Некорректный ввод. Пожалуйста, введите целое число."); return
    }

    try {
        val password = generatePassword(length)
        println("Сгенерированный пароль: $password")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}