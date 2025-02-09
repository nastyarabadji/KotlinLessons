package lesson4

import kotlin.math.round

object Calculator1 {
    object Constants {
        public const val PI: Double = 3.14
    }
    fun area(radius: Double): Double {
        return (Constants.PI * radius * radius * 100.0).toInt().toDouble() / 100.0
    }
}

fun main() {
}