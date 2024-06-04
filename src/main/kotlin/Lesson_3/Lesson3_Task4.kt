package org.example.Lesson_3

fun main() {
    var firstPosition = 2
    var numberOfSteps = 2
    var secondPosition = firstPosition + numberOfSteps
    var moveNumber = 1

    println("Номер хода:$moveNumber, ход E$firstPosition:E$secondPosition")

    moveNumber = 2
    firstPosition = 2
    numberOfSteps = 1
    secondPosition = firstPosition + numberOfSteps

    println("Номер хода:$moveNumber, ход D$firstPosition:D$secondPosition")

}