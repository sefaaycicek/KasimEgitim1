fun main() {

}

open class Animal {
    open var color : String = ""
    open fun eat() {
        println("eat")
    }
}

open class Dog : Animal() {
    override fun eat() {
        println("eat")
    }
}

class MyDog : Dog() {
    override var color : String = ""

    override fun eat() {
        super.eat()
    }
}