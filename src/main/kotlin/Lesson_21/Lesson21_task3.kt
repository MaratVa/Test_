package org.example.Lesson_21

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player1 = Player("Герой", 100, 100)
    println("${player1.name} здоров: ${player1.isHealthy()}") // true

    val player2 = Player("Вор", 50, 100)
    println("${player2.name} здоров: ${player2.isHealthy()}")

    val healPlayer: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
    }

    healPlayer(player2)
    println("${player2.name} здоров после лечения: ${player2.isHealthy()}")
}