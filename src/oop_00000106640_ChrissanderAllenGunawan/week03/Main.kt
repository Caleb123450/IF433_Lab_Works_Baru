package oop_00000106640_ChrissanderAllenGunawan.week03

fun main() {
    val e = Employee("Budi")

    // 1. Test Validasi Salary
    e.salary = -1000 // Harusnya print Error
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    // 2. Test Encapsulation
    e.increasePerformance()
    // e.performanceRating = 5 // Coba uncomment, pasti Merah (Error)

    // 3. Test Computed Property
    println("Pajak yang harus dibayar: ${e.tax}")

    println("\n=== TEST WEAPON ===")
    val sword = Weapon("Excalibur")

    // Test damage negatif (harus gagal)
    sword.damage = -50
    println("Damage setelah set -50: ${sword.damage}") // Harusnya tetap 0

    // Test damage overpowered (harus dipaksa jadi 1000)
    sword.damage = 9999
    println("Damage setelah set 9999: ${sword.damage}") // Harusnya jadi 1000

    // Test tier
    println("Tier: ${sword.tier}") // Harusnya "Legendary"

    println("\n=== TEST PLAYER ===")
    val player = Player("ProGamer123")

    // Coba akses player.xp (harus error - uncomment untuk test)
    // println(player.xp) // Error: Cannot access 'xp': it is private

    println("Level awal: ${player.level}") // Level 1

    // Tambah 50 XP (masih level 1)
    player.addXp(50)
    println("Level setelah +50 XP: ${player.level}") // Masih Level 1

    // Tambah 60 XP (total 110, harus Level Up ke 2)
    player.addXp(60)
    println("Level setelah +60 XP: ${player.level}") // Level 2

    // Test XP negatif
    player.addXp(-10) // Harus error
}
