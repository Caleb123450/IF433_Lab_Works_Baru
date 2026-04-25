package oop_00000106640_ChrissanderAllenGunawan.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myTesla = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myTesla.accelerate()
    myTesla.honk()
    myTesla.openTrunk()
}