package org.example.Lesson_17

class Ship(
    private var name: String,
    private var averageSpeed: Double,
    port: String
) {

    var shipName: String
        get() = name
        set(value) = println("Предупреждение: имя корабля не может быть изменено!")


    var shipAverageSpeed: Double
        get() = averageSpeed
        set(value) {
            averageSpeed = value
        }

    var shipPort: String = port


    fun displayShipInfo() {
        println("Имя: $shipName, Средняя скорость: $shipAverageSpeed, Порт приписки: $shipPort")
    }
}

fun main() {
    val myShip = Ship("Enterprise", 30.5, "Starbase")
    myShip.displayShipInfo()

    myShip.shipName = "USS Constitution"
    myShip.displayShipInfo()

    myShip.shipAverageSpeed = 35.0
    myShip.shipPort = "New Earth"
    myShip.displayShipInfo()
}