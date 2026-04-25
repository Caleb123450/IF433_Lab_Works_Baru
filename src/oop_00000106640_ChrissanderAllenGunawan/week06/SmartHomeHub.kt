package oop_00000106640_ChrissanderAllenGunawan.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("[Hub] Device ${device.name} ditambahkan ke sistem")
    }

    fun turnOffAllSwitches() {
        println("\n[Hub] Mematikan semua perangkat yang bisa dimatikan...")
        for (device in devices) {
            // Smart Casting dengan is
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }
}