package org.example.Lesson_4

fun main () {
    val reservedTablesToday = ALL_TABLES
    val freeTablesTomorrow = 4
    val reservedTablesTomorrow = ALL_TABLES - freeTablesTomorrow

    println("Доступность столиков на сегодня: ${reservedTablesToday < ALL_TABLES}\nДоступность столиков на завтра: ${reservedTablesTomorrow < ALL_TABLES}" )
}
const val ALL_TABLES = 13