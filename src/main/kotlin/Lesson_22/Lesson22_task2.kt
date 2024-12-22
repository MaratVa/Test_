package org.example.Lesson_22

class RegularBookClass(
    val title: String,
    val author: String
)

data class DataBookClass(
    val title: String,
    val author: String
)

fun main() {

    val regularBook = RegularBookClass("The Lord of the Rings", "J.R.R. Tolkien")
    val dataBook = DataBookClass("The Hobbit", "J.R.R. Tolkien")

    println("Вывод экземпляра RegularBookClass: $regularBook")
    println("Вывод экземпляра DataBookClass: $dataBook")

    /*
     Разница в выводе заключается в том, что data класс DataBookClass автоматически генерирует метод toString(), который возвращает строковое представление объекта, содержащее значения его свойств.
     Обычный класс RegularBookClass не генерирует такой метод автоматически, поэтому при выводе объекта в консоль используется стандартная реализация toString(), которая выводит имя класса и его хэш-код, что не несет полезной информации о состоянии объекта.
     */
}