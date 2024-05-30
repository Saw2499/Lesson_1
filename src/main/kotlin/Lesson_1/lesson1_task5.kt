package org.example.Lesson_1

fun main() {
    val secondsOnSpace: Int = 6480
    val minutesOnSpace: Int = (secondsOnSpace % 3600) / 60
    val hoursOnSpace: Int = secondsOnSpace / 3600
    val lastSeconds: Int = secondsOnSpace % 60
    println("0$hoursOnSpace:$minutesOnSpace:0$lastSeconds")
}