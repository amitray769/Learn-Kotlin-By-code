package sealed_class

sealed class Result<out S, out F> {
    abstract fun <R> map(func: (S) -> R) : Result<R, F>
    abstract fun <R> mapFailure(func: (F) -> R) : Result<S, R>
    abstract fun get() : S?
    data class Error<out S, out F>(val msg : String) : Result<S,F>() {
        override fun <R> map(func: (S) -> R): Result<R, F> {
            TODO("Not yet implemented")
        }

        override fun <R> mapFailure(func: (F) -> R): Result<S, R> {
            TODO("Not yet implemented")
        }

        override fun get(): S? {
            TODO("Not yet implemented")
        }
    }
}

fun main() {
    var a: String? = "a"
    var b : String? = "b"

    b = null

    val previewUrl = a ?: b
    println(previewUrl)







}

