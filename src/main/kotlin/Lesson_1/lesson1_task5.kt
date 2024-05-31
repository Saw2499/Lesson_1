package org.example.Lesson_1

fun main() {
    val secondsOnSpace: Int = 6480
    val secondsInHour: Int = 3600
    val secondsInMinutes: Int = 60
    val minutesOnSpace: Int = (secondsOnSpace % secondsInHour) / secondsInMinutes
    val hoursOnSpace: Int = secondsOnSpace / secondsInHour
    val lastSeconds: Int = secondsOnSpace % secondsInMinutes
    println("0$hoursOnSpace:$minutesOnSpace:0$lastSeconds")
}