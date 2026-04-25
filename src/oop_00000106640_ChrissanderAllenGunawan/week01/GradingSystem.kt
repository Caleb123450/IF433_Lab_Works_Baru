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
    val status = calculateStatus(score)
    val comment: String? = null
    val finalComment = comment ?: "Tidak ada komentar"

    println("Student: $studentName, Score: $score, Grade: $grade, Status: $status")
    println("Comment: $finalComment")
}

fun calculateStatus(score: Int) = if (score >= 60) "Lulus" else "Tidak Lulus"