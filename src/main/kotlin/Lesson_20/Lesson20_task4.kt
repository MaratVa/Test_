package org.example.Lesson_20

fun main() {
    val items = listOf("Кнопка 1", "Кнопка 2", "Кнопка 3", "Кнопка 4", "Кнопка 5", "Кнопка 6")

    val itemActions: List<(String) -> Unit> = items.map { itemName ->
        {
            println("Нажат элемент $itemName")
        }
    }

    itemActions.forEachIndexed { index, action ->
        if ((index + 1) % 2 == 0) {
            action(items[index])
        }
    }
}