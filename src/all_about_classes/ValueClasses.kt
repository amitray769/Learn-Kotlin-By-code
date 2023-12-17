package src.all_about_classes

/**
* Kotlin has normal classes to represent a value. but it also provides even more advanced ways.
 * These include value classes, data classes, Type-aliases.
 *Also, value classes in Kotlin can potentially be more performant than data classes,
 *  because they are annotated with the @JvmInline annotation, which tells the Kotlin compiler to inline the
 *  class into its calling code. While,data classes is expensive.
 *
 * [Medium Article](https://oguzhanaslann.medium.com/what-is-inline-value-class-in-kotlin-c3a1096beaec)
**/

@JvmInline
value class Foo(val someValue: Int) {
    fun doSomething() = println("do work do $someValue")
}


fun main() {
    val f = Foo(5)
    f.doSomething()
}