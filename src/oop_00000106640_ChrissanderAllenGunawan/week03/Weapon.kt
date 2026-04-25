package oop_00000106640_ChrissanderAllenGunawan.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("WARNING: Damage tidak boleh negatif! Nilai tidak diubah.")
                    // field tetap yang lama (tidak diubah)
                }
                value > 1000 -> {
                    println("WARNING: Damage terlalu tinggi! Dipaksa menjadi 1000.")
                    field = 1000
                }
                else -> {
                    field = value
                }
            }
        }

    // Computed Property - Tier berdasarkan damage
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}