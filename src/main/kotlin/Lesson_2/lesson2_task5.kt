package org.example.Lesson_2

import kotlin.math.pow

fun main() {
    val cash: Double = 70000.000
    val percent: Double = 16.700
    val years: Double = 20.000
    val partOfPercent: Double = percent / ALL_PERCENT
    val allPercents: Double = FORMULA_PART + partOfPercent
    val twentyYearPercent = allPercents.pow(years)
    val allCash = cash * twentyYearPercent

    println("%.3f".format(allCash))
}

const val FORMULA_PART = 1
const val ALL_PERCENT = 100