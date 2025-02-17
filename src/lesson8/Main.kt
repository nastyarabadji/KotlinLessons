import kotlinx.coroutines.*

fun findMaxAndReturnCallback(list: List<Int>, callback: (Int) -> Int): Int {
    val result: Int = list.max()
    return callback(result)
}

fun printAndCallback(callback: () -> Unit) {
    println(1)
    callback()
}

suspend fun printNumbers(n: Int) {
    for (i in 1 .. n) {
        delay(1000L)
        println(i)
    }
}

suspend fun printNumbers1(n: Int) = coroutineScope {
    launch {
        for (i in 1 .. n step 2) {
            println(i)
            delay(500L)
        }
    }
    launch {
        for (i in 2 .. n step 2) {
            println(i)
            delay(1000L)
        }
    }
}

fun square(x: Int, callback: (Int) -> Unit) {
    callback(x * x)
}

suspend fun printByChar(str: String) {
    for (i in str) {
        println(i)
        delay(100L)
    }
}

suspend fun printHeight(initialHeight: Double) {
    if (initialHeight == 0.0) {
        delay(1000L)
        println(0.0)
        return
    }
    var time: Double = 0.0
    var height: Double = initialHeight - (9.81 * time * time) / 2
    while (height > 0.0) {
        delay(1000L)
        println(height)
        time += 1.0
        height = initialHeight - (9.81 * time * time) / 2
        if (height <= 0) {
            delay(1000L)
            println(0.0)
        }
    }
}

suspend fun printNumbersWithDelay(n: Int, delay: Long) {
    for (i in 1 .. n) {
        println(i)
        delay(delay)
    }
}

suspend fun printSquares(n: Int, delay: Long, timeLimit: Long) {
    var finallTime: Long = 0
    for (i in 1 .. n) {
        println(i * i)
        delay(delay)
        finallTime += delay
        if (finallTime > timeLimit) {
            break
        }
    }
}

suspend fun simulatePopulation(population: Int, birthRate: Double, deathRate: Double) {
    var presentPopulation: Double = population.toDouble()
    for (i in 1 .. 5) {
        println(presentPopulation)
        delay(1000L)
        presentPopulation = presentPopulation * birthRate - presentPopulation * deathRate + presentPopulation
    }
}

fun main() = runBlocking {
    simulatePopulation(1_000, 0.08, 0.05)
}

