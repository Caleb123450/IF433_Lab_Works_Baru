package oop_00000106640_ChrissanderAllenGunawan.week06

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Speaker menyala, siap menerima perintah suara")
    }

    override fun turnOff() {
        println("[$name] Speaker dimatikan")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}