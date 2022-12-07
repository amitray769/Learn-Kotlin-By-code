fun main() {
    val (name,age,gender) = fetchPersonDetails()
    println(name)
    println(age)
    println(gender)

}

fun fetchPersonDetails(): Person {
    val person = Person("Amit",25,"Male")
    return person
}


/**
 * The idiomatic way of returning multiple values from a function is to define your data class and return its instance from the function.
 * Then you can unpack values using destructuring declaration inside the caller function.
 */
data class Person(val name: String, val age: Int, val gender: String)
