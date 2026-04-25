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
}