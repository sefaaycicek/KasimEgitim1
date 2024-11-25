fun main() {
    //var list = arrayListOf<String>()
    var mutableList = mutableListOf<String>() //MutableList<String>()
    var empty = emptyList<String>()

    // Hashmap key-value pair

    var myMap = hashMapOf<Int, String>(10 to "Aaa", 20 to "BBBB")   //HashMap<Int, String>()
    myMap[30] = "cccc"

    myMap.forEach {(key, value) ->
        println(value)
    }

    var mySet = mutableSetOf<Int>(2, 9, 9, 0, 0, 1) // unique values
    println(mySet)
    mySet.add(1)
    println(mySet)

}