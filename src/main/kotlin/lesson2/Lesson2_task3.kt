package org.example.lesson2

fun main() {

    val startHour = 9
    val startMinute = 39
    val minutesOnWay = 457
    val hoursOnWay = minutesOnWay/ minutesInHour   //Сколько полных часов в пути
    val minutesAtLast = minutesOnWay - (minutesInHour * hoursOnWay) //Сколько минут в пути без учета полных часов
    val minutesOutHour = startMinute + minutesAtLast // Сколько минут в сумме исходных и в пути
    val minuteInOutOfHour = minutesOutHour - minutesInHour //Сколько минут в остатке при превышении часа
    val hourInOutOfHour = minutesOutHour / minutesInHour //Сколько часов в остатке из минут
    val arriveHour = startHour + hoursOnWay + hourInOutOfHour
    val arriveMinute = minutesAtLast + minuteInOutOfHour
    println("Время прибытия поезда: $arriveHour:$arriveMinute")

}

const val minutesInHour = 60