package org.example.Lesson_16

class Player(
    val name: String,
    private var health: Int,
    var attackPower: Int) {
    private fun isDead(): Boolean = health <= 0

    private fun onDeath() {
        if (isDead()) {
            attackPower = 0
            health = 0
            println("$name погиб в бою!")
        }
    }

    fun takeDamage(damage: Int) {
        health -= damage
        println("$name получил $damage урона. Оставшееся здоровье: $health")
        onDeath()
    }

    fun heal(healPoints: Int) {
        if (!isDead()) {
            health = minOf(health + healPoints, 100)
            println("$name получил $healPoints единиц лечения. Оставшееся здоровье: $health")
        } else {
            println("$name уже мертв и не может лечиться.")
        }
    }
}

fun main() {
    val player = Player("BraveHero", 100, 20)
    player.takeDamage(30)
    player.heal(20)
    player.takeDamage(50)
    player.heal(10)
    player.takeDamage(80)
    player.heal(50)
    println("Сила удара ${player.name}: ${player.attackPower}")
}