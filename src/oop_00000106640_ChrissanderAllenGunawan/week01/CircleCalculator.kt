package oop_00000106640_ChrissanderAllenGunawan.week01

fun main(args: Array<String>) {
    var radius = 7.0
    var pi = 3.14
    var area = pi * radius * radius

    println("Radius:  " + radius +", Area: " + area)
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a big Circle")
    } else {
        println("This is a smaller Circle")
    }
}