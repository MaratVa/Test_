package org.example.Lesson_16

class Order(
    val orderNumber: Int,
    var status: String = "Создан"
) {
    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun submitRequestToManager(newStatus: String) {
        if (newStatus.lowercase() in listOf("обрабатывается", "доставляется", "доставлен", "отменен")) {
            changeStatus(newStatus)
            println("Заявка менеджеру отправлена. Новый статус заказа №$orderNumber: $status")
        } else {
            println("Неверный статус заказа!")
        }
    }
}

fun main() {
    val order = Order(12345)
    println("Текущий статус заказа №${order.orderNumber}: ${order.status}")
    order.submitRequestToManager("Обрабатывается")
    println("Текущий статус заказа №${order.orderNumber}: ${order.status}")
    order.submitRequestToManager("Доставляется")
    println("Текущий статус заказа №${order.orderNumber}: ${order.status}")
    order.submitRequestToManager("Доставлен")
    println("Текущий статус заказа №${order.orderNumber}: ${order.status}")
    order.submitRequestToManager("Отменен")
    println("Текущий статус заказа №${order.orderNumber}: ${order.status}")
    order.submitRequestToManager("Неверный статус")
    println("Текущий статус заказа №${order.orderNumber}: ${order.status}")
}