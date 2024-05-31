package org.example.Lesson_1

fun main() {
    val secondsOnSpace: Int = 6480
    val secondsInHour: Int = 3600
    val secondsInMinute: Int = 60
    val minutesOnSpace: Int = (secondsOnSpace % secondsInHour) / secondsInMinute
    val hoursOnSpace: Int = secondsOnSpace / secondsInHour
    val lastSeconds: Int = secondsOnSpace % secondsInMinute
    println("0$hoursOnSpace:$minutesOnSpace:0$lastSeconds")
}