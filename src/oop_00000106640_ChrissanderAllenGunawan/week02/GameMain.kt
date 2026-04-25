package oop_00000106640_ChrissanderAllenGunawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Base Damage: ")
    val baseDamage = scanner.nextInt()

    // Buat objek Hero
    val hero = Hero(heroName, baseDamage)

    // Musuh (tidak perlu class, cukup variabel)
    var enemyHp = 100

    println("\nPertempuran Dimulai!")
    println("Hero: ${hero.name} (HP: ${hero.hp})")
    println("Enemy: Goblin (HP: $enemyHp)")

    // Game Loop
    while (hero.isAlive() && enemyHp > 0) {
        println("\n--- GILIRAN ANDA ---")
        println("HP Hero: ${hero.hp} | HP Enemy: $enemyHp")
        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")

        val choice = scanner.nextInt()

        when (choice) {
            1 -> {
                // Hero menyerang
                hero.attack("Goblin")
                enemyHp -= hero.baseDamage
                println("Goblin terkena ${hero.baseDamage} damage!")

                if (enemyHp > 0) {
                    println("Sisa HP Goblin: $enemyHp")

                    // Enemy membalas
                    val enemyDamage = (10..20).random()
                    println("\nGoblin menyerang balik dengan $enemyDamage damage!")
                    hero.takeDamage(enemyDamage)
                    println("Sisa HP ${hero.name}: ${hero.hp}")
                } else {
                    println("Goblin telah dikalahkan!")
                    enemyHp = 0
                }
            }
            2 -> {
                println("${hero.name} melarikan diri dari pertempuran!")
                break
            }
            else -> {
                println("Pilihan tidak valid!")
            }
        }
    }

    // Umumkan Pemenang
    println("\n=== HASIL PERTEMPURAN ===")
    if (hero.isAlive() && enemyHp <= 0) {
        println("KEMENANGAN! ${hero.name} menang dengan sisa HP ${hero.hp}!")
    } else if (!hero.isAlive()) {
        println("KEKALAHAN! ${hero.name} telah gugur...")
    } else {
        println("Pertempuran dibatalkan.")
    }
}