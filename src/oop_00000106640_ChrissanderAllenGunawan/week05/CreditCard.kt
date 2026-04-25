package oop_00000106640_ChrissanderAllenGunawan.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("[$accountName - Credit Card] Pembayaran Rp $amount BERHASIL. Terpakai: Rp $usedAmount / Limit: Rp $limit")
        } else {
            println("[$accountName - Credit Card] Pembayaran Rp $amount DITOLAK. Melebihi limit! (Terpakai: Rp $usedAmount / Limit: Rp $limit)")
        }
    }
}