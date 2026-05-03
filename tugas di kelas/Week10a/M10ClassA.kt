package Week10a

//Non-Generic Programming
class meja(val hasil:Any)

//Generic Programming
class kursi<T>(val hasil:T)

//Generic Programming
class Televisi<T, V>(val merk:T, val kodeBarcode:V)

//Generic - Function
fun <T> Alamat(kodepos:T):T {
    return kodepos;
}

//generic - Constraint
class Kalkulator<T: Number> (val a:T, val b:T){
    fun tambah() :Int {
        return a.toInt() + b.toInt();
    }
    fun kurang() : Double {
        return a.toDouble() - b.toDouble();
    }
}


fun main() {
    println("========== Generic - Kalkulator ==========");
    val kal = Kalkulator(10.5,20.43 );
    println("Hasil penambahan ${kal.a} ditambah ${kal.b} : " + kal.tambah());
    println("Hasil Pengurangan ${kal.a} dikurang ${kal.b} : " + kal.kurang());


    println("========== implementasi Non-Generic ==========");
    val mj = meja(100)
    val hargameja = mj.hasil as Int
    println(hargameja + 50)

    println("========== implementasi Generic ==========");
    val chair = kursi(300);
    println(chair.hasil + 50);

    println("========== Generic Multi Param ==========");
    val tv = Televisi( "samsung", "88477");
    println("Merknya " + tv.merk);
    println("Barcode ${tv.kodeBarcode + 777}");

    println("========== Generic Function ==========");
    println("Kode pos kamu" + Alamat(kodepos = 1234567))
}