package org.example.Lesson4

fun main() {
    val firstCargoHeight = 20
    val firstCargoVolume = 80
    val secondCargoHeight = 50
    val secondCargoVolume = 100
    val firstCargo =
        firstCargoHeight > MIN_AVERAGE_HEIGHT && firstCargoHeight <= 100 && firstCargoVolume < MAX_AVERAGE_VOLUME
    val secondCargo =
        secondCargoHeight > MIN_AVERAGE_HEIGHT && secondCargoHeight <= 100 && secondCargoVolume < MAX_AVERAGE_VOLUME

    println("Груз с весом $firstCargoHeight кг и объемом $firstCargoVolume л соответствует категории 'Average': $firstCargo")
    println("Груз с весом $secondCargoHeight кг и объемом $secondCargoVolume л соответствует категории 'Average': $secondCargo")


}

const val MIN_AVERAGE_HEIGHT = 35
const val MAX_AVERAGE_HEIGHT = 100
const val MAX_AVERAGE_VOLUME = 100