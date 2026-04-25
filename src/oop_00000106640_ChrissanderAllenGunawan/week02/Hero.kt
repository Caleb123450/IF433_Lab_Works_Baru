package oop_00000106640_ChrissanderAllenGunawan.week02

class Hero(
    val name: String,
    val baseDamage: Int,
    var hp: Int = 100  // Default Argument
) {
    fun attack(targetName: String) {
        println("$name menebas $targetName!")
    }

    fun takeDamage(damage: Int) {
        hp -= damage
        // Pastikan HP tidak minus
        if (hp < 0) {
            hp = 0
        }
    }

    fun isAlive(): Boolean {
        return hp > 0
    }
}