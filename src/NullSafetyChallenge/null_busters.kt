package NullSafetyChallenge

fun greetUser(name: String?) {
    val length = name?.length
    println("Name length: $length")

    val greeting = if (name != null) "Hello, $name!" else "Hello, Guest!"
    println(greeting)
}

fun calculateArea(width: Int, height: Int): Int {
    require(width > 0) { "Width must be greater than zero" }
    require(height > 0) { "Height must be greater than zero" }

    return width * height
}

fun main() {
    greetUser("Zainab")
    greetUser(null)

    var address: String? = null
    val finalAddress = address ?: "Unknown Address"
    println("Address: $finalAddress")

    println("Area: ${calculateArea(5, 10)}")

    val age: Int = 21
    var nullableAge: Int? = null
    println("Nullable Age: $nullableAge")
}

//The difference between betweeen nullable types and non-nullable types is that non-nullable types must have a value, while nullable types (?) can hold null