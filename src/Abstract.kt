abstract class GlobalPerson {
    abstract var name : String
    abstract fun eat()

    open fun getHeight() {

    }

    fun gotoSchool() {

    }
}

class MyPerson() : GlobalPerson() {
    override var name: String = ""
    override fun eat() {
    }

    override fun getHeight() {
        super.getHeight()
    }
}