

fun main() {
    val calculator = Calculator()
    calculator.addTwoNumbers(10, 20, result = { sonuc ->
        print(sonuc)
    })

    calculator.addTwoNumbers(10, 30, object : MyInterface {
        override fun execute(sum: Int) {

        }
    })
}

class Impl : MyInterface {
    fun method() {
        val calculator = Calculator()
        calculator.addTwoNumbers(10, 20, this)

        calculator.customCalculate(10, 20, action = { item1, item2 -> item1 * item2 })
        calculator.customCalculate(10, 20, action = { item1, item2 -> item1 + item2 })
    }

    override fun execute(sum: Int) {

    }
}

class Calculator {
    fun addTwoNumbers(a : Int, b : Int, result : (Int) -> Unit) {
        result(a + b)
    }

    fun addTwoNumbers(a : Int, b : Int, action : MyInterface) {
        action.execute(a + b)
    }

    fun customCalculate(a : Int, b : Int, action : (Int, Int) -> Int) {
        val result = action(a, b)
        println(result)
    }
}

interface MyInterface {
    fun execute(sum : Int)
}