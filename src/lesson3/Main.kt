package lesson3

import kotlin.math.sin

enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

fun getMonth(x: Int): Month {
    return when(x) {
        1 -> Month.JANUARY
        2 -> Month.FEBRUARY
        3 -> Month.MARCH
        4 -> Month.APRIL
        5 -> Month.MAY
        6 -> Month.JUNE
        7 -> Month.JULY
        8 -> Month.AUGUST
        9 -> Month.SEPTEMBER
        10 -> Month.OCTOBER
        11 -> Month.NOVEMBER
        12 -> Month.DECEMBER
        else -> Month.JANUARY
    }
}

fun isPowerOfTwo(x: Int): Boolean {
    val result: Boolean = if (x.toString(2).count{ it == '1' } == 1) true else false
    return result
}

fun isPowerOfTwoBit(x: Int): Boolean {
    return (x and (x - 1)) == 0
}

fun reverse(x: Int): Int {
    return x.toString().reversed().toInt()
}

fun toExponential(number: Double, decimalPlaces: Int): String {
    var buffNumber: Double = number
    var count: Int = 0
    if (buffNumber >= 10.0) {
        while (buffNumber > 10.0) {
            buffNumber /= 10.0
            count++
        }
    }
    else if (buffNumber < 1.0) {
        while(buffNumber < 1.0) {
            buffNumber *= 10
            count--
        }
    }
    val strCount: String = if (count < 10) "0${Math.abs(count)}" else "${Math.abs(count)}"
    var buffNumberStr: String
    if (decimalPlaces > 0) {
        if ((buffNumber.toString().indexOf(".") + decimalPlaces + 1) <= buffNumber.toString().length - 1) {
            buffNumberStr = buffNumber.toString().substring(0, (buffNumber.toString().indexOf(".") + decimalPlaces + 1))
        }
        else {
            buffNumberStr = (buffNumber.toString() + "0".repeat(buffNumber.toString().indexOf(".") + decimalPlaces - buffNumber.toString().length + 1))
        }
    }
    else {
        buffNumberStr = buffNumber.toString().substring(0, buffNumber.toString().indexOf("."))
    }
    return "${buffNumberStr}e${if(count < 0) "-" else "+"}$strCount"
}

fun toTriple(n: Int): Int {
    var strResult: String = ""
    var buffN = n
    while (buffN > 0) {
        strResult = (buffN % 3).toString() + strResult
        buffN /= 3
    }
    return strResult.toInt()
}

fun compare(x: Double, y: Double): String {
    val epsilon = 1e-6
    if ((x - y) < 0) {
        return "второе число больше"
    }
    else if ((x - y) > 0) {
        return "первое число больше"
    }
    else if (Math.abs(x - y) < epsilon) {
        return "равны"
    }
    else {
        return ""
    }
}

fun max(x: Int, y: Int, z: Int): Int {
    val sinX: Double = Math.sin((x % 6).toDouble())
    val sinY: Double = Math.sin((y % 6).toDouble())
    val sinZ: Double = Math.sin((z % 6).toDouble())
    if (sinX > sinY && sinX > sinZ) {
        return x
    }
    else if (sinY > sinX && sinY > sinZ) {
        return y
    }
    else {
        return z
    }
}

fun reverseDouble(x: Double): Double {
    var finallX = (Math.round(x * 100)).toDouble() / 100
    val strX = finallX.toString().reversed()
    return strX.toDouble()
}

fun toDecimal(binary: String): Int {
    val reverseStr: String = binary.reversed()
    var result: Int = 0
    for (i in reverseStr.indices) {
        if (reverseStr[i] == '1') {
            result += Math.pow(2.0, i.toDouble()).toInt()
        }
    }
    return result
}

fun toInt(string: String): Int {
    return string.toInt()
}

fun main() {
    println(reverseDouble(16.0333))
}