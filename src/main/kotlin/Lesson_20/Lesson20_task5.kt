package org.example.Lesson_20

class Robot {
    private val phrases = listOf(
        "Привет, я робот!",
        "Как дела?",
        "Сегодня хороший день.",
        "Я люблю программировать.",
        "До скорой встречи!"
    )
    private var modifier: ((String) -> String)? = null


    fun setModifier(mod: (String) -> String) {
        modifier = mod
    }

    fun say() {
        val phrase = phrases.random()
        val modifiedPhrase = modifier?.invoke(phrase) ?: phrase
        println(modifiedPhrase)
    }
}

fun main() {
    val robot = Robot()

    println("Робот говорит обычным голосом:")
    robot.say()

    val reverseModifier: (String) -> String = { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }
    robot.setModifier(reverseModifier)

    println("\nРобот говорит задом наперед:")
    robot.say()
}