package oop_00000106640_ChrissanderAllenGunawan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()