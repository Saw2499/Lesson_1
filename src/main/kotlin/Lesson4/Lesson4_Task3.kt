package org.example.Lesson4

fun main() {
    val sunnyWeather = true
    val openAwning = true
    val humidity: Int = 20
    val season = "Winter"
    val conditions = sunnyWeather == true && openAwning == true && season != "Winter" && humidity == NORMAL_HUMIDITY

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}

const val NORMAL_HUMIDITY: Int = 20