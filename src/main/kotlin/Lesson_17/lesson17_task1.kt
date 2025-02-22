package org.example.Lesson_17

class QuizItem(
    private val question: String,
    var answer: String
) {
    val questionText: String
        get() = question

}

fun main() {
    val quizItem = QuizItem("Какая планета является самой большой?", "Юпитер")
    println("Вопрос: ${quizItem.questionText}")
    println("Ответ: ${quizItem.answer}")

    quizItem.answer = "Сатурн"
    println("Изменённый ответ: ${quizItem.answer}")
}