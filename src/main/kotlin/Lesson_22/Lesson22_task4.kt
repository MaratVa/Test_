package org.example.Lesson_22

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = false, data = "")
        println("Состояние: ${mainScreenState}")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Состояние: ${mainScreenState}")

        mainScreenState = mainScreenState.copy(isLoading = false, data = "Данные загружены!")
        println("Состояние: ${mainScreenState}")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}