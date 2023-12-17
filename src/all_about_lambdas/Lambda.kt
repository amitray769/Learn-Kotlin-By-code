package src.all_about_lambdas

/**
*Checking whether Lambda exposed with AnyClass.() -> Unit also exposes its member variable or not. I found that it
 * exposes every thing.
**/
interface BoxWithConstraintsScope {
    val constraint : Int
        get() = 5

    val minWidth : Int
}

private fun BoxWithConstraints(
    lambda: BoxWithConstraintsScope.() -> Unit
){

}


fun main() {
    var a = 4
    BoxWithConstraints {
       a = constraint
    }
    println(a)
}
