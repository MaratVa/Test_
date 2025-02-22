package org.example.Lesson_17

class Parcel(
    private val parcelNumber: Int, initialLocation: String
) {
    private var _location: String = initialLocation
    private var _movementCount: Int = 0

    val location: String
        get() = _location

    val movementCount: Int
        get() = _movementCount

    var locationSetter: String
        get() = _location
        set(value) {
            _location = value
            _movementCount++
            println("Посылка №$parcelNumber прибыла в $value. Количество перемещений: $_movementCount")
        }
}

fun main() {
    val myParcel = Parcel(12345, "Склад А")
    println("Начальное местоположение: ${myParcel.location}")
    println("Количество перемещений: ${myParcel.movementCount}")

    myParcel.locationSetter = "Пункт сортировки В"
    println("Местоположение: ${myParcel.location}")
    println("Количество перемещений: ${myParcel.movementCount}")

    myParcel.locationSetter = "Пункт обработки С"
    println("Местоположение: ${myParcel.location}")
    println("Количество перемещений: ${myParcel.movementCount}")
}