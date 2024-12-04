package org.example.Lesson_14

open class Vessel(
    private val name: String,
    open val speed: Double = 20.0,
    open val capacity: Int = 100
) {
    open fun loadCargo() {
        println("Погрузка в процессе...")
    }

    open fun displayDetails() {
        println("Имя: $name, Скорость: $speed, Вместимость: $capacity")
    }
}

class CargoVessel(
    name: String,
    override val speed: Double = 15.0,
    override val capacity: Int = 500
) : Vessel(name, speed, capacity) {
    override fun loadCargo() {
        println("Активирован погрузочный кран. Погрузка груза...")
    }

    override fun displayDetails() {
        super.displayDetails()
        println("Тип корабля: Грузовой")
    }
}

class IcebreakerVessel(
    name: String,
    override val speed: Double = 10.0,
    override val capacity: Int = 50
) : Vessel(name, speed, capacity) {
    override fun loadCargo() {
        println("Открыты ворота на корме. Погрузка груза...")
    }

    override fun displayDetails() {
        super.displayDetails()
        println("Тип корабля: Ледокол")
    }
}

class LinerVessel(
    name: String,
    override val speed: Double = 25.0,
    override val capacity: Int = 300
) : Vessel(name, speed, capacity) {
    override fun loadCargo() {
        println("Выдвинут горизонтальный трап. Погрузка пассажиров...")
    }

    override fun displayDetails() {
        super.displayDetails()
        println("Тип корабля: Лайнер")
    }
}

fun main() {
    val cargoVessel = CargoVessel("Грузовое судно")
    cargoVessel.loadCargo()
    cargoVessel.displayDetails()
    println("--------------------")

    val icebreakerVessel = IcebreakerVessel("Ледокол")
    icebreakerVessel.loadCargo()
    icebreakerVessel.displayDetails()
    println("--------------------")

    val linerVessel = LinerVessel("Лайнер")
    linerVessel.loadCargo()
    linerVessel.displayDetails()
    println("--------------------")
}