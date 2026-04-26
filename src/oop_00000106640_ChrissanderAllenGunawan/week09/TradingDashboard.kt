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
}