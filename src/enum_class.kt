
interface ICardCashBack {
    fun getCashbackValue() : Float
}

enum class CreditCardType(val color : String, var maxLimit : Int = 100000) : ICardCashBack {

    SILVER("gray", 5000) {
        override fun getCashbackValue(): Float = 0.02f

    },
    GOLD("yellow", 100000) {
        override fun getCashbackValue(): Float = 0.04f
    },
    PLATINUM("black") {
        override fun getCashbackValue(): Float = 0.06f
    }

}

enum class CreditCardType2 {
    SILVER,
    GOLD,
    PLATINUM
}

fun main() {
    val cardType : CreditCardType  =  CreditCardType.SILVER
    val silverCashBack =  CreditCardType.SILVER.getCashbackValue()
    //switch case karşılığı -> when

    when(cardType) {
        CreditCardType.SILVER -> {}
        CreditCardType.GOLD -> {}
        CreditCardType.PLATINUM -> {}
    }
}