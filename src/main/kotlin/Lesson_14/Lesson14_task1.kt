package org.example.Lesson_14

open class Ship(
    private val name: String,
    open val speed: Double = 20.0,
    open val capacity: Int = 100
) {
    open fun displayDetails() {
        println("Имя: $name, Скорость: $speed, Вместимость: $capacity")
    }
}

class CargoShip(
    name: String,
    override val speed: Double = 15.0,
    override val capacity: Int = 500
) : Ship(name, speed, capacity) {
    override fun displayDetails() {
        super.displayDetails()
        println("Тип корабля: Грузовой")
    }
}

class Icebreaker(
    name: String,
    override val speed: Double = 10.0,
    override val capacity: Int = 50
) : Ship(name, speed, capacity) {
    override fun displayDetails() {
        super.displayDetails()
        println("Тип корабля: Ледокол")
        println("Функционал: Дробление льда")
    }
}

class Liner(
    name: String,
    override val speed: Double = 25.0,
    override val capacity: Int = 300
) : Ship(name, speed, capacity) {
    override fun displayDetails() {
        super.displayDetails()
        println("Тип корабля: Лайнер")
    }
}

fun main() {
    val cargoShip = CargoShip("Корабль-грузчик")
    cargoShip.displayDetails()
    println("------------------")

    val icebreaker = Icebreaker("Ледокол-1")
    icebreaker.displayDetails()
    println("------------------")

    val liner = Liner("Лайнер-1")
    liner.displayDetails()
    println("------------------")
}