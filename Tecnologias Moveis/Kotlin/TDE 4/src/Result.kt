sealed class Result {
    class Success(val message: String) : Result()
    class Error(val message: String, val code: Int) : Result()
    class Loading(val progress: Int) : Result()
}