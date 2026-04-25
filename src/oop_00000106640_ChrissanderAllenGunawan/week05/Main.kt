package oop_00000106640_ChrissanderAllenGunawan.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // pegawai.mengajar() // INI AKAN ERROR karena tipe referensinya adalah Pegawai

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }
    println("\n=== TEST METHOD OVERLOADING ===")
    val math = MathHelper()

    // Memanggil hitungLuas(sisi: Int)
    val luasPersegi = math.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    // Memanggil hitungLuas(panjang: Int, lebar: Int)
    val luasPersegiPanjang = math.hitungLuas(10, 4)
    println("Luas Persegi Panjang (10 x 4): $luasPersegiPanjang")

    // Memanggil hitungLuas(jariJari: Double)
    val luasLingkaran = math.hitungLuas(7.0)
    println("Luas Lingkaran (r=7.0): $luasLingkaran")

    println("\n=== SISTEM PEMBAYARAN ===")

    val ewallet = EWallet(accountName = "John Doe", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Jane Smith", limit = 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(ewallet, creditCard)

    println("--- Percobaan Pembayaran Rp 75.000 ---")
    for (payment in paymentMethods) {
        payment.processPayment(75000.0)

        // === TAMBAHKAN SMART CASTING DI BAWAH INI ===
        // Smart Casting Challenge: Deteksi EWallet dan top up otomatis
        if (payment is EWallet) {
            println("=> Terdeteksi sebagai E-Wallet. Melakukan top up otomatis...")
            payment.topUp(50000.0)
            println("=> Mencoba pembayaran ulang setelah top up:")
            payment.processPayment(75000.0)
        }

        println("-------------------------")
    }
}