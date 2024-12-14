package org.example.Lesson_18

class Order(
    val orderNumber: Int
) {

    fun displayOrderInfo(product: String) {
        println("Заказан товар: $product")
    }

    fun displayOrderInfo(products: List<String>) {
        val productList = products.joinToString(", ")
        println("Заказаны следующие товары: $productList")
    }
}

fun main() {
    val order1 = Order(101)
    order1.displayOrderInfo("Книга")

    val order2 = Order(102)
    order2.displayOrderInfo(listOf("Футболка", "Шорты", "Кроссовки"))
}