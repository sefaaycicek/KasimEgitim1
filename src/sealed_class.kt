sealed class Shape {
    data class Circle(var radius : Float) : Shape()
    class Square(var side : Int) : Shape()
    object NotAShape : Shape()
}

sealed class ApiResult {
    data class Success(var response : String) : ApiResult()
    data class Failure(var errorCode : Int, var errorMessage : String) : ApiResult()
}

fun main() {
    var result = ApiResult.Failure(errorCode = 401, "")
    checkResult(result)
}

fun checkResult(result : ApiResult) {
    when(result) {
        is ApiResult.Success -> {
            println(result.response)
        }
        is ApiResult.Failure -> {
            println(result.errorMessage)
        }
        else -> {}
    }
}