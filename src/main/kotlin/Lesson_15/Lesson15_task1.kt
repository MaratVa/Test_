package org.example.Lesson_15

interface Flying {
    fun fly()
}

interface Swimming {
    fun swim()
}

class Carassius : Swimming {
    override fun swim() {
        println("Карась плывет")
    }
}

class Seagull : Flying {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck : Flying, Swimming {
    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает")
    }
}

fun main() {
    val carassius = Carassius()
    val seagull = Seagull()
    val duck = Duck()

    carassius.swim()
    seagull.fly()
    duck.fly()
    duck.swim()
}