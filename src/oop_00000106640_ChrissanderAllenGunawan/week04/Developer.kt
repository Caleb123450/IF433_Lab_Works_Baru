package oop_00000106640_ChrissanderAllenGunawan.week04

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() TIDAK di-override, jadi pakai bawaan Parent (10%)
}