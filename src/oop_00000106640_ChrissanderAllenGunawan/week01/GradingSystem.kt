package oop_00000106640_ChrissanderAllenGunawan.week01

fun main(args: Array<String>) {
    val studentName = "John"
    val score = 85

    val grade = when {
        score >= 85 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        else -> "D"
    }

    println("Student: $studentName, Score: $score, Grade: $grade")
}