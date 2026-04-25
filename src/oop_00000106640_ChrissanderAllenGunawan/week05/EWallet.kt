package oop_00000106640_ChrissanderAllenGunawan.week05

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("[$accountName - E-Wallet] Pembayaran Rp $amount BERHASIL. Sisa saldo: Rp $balance")
        } else {
            println("[$accountName - E-Wallet] Pembayaran Rp $amount GAGAL. Saldo tidak cukup (Saldo: Rp $balance)")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
        println("[$accountName - E-Wallet] Top up Rp $amount berhasil. Saldo sekarang: Rp $balance")
    }
}