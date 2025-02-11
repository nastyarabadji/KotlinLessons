package lesson5

import kotlin.math.sin

class Triangle private constructor(val square: Double) {
    constructor(a: Double, b: Double, angle: Int): this((a * b * sin(toRadian(angle))) / 2) { // по двум сторонам и углу

    }
    constructor(a: Double, angle1: Int, angle2: Int): this(a * a * sin(toRadian(angle1)) * sin(toRadian(angle2)) / (2 * sin(
        toRadian(angle1 + angle2)))) {

    }
    companion object {
        const val PI = 3.14
        fun toRadian(angle: Int): Double {
            return (angle * PI) / 180
        }
    }
}

fun main() {
    var n = Triangle(3.0, 60, 60)
    println(n.square)
}
