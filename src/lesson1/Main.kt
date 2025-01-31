package lesson1

fun mean(x: Double, y: Double): Double {
    return (x + y) / 2
}

fun subtract(minuend: Int, subtrahend: Int): Int {
    return minuend - subtrahend
}

fun geometricMean(x: Double, y: Double): Double {
    return Math.sqrt(x * y)
}

fun multiplyByTwo(value: Int): Int {
    return 2 * value
}

fun toKelvin(celsius: Double): Double {
    return celsius + 273.15
}

fun arithmeticProgressionSum(first: Double, difference: Double, numberOfElements: Int): Double {
    return (2 * first + difference * (numberOfElements - 1)) / 2 * numberOfElements
}

fun geometricProgressionSum(first: Double, ratio: Double): Double {
    return first / (1 - ratio)
}

fun module(x: Double): Double {
    return Math.abs(x)
}

fun reminder(dividend: Int, divisor: Int): Int {
    return dividend % divisor
}

fun speed(distance: Double, time: Double): Double {
    return distance / time
}

fun main() {
    // println(mean(2.3, 3.4))
    // println(subtract(4, 1))
}