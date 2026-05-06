package Week11a

//function biasa
fun salam_pembuka(nama:String){
    if(nama == "Budi Gunawan"){
    println("Salam Kenal")
}else {
    println("Ih Kamu Siapa")
}
}

//function extension-basic
fun String.rubah_huruf_depan_jadi_besar():String{
  var hasil = this.split(" ").joinToString(" ") { it.replaceFirstChar {
      c -> c.uppercase();
  }
  }
    return "Hai " + hasil;
}

//function extension - parameters
fun Int.tentukanGrade(namaMhs:String){
    var hasilGrade = "E";
    if (this >= 80) {
        hasilGrade = "A"
    }else if (this >= 70) {
        hasilGrade = "B"
    }else{
        hasilGrade = "c"
    }
    println(namaMhs + "Grade Kamu " + hasilGrade);
}

//function extension - null
fun String?.cekNulldanEmpty(): String{
    if (this == null || this.isEmpty()) {
        return "Username ga boleh null atau empty";
    }else {
        return "Username kamu $this";
    }
}

fun main(){
    var namaSaya = "Budi Gunawan";
    println(namaSaya.uppercase());

    //cara panggil function extension
    println("udin sedunia".rubah_huruf_depan_jadi_besar());

    //cara panggil function extension - parameter
    71.tentukanGrade("nigajuicy");

    //cara panggil function extension - null
    var usernamKamu : String? = null;
    println(usernamKamu.cekNulldanEmpty());
}