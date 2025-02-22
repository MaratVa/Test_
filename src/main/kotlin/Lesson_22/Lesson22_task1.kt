package org.example.Lesson_22

class RegularBook(
    val title: String,
    val author: String
)

data class DataBook(
    val title: String,
    val author: String
)

fun main() {
    val regularBook1 = RegularBook("The Lord of the Rings", "J.R.R. Tolkien")
    val regularBook2 = RegularBook("The Lord of the Rings", "J.R.R. Tolkien")
    val regularBook3 = RegularBook("The Hobbit", "J.R.R. Tolkien")

    val dataBook1 = DataBook("The Lord of the Rings", "J.R.R. Tolkien")
    val dataBook2 = DataBook("The Lord of the Rings", "J.R.R. Tolkien")
    val dataBook3 = DataBook("The Hobbit", "J.R.R. Tolkien")

    println("Сравнение regularBook1 и regularBook2: ${regularBook1 == regularBook2}")
    println("Сравнение regularBook1 и regularBook3: ${regularBook1 == regularBook3}")

    println("Сравнение dataBook1 и dataBook2: ${dataBook1 == dataBook2}")
    println("Сравнение dataBook1 и dataBook3: ${dataBook1 == dataBook3}")

    /*
       Разница между сравнением экземпляров обычного класса RegularBook и data класса DataBook заключается в том, что data класс автоматически генерирует метод equals()
       и hashCode(), которые сравнивают объекты по значениям свойств (свойства title и author). Обычный класс же не генерирует автоматически эти методы, поэтому сравнение экземпляров происходит по ссылке, то есть, сравниваются
       адреса памяти, в которой хранятся объекты.  В результате экземпляры обычного класса, даже если они имеют одинаковые свойства, не будут равны (т.к. это два разных объекта в памяти).
       А экземпляры data класса, имеющие одинаковые значения полей будут считаться равными.
     */
}