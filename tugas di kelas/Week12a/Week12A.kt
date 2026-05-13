package Week12a

fun basic_trycatch(pembilang: Int, penyebut: Int) {
    try {
        val hasil = pembilang / penyebut
        println("hasil bagi $hasil")
    } catch (e: Exception) {
        println("ada error pembagian ${e.message}")
    } finally {
        println("Selesai pembagian")
    }
}

fun cek_tipe_data(angka: String) {
    val nilai: Int = try {
        Integer.parseInt(angka)
    } catch (e: Exception) {
        println("ada error di cek tipe data ${e.message}")
        32323232 // Default value if error occurs
    }
    println("nilai kamu $nilai")
}

fun cek_gaji(harikerja: Int) {
    if (harikerja < 0) {
        throw IllegalArgumentException("Masa Hari kerja Minus")
    } else {
        val gaji = harikerja * 1000
       println("gaji kamu $gaji")
    }
}

//custom exception => Class
class cekSaldoBank(val saldoKamu:Int, val jajankamu:Int):
        Exception("Saldo Kamu $saldoKamu, jajankamu $jajankamu, gak cukup lah!!!");

class transaksi_pembelian(val saldoAwal:Int) {
    fun mulai_jajan(pengeluaranKamu:Int) {
        if(saldoAwal < pengeluaranKamu) {
            throw cekSaldoBank(saldoAwal, pengeluaranKamu);
        }else {
            val sisaSaldo = saldoAwal - pengeluaranKamu;
            println("Sisa Saldo $sisaSaldo");
        }
    }
}

fun main() {
    val trxBeli = transaksi_pembelian(1000);
    try {
        trxBeli.mulai_jajan(1300);
    } catch (e: Exception) {
        println("ada error di custom exception ::::: ${e.message}")
    }

    // 1. Testing Throw/Catch
    try {
        cek_gaji(-1)
    } catch (e: Exception) {
        println("Error coba catch :::: ${e.message}")
    }

    // 2. Testing Exception as Expression
    cek_tipe_data("abc")

    // 3. Testing Basic Exception
    basic_trycatch(10, 0)
}