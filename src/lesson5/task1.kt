package lesson5

class Triplet<T>(val x1: T, val x2: T, val x3: T) {
    operator fun get(index: Int): T {
        return when(index) {
            0 -> x1
            1 -> x2
            2 -> x3
            else -> throw IndexOutOfBoundsException()
        }
    }
    fun changePosition(): Triplet<T> {
        return Triplet(x3, x1, x2)
    }
}

fun main() {
    val elements: Triplet<Int> = Triplet<Int>(1, 2, 3).changePosition()
    println(elements[0])
}