package src.all_about_classes.sealed_class

data class Success<out S, out F>(val success: S) : Result<S, F>() {
    override fun <R> map(func: (S) -> R) : Result<R, F> = Success(func(success))
    override fun <R> mapFailure(func: (F) -> R): Result<S, R> = Success(success)
    override fun get(): S? = success
}