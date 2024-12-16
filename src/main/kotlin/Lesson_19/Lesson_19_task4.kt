package org.example.Lesson_19

enum class AmmoType(
    val damage: Int
) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    private var currentAmmo: AmmoType? = null

    fun loadAmmo(ammoType: AmmoType) {
        currentAmmo = ammoType
        println("Танк заряжен патронами типа ${ammoType.name}")
    }

    fun shoot() {
        if (currentAmmo == null) {
            println("Танк не заряжен! Выстрел невозможен.")
            return
        }

        println("Произведен выстрел! Нанесен урон: ${currentAmmo!!.damage} единиц.")
    }
}

fun main() {
    val tank = Tank()

    tank.shoot()

    tank.loadAmmo(AmmoType.BLUE)
    tank.shoot()

    tank.loadAmmo(AmmoType.GREEN)
    tank.shoot()

    tank.loadAmmo(AmmoType.RED)
    tank.shoot()
}