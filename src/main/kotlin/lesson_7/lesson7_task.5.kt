package org.example.lesson_7

fun generatePassword(length: Int): String {
    if (length < 6) throw IllegalArgumentException("Длина пароля должна быть не менее 6 символов")

    val chars = ('a'..'z').toList() + ('A'..'Z').toList() + ('0'..'9').toList()
    val password = mutableListOf<Char>()

    while (password.count { it.isDigit() } == 0 || password.count { it.isLowerCase() } == 0 || password.count { it.isUpperCase() } == 0) {
        password.clear()
        for (i in 0 until length) {
            password.add(chars.random())
        }
    }


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