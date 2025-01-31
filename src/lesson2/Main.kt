package lesson2

fun calculateSum(a: Int, b: Int): Int {
    var count: Int = 0
    for (i in a .. b) {
        if(i % 7 == 0) {
            count++
        }
    }
    return count
}

fun countMonthDays(month: Int): Int {
    when(month) {
        1, 3, 5, 7, 8, 10, 12 -> return 31
        4, 6, 9, 11 -> return 30
        2 -> return 28
        else -> return 0
    }
}

fun factorial(value: Int): Int {
    var result: Int = 1
    for (i in 1 .. value) {
        result *= i
    }
    return result
}

fun fibonacci(value: Int): Int {
    var result: Int = 0
    var curr: Int = 0
    var pr: Int = 1
    repeat(value) {
        result = pr + curr
        pr = curr
        curr = result
    }
    return result
}

fun numberCount(value: Int): Int {
    var count: Int = 0
    var buff: Int = value
    while (buff / 10 != 0) {
        buff /= 10
        count++
    }
    return ++count
}

fun countSum(a: Int, b: Int): Int {
    var result: Int = 0
    for (i in a .. b) {
        result += (i * i)
    }
    return result
}

fun findMax(n: Int, m: Int): Int {
    var result: Int = 0
    for (i in 1 .. n) {
        if (i % m == 0) {
            result = i
        }
    }
    return result
}

fun findMaxSin(a: Int, b: Int): Int {
    var maxi: Int = 0
    var maxiResult: Double = -1000.0
    for (i in a .. b) {
        if(Math.sin(i.toDouble()) > maxiResult) {
            maxiResult = Math.sin(i.toDouble())
            maxi = i
        }
    }
    return maxi
}

fun gcd(n1: Int, n2: Int): Int {
    var maxiNod: Int = 0
    for(i in 1 .. (maxOf(n1, n2) / 2).toInt()) {
        if(n1 % i == 0 && n2 % i == 0) {
            if(maxiNod < i) {
                maxiNod = i
            }
        }
    }
    return maxiNod
}

fun isPrime(value: Int): Boolean {
    for (i in 2 .. (value / 2).toInt()) {
        if (value % i == 0) {
            return false
        }
    }
    return true
}

fun main() {
    println(findMax(0, 1))
}