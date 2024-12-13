package org.example.Lesson_17

class QuizItem(
    private val question: String,
    private var answer: String
) {
    val questionText: String
        get() = question

    var answerText: String
        get() = this.answer
        set(value) {
            this.answer = value
        }
}

fun main() {
    val quizItem = QuizItem("Какая планета является самой большой?", "Юпитер")
    println("Вопрос: ${quizItem.questionText}")
    println("Ответ: ${quizItem.answerText}")

    quizItem.answerText = "Сатурн"
    println("Изменённый ответ: ${quizItem.answerText}")
}