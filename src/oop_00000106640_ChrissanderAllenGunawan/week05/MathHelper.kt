package oop_00000106640_ChrissanderAllenGunawan.week05

class MathHelper {
    //1: Luas Persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    //2: Luas Persegi Panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    //3: Luas Lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}