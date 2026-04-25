package oop_00000106640_ChrissanderAllenGunawan.week08

class ApiParser {

    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // Ekstrak ID dan Name (WAJIB ada, jika tidak throw exception)
        val id = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }

        val name = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name"
        }

        // Ekstrak type
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Safe cast warranty, jika gagal atau null gunakan default 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Safe cast size, jika gagal atau null gunakan "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null  // Unknown type
        }
    }

    fun checkout(product: Product) {
        val productId = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        // Panggil Java Payment Service
        val transactionId = JavaPaymentService.processPayment(productId)!!
        println("[CHECKOUT SUCCESS] Transaction ID: $transactionId")
    }
}
//implement payment processing with !!