package org.example.Lesson_17

class Ship(
    private val name: String,
    var averageSpeed: Double,
    var port: String
) {

    fun changeName(newName: String) {
        println("Предупреждение: имя корабля не может быть изменено!")
    }

    fun displayShipInfo() {
        println("Имя: $name, Средняя скорость: $averageSpeed, Порт приписки: $port")
    }
}

fun main() {
    val myShip = Ship("Enterprise", 30.5, "Starbase")
    myShip.displayShipInfo()

    myShip.changeName("USS Constitution")
    myShip.displayShipInfo()

    myShip.averageSpeed = 35.0
    myShip.port = "New Earth"
    myShip.displayShipInfo()
}