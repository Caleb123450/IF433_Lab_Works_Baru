package oop_00000106640_ChrissanderAllenGunawan.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 8.3, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -12.1, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 25, 22.0, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 3.7, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 10, -1.5, "OPEN")
    )

    // Filter CLOSED trades only
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    // Filter Winning trades (roe > 0)
    val winningTrades = closedTrades.filter { it.roe > 0 }
    // filter Losing trades (roe <= 0)
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    // Variabel Top performers — sorted descending, mapped to String
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Variabel Worst performers — sorted ascending (paling minus duluan), mapped to String
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // Pipeline Tambahan Unique trading pairs
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n-- TOP PERFORMERS --")
    topPerformersString.forEach { println(it) }

    println("\n-- WORST PERFORMERS --")
    worstPerformersString.forEach { println(it) }

    println("\n-- UNIQUE TRADING PAIRS --")
    println(uniquePairs)
}