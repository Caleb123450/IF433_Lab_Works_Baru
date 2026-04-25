package oop_00000106640_ChrissanderAllenGunawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== SISTEM PERPUSTAKAAN ===")

    print("Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    // Validasi: Tidak boleh minus
    if (loanDuration < 0) {
        println("WARNING: Durasi tidak valid! Diubah menjadi 1 hari.")
        loanDuration = 1
    }

    // Buat objek Loan
    val loan = Loan(bookTitle, borrower, loanDuration)

    // Tampilkan detail
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")
}