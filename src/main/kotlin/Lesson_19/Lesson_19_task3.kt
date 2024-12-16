package org.example.Lesson_19

class SpaceShip {
    fun takeOff() {
        println("Корабль взлетает...")
        //TODO("Здесь должна быть дополнительная логика для взлета")
    }

    fun land() {
        println("Корабль приземляется")
        throw NotImplementedError("Метод приземления не реализован")
    }

    fun shootAsteroid() {
        println("Корабль стреляет по астероиду!")
    }
}

fun main() {
    val ship = SpaceShip()

    ship.takeOff()
    try {
        ship.land()
    } catch (e: NotImplementedError) {
        println("Ошибка: ${e.message}")
    }
    ship.shootAsteroid()
}