package org.example.lesson2

fun main() {

    val startHour = 9
    val startMinute = 39
    val minutesOnWay = 457
    val hoursOnWay = minutesOnWay/ MINUTES_IN_HOUR   //Сколько полных часов в пути (7)
    val minutesAtLast = minutesOnWay - MINUTES_IN_HOUR * hoursOnWay //Сколько в остатке минут (37)
    val minutesOutHour = startMinute + minutesAtLast // Сколько минут в сумме исходных и в пути (76)
    val arriveMinute = minutesOutHour - MINUTES_IN_HOUR //Сколько минут в остатке при превышении часа (16)
    val hourInOutOfHour = minutesOutHour / MINUTES_IN_HOUR //Сколько часов в остатке из минут (1)
    val arriveHour = startHour + hoursOnWay + hourInOutOfHour
    println("Время прибытия: $arriveHour:$arriveMinute")

}

const val MINUTES_IN_HOUR = 60