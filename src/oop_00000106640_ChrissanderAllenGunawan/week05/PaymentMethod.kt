package oop_00000106640_ChrissanderAllenGunawan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}