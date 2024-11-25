fun main() {
    var person = Person()
    person.name = ""
    person.surname = ""
    ////////////////////////////////

    with(person) {
        name = ""
        surname = ""
    }
    person.display(10, "")

    ////////////////////////////////

    person.apply {
        name = ""
        surname = ""
    }.display(10, "")

    ////////////////////////////////

    val pi : Float by lazy {
        3.14f
    }

    print(pi * 4)

    val country = Country()
   // country.name = ""
    country.print()

}


class Country {
    lateinit var name : String

    fun print() {
        if(this::name.isInitialized) {
            println(name)
        }
    }
}