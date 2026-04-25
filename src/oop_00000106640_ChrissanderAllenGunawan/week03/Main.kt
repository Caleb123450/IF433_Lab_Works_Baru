package oop_00000106640_ChrissanderAllenGunawan.week03

fun main() {
    val e = Employee("Budi")
    println("--- Test Error ---")
    e.salary = 5000 // Ini akan meledakkan program Anda
}