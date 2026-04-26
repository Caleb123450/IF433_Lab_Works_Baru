package oop_00000106640_ChrissanderAllenGunawan.week09

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)