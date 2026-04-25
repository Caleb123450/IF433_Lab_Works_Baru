package oop_00000106640_ChrissanderAllenGunawan.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000
    val discount = calculateDiscount(price)
    val finalPrice = price - discount
    val userNote: String? = null

    printReceipt(title = gameTitle, originalPrice = price, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, originalPrice: Int, finalPrice: Int, note: String?) {
    println("=== STRUK PEMBELIAN ===")
    println("Game: $title")
    println("Harga Asli: Rp $originalPrice")
    println("Harga Akhir: Rp $finalPrice")
    println("Catatan: ${note ?: "Tidak ada catatan"}")
}