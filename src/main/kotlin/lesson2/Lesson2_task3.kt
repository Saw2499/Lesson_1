package org.example.lesson2

fun main() {

    val startHour = 9
    val startMinute = 39
    val minutesOnWay = 457
    val hoursOnWay = minutesOnWay/ minutesInHour   //Сколько полных часов в пути (7)
    val minutesAtLast = minutesOnWay - minutesInHour * hoursOnWay //Сколько в остатке минут (37)
    val minutesOutHour = startMinute + minutesAtLast // Сколько минут в сумме исходных и в пути (76)
    val arriveMinute = minutesOutHour - minutesInHour //Сколько минут в остатке при превышении часа (16)
    val hourInOutOfHour = minutesOutHour / minutesInHour //Сколько часов в остатке из минут (1)
    val arriveHour = startHour + hoursOnWay + hourInOutOfHour
    println("Время прибытия поезда: $arriveHour:$arriveMinute")

}

const val minutesInHour = 60