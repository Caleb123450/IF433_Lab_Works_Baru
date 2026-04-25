package oop_00000106640_ChrissanderAllenGunawan.week05

abstract class Pegawai(val nama: String) {
    // Abstract function tidak memiliki body (tanpa kurung kurawal)
    // WAJIB di-override oleh semua class anak
    abstract fun bekerja()
}