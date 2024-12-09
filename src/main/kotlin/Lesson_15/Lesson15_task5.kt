package org.example.Lesson_15

interface Movable {
    fun move()
}

interface PassengerCarrier {
    var maxPassengers: Int
    var currentPassengers: Int
    fun loadPassenger()
    fun unloadPassenger()
}

interface CargoCarrier {
    var maxCargo: Double
    var currentCargo: Double
    fun loadCargo(amount: Double)
    fun unloadCargo(amount: Double)
}

class Truck(
    override var maxPassengers: Int = 1,
    override var maxCargo: Double = 2.0
) : Movable, PassengerCarrier,
    CargoCarrier {
    override var currentPassengers: Int = 0
    override var currentCargo: Double = 0.0

    override fun move() {
        println("Грузовик едет")
    }

    override fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Пассажир сел в грузовик")
        } else {
            println("Грузовик полон")
        }
    }

    override fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир вышел из грузовика")
        } else {
            println("В грузовике нет пассажиров")
        }
    }

    override fun loadCargo(amount: Double) {
        if (currentCargo + amount <= maxCargo) {
            currentCargo += amount
            println("Груз загружен в грузовик ($amount тонн)")
        } else {
            println("Грузовик перегружен")
        }
    }

    override fun unloadCargo(amount: Double) {
        if (currentCargo >= amount) {
            currentCargo -= amount
            println("Груз выгружен из грузовика ($amount тонн)")
        } else {
            println("Недостаточно груза для выгрузки")
        }
    }
}

class Car(
    override var maxPassengers: Int = 3,
    override var maxCargo: Double = 0.0
) : Movable, PassengerCarrier,
    CargoCarrier {
    override var currentPassengers: Int = 0
    override var currentCargo: Double = 0.0

    override fun move() {
        println("Легковая машина едет")
    }

    override fun loadPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++
            println("Пассажир сел в машину")
        } else {
            println("Машина полна")
        }
    }

    override fun unloadPassenger() {
        if (currentPassengers > 0) {
            currentPassengers--
            println("Пассажир вышел из машины")
        } else {
            println("В машине нет пассажиров")
        }
    }

    override fun loadCargo(amount: Double) {
        println("Легковая машина не может перевозить грузы")
    }

    override fun unloadCargo(amount: Double) {
        println("Легковая машина не может перевозить грузы")
    }
}

fun main() {
    val truck = Truck()
    val car = Car()

    truck.loadPassenger()
    for (i in 1..5) car.loadPassenger()
    truck.loadCargo(2.0)

    println("Пассажиры в грузовике: ${truck.currentPassengers}")
    println("Груз в грузовике: ${truck.currentCargo} тонн")
    println("Пассажиры в легковой: ${car.currentPassengers}")
}