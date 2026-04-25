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

    println("\n--- Testing Employee Hierarchy ---")

    val manager = Manager(name = "Budi", baseSalary = 10000000)
    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    val developer = Developer(name = "Ani", baseSalary = 8000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")
}