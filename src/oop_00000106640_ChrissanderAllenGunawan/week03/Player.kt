package oop_00000106640_ChrissanderAllenGunawan.week03

class Player(val username: String) {
    private var xp: Int = 0  // Private - tidak bisa diakses dari luar

    // Computed Property - level dihitung dari XP
    val level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if (amount <= 0) {
            println("ERROR: XP yang ditambahkan harus positif!")
            return
        }

        val oldLevel = level
        xp += amount
        val newLevel = level

        if (newLevel > oldLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }
}