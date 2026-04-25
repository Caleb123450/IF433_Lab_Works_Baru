package oop_00000106640_ChrissanderAllenGunawan.week04

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    // Override method dari Parent
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}