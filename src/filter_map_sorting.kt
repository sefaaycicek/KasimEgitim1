fun main() {
    val myNumbers : List<Int> = listOf(2,3,4,1,2,4,5,78,3,46,231,2)
    // filter, map, sort

    val smallNumbers = myNumbers.filter { it < 10 }
    println(smallNumbers)

    val squaredNumber = myNumbers.map { it * it }
    val newList : List<String> = myNumbers.map { it.toString() }


    var people = listOf<User>(
        User(name = "Ali", surname = "eli"),
        User(name = "ssAli", surname = "cceli"),
        User(name = "snAli", surname = "tteli")
    )
    val names = people
        .filter { it.name.startsWith("s") }
        .sortedBy { it.name }
        .map { "${it.name} ${it.surname}" }

    println(names)
}