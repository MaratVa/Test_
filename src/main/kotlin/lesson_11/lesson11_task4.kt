package org.example.lesson_11

class RecipeCategory(
    val categoryId: Int,
    val name: String,
    private val recipes: MutableList<Recipe> = mutableListOf()
) {
    override fun toString(): String = "RecipeCategory(categoryId=$categoryId, name='$name')"

    fun addRecipe(recipe: Recipe) {
        recipes.add(recipe)
    }
}

class Ingredient(
    private val ingredientId: Int,
    val name: String,
    private val quantity: String = "1",
    private val unit: String = "unit"
) {
    override fun toString(): String =
        "Ingredient(ingredientId=$ingredientId, name='$name', quantity='$quantity', unit='$unit')"
}

class Recipe(
    private val recipeId: Int,
    val title: String,
    private val categoryId: Int,
    val ingredients: List<Ingredient>
) {
    override fun toString(): String =
        "Recipe(recipeId=$recipeId, title='$title', categoryId=$categoryId, ingredients=$ingredients)"
}

fun main() {
    val burgerCategory = RecipeCategory(1, "Burgers")
    val ingredients = listOf(
        Ingredient(1, "Beef patty"),
        Ingredient(2, "Mushrooms"),
        Ingredient(3, "Cheese"),
        Ingredient(4, "White mushroom sauce"),
        Ingredient(5, "Red onion"),
        Ingredient(6, "Tomatoes"),
        Ingredient(7, "Burger buns", "2", "pieces")
    )
    val mushroomCheeseBurger = Recipe(1, "Burger with Mushrooms and Cheese", burgerCategory.categoryId, ingredients)

    burgerCategory.addRecipe(mushroomCheeseBurger)

    println("Category: ${burgerCategory.name}")
    println("Recipe: ${mushroomCheeseBurger.title}")
    println("Ingredients:")
    mushroomCheeseBurger.ingredients.forEach { ingredient ->
        println("- ${ingredient.name}")
    }
}