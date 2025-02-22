package org.example.Lesson_20

class GameCharacter(
    val name: String,
    val hasKey: Boolean
)

fun main() {
    val checkDoor: (GameCharacter) -> String = { character ->
        if (character.hasKey) {
            "${character.name} открыл дверь"
        } else {
            "Дверь заперта для ${character.name}"
        }
    }

    val characterWithKey = GameCharacter("Герой", true)
    val characterWithoutKey = GameCharacter("Вор", false)

    println(checkDoor(characterWithKey))
    println(checkDoor(characterWithoutKey))
}