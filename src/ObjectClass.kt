class ObjectClass {
    fun method() {

    }

    companion object {
        var sayi = 10
        fun method2() {

        }
    }
}

fun main() {
    var obj = ObjectClass()
    obj.method() // instance

    ObjectClass.method2() // class method // static

    Constants.count
    Constants.method()
}

object Constants {
    var count : Int = -1

    fun method() {

    }
}