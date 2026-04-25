package oop_00000106640_ChrissanderAllenGunawan.week08

fun main() {
    println("=== E-COMMERCE API PARSER ===\n")

    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),  // Corrupted
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),  // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")  // Unknown type
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            // Jika sukses dan tidak null, lakukan checkout
            product?.let {
                println("[PARSED] Product: $it")
                parser.checkout(it)
            } ?: run {
                println("[WARNING] Unknown product type, skipped: ${raw["name"]}")
            }

        } catch (e: IllegalArgumentException) {
            println("[ERROR] Corrupt data: ${e.message} | Raw: $raw")
        }

        println()
    }
}

//Test Full Pipeline berhasil