package sealed_class

data class Failure<out S, out F>(val failure: F) : Result<S, F>() {
    override fun <R> map(func: (S) -> R) : Result<R, F> = Failure(failure)
    override fun <R> mapFailure(func: (F) -> R): Result<S, R> = Failure(func(failure))
    override fun get(): S? = null
}
