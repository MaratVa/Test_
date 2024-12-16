package org.example.Lesson_19

enum class ProductCategory(
    private val userFriendlyName: String
) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISCELLANEOUS("Разное");

    fun getUserFriendlyCategory(): String {
        return userFriendlyName
    }
}

class Product
    (
    private val name: String,
    private val id: Int,
    private val category: ProductCategory
) {
    fun displayProductInfo() {
        println("Название: $name, ID: $id, Категория: ${category.getUserFriendlyCategory()}")
    }
}

fun main() {
    val product1 = Product("Футболка", 101, ProductCategory.CLOTHING)
    val product2 = Product("Ручка", 205, ProductCategory.STATIONERY)
    val product3 = Product("Книга", 312, ProductCategory.MISCELLANEOUS)
    val product4 = Product("Штаны", 102, ProductCategory.CLOTHING)

    product1.displayProductInfo()
    product2.displayProductInfo()
    product3.displayProductInfo()
    product4.displayProductInfo()
}