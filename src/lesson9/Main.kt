package lesson9

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.flow.*
import kotlin.math.max

fun createFlow(n: Int): Flow<Int> = flow {
    for (element in 1 .. n) {
        emit(element)
    }
}

fun simulateCollatz(n: Int): Flow<Int> = flow {
    var buffN: Int = n
    while (buffN != 1) {
        if (buffN % 2 == 0) {
            buffN /= 2
            emit(buffN)
        }
        else {
            buffN = 3 * buffN + 1
            emit(buffN)
        }
    }
}

fun Flow<Int>.toCubesFlow(): Flow<Int> {
    return this.map { element -> element * element * element }
}

fun Flow<String>.toLengthFlow(): Flow<Int> {
    return this.map { element -> element.length }
}

fun toStrings(flow: Flow<Int>): Flow<String> {
    return flow.map { element -> element.toString() }
}

fun Flow<String>.concatenate(flow: Flow<String>): Flow<String> {
    return this.zip(flow) { a, b -> a + b }
}

fun maxFlow(flow1: Flow<Int>, flow2: Flow<Int>): Flow<Int> {
    return flow1.zip(flow2) { a, b -> Math.max(a, b) }
}

@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
fun CoroutineScope.produceRs(n: Int): ReceiveChannel<String> = produce {
    for (i in 2 .. n step 2) {
        send("R".repeat(i))
    }
}

@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
fun CoroutineScope.produceSquares(n: Int): ReceiveChannel<Int> = produce {
    for (i in 1 .. n) {
        send(i * i)
    }
}

suspend fun Flow<Int>.squaresSum(): Int {
    return this.fold(0) { acc, value -> acc + value * value}
}

fun main() {

}