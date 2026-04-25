package oop_00000106640_ChrissanderAllenGunawan.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()  // Instansiasi lewat Factory
    client.connect()
}