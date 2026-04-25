package oop_00000106640_ChrissanderAllenGunawan.week06

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] CCTV menyala")
        startRecord()  // Otomatis mulai rekam saat nyala
    }

    override fun turnOff() {
        stopRecord()
        println("[$name] CCTV dimatikan")
    }

    override fun startRecord() {
        println("[$name] Mulai merekam video 1080p ke Cloud...")
    }
}