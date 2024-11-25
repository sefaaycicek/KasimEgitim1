fun main() {
    var r1 = 1..5 // 1..5  -> 1,2,3,4,5
    val r2 = 5 downTo 1 // 5 downTo 1
    val r3 = 5 downTo 1 step 2
    val r4 = 4.downTo(2)

    for (i in 1..10) {
        print("")
    }

    for(i in 10 downTo  0) {
        print("")
    }


    // Array
    var myArray = Array<Int>(5) { 0 }
    myArray[1] = 20

    for(element in myArray) {
        print(element)
    }

    myArray.forEach { deger ->
        print(deger)
    }

    // ArrayList
    var list = ArrayList<Any>()
    list.add("Ali")
    list.add("Veli")
    list.add(10)
    list.add(true)
    list.add(User(name = "Ali", surname = "Veli"))

    list.forEach { item ->

        (item as? Person)?.let {

        } ?: run {

        }

        if(item is Person) {
            val person = item as Person
            print(item.name)
        }
    }


    // ? !! Optional
    var sayi : Int? = 10 // optional
    //sayi = null

    var sayi2 : Int = sayi ?: 10
    var sayi3 : Int = sayi!! // force cast to Int

    sayi?.let {
        it
    }

    if(sayi != null) {

    }


}