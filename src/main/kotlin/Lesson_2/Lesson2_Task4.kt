package org.example.Lesson_2

import kotlin.math.roundToInt

fun main() {
    val crystalOreMined: Float = 7f
    val ironOreMined: Float = 11f
    val onePercentCrystal: Float = crystalOreMined / MAXIMUM_PERCENT
    val onePercentIron: Float = ironOreMined / MAXIMUM_PERCENT
    val bonusCrystalOreMined = (onePercentCrystal * BUFF_PERCENT).toInt()
    val bonusIronOreMined = (onePercentIron * BUFF_PERCENT).toInt()

    println("Бонус кристаллической руды: $bonusCrystalOreMined")
    println("Бонус железной руды: $bonusIronOreMined")
}
const val BUFF_PERCENT = 20
const val MAXIMUM_PERCENT = 100