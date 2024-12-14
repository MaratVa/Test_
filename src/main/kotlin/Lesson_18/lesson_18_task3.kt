package org.example.Lesson_18

abstract class Animal(val name: String) {
    abstract fun eat()
    abstract fun sleep()

}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }

    override fun sleep() {
        println("$name -> спит")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }

    override fun sleep() {
        println("$name -> спит")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }

    override fun sleep() {
        println("$name -> спит")
    }
}

fun main() {
    val fox = Fox("Лиса")
    val dog = Dog("Собака")
    val cat = Cat("Кошка")

    val animals: List<Animal> = listOf(fox, dog, cat)

    animals.forEach { animal ->
        animal.eat()
    }
    animals.forEach { animal ->
        animal.sleep()
    }
}