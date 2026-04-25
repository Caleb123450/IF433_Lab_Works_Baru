package oop_00000106640_ChrissanderAllenGunawan.week04

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Bonus standar dari Parent + tambahan 500.000
        return super.calculateBonus() + 500000
    }
}