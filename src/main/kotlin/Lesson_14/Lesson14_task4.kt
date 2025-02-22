package org.example.Lesson_14

open class CelestialBody(
    private val name: String,
    private val hasAtmosphere: Boolean,
    private val suitableForLanding: Boolean
) {
    open fun displayInfo() {
        println("Название: $name, Атмосфера: ${if (hasAtmosphere) "есть" else "нет"}, Пригодность для высадки: ${if (suitableForLanding) "да" else "нет"}")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean,
    val satellites: MutableList<Satellite> = mutableListOf()
) : CelestialBody(name, hasAtmosphere, suitableForLanding) {
    override fun displayInfo() {
        super.displayInfo()
        println("Спутники:")
        if (satellites.isEmpty()) {
            println("  Нет спутников")
        } else {
            satellites.forEach { it.displayInfo() }
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    suitableForLanding: Boolean
) : CelestialBody(name, hasAtmosphere, suitableForLanding)

fun main() {
    val planet = Planet("Земля", hasAtmosphere = true, suitableForLanding = true)
    val moon = Satellite(name = "Луна", hasAtmosphere = false, suitableForLanding = false)
    val phobos = Satellite(name = "Фобос", hasAtmosphere = false, suitableForLanding = false)

    planet.satellites.add(moon)
    planet.satellites.add(phobos)

    planet.displayInfo()
}