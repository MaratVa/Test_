package org.example.Lesson_17

class Folder(
    private val name: String,
    private val isSecret: Boolean,
    private var fileCount: Int
) {

    val folderName: String
        get() = if (isSecret) "скрытая папка" else name

    val filesInFolder: Int
        get() = if (isSecret) 0 else fileCount

}

fun main() {
    val secretFolder = Folder("Secret Documents", true, 15)
    println("Название папки: ${secretFolder.folderName}")
    println("Количество файлов: ${secretFolder.filesInFolder}")

    val publicFolder = Folder("Public Files", false, 5)
    println("Название папки: ${publicFolder.folderName}")
    println("Количество файлов: ${publicFolder.filesInFolder}")
}