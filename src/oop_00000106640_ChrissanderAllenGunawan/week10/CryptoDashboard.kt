package oop_00000106640_ChrissanderAllenGunawan.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 3.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    println("\n=== CRYPTO WALLET DASHBOARD ===")
    response.data.forEach { coin ->
        println("Koin: ${coin.name} | Balance: ${coin.balance}")

        val txRepo = WalletRepository<Transaction>()
        txRepo.add(Transaction("TX001", 250.0))
        txRepo.add(Transaction("TX002", -50.0))
        txRepo.add(Transaction("TX003", 1000.0))

        println("\n=== TRANSACTION HISTORY ===")
        txRepo.getAll().forEach { tx ->
            println("ID: ${tx.id} | Amount: ${tx.amount}")
        }
    }
}