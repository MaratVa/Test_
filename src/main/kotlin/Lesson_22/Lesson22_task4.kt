package org.example.Lesson_22

class MainScreenViewModel {

    private var _mainScreenState = MainScreenState()

    val mainScreenState: MainScreenState
        get() = _mainScreenState

    private val listeners = mutableListOf<(MainScreenState) -> Unit>()

    fun subscribe(listener: (MainScreenState) -> Unit) {
        listeners.add(listener)
    }

    private fun notifySubscribers() {
        listeners.forEach { it(_mainScreenState) }
    }

    fun loadData() {
        _mainScreenState = MainScreenState(isLoading = false, data = "")
        notifySubscribers()
        println("Состояние 1: $_mainScreenState")

        _mainScreenState = _mainScreenState.copy(isLoading = true)
        notifySubscribers()
        println("Состояние 2: ${_mainScreenState}")

        _mainScreenState = _mainScreenState.copy(isLoading = false, data = "Данные загружены!")
        notifySubscribers()
        println("Состояние 3: $_mainScreenState")
    }

    data class MainScreenState(
        val data: String = "",
        val isLoading: Boolean = false
    )
}

fun main() {
    val viewModel = MainScreenViewModel()

    viewModel.subscribe { state ->
        println("UI получил изменение состояния: $state")
    }

    viewModel.loadData()
}