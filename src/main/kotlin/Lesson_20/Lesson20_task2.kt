package org.example.Lesson_20

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int
)

fun main() {
    val healPlayer: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
        println("Игрок ${player.name} полностью исцелен!")
    }

    val player = Player("Герой", 50, 100)
    println("Здоровье игрока до лечения: ${player.currentHealth}")

    healPlayer(player)
    println("Здоровье игрока после лечения: ${player.currentHealth}")
}