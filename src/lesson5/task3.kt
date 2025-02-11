package lesson5

fun Int.pow(n: Int): Int {
    //return when(n) {
    //    0 -> 1
    //    1 -> this
    //    else -> this * this.pow(n - 1)
    //}
    return Math.pow(this.toDouble(), n.toDouble()).toInt()
}

fun main() {
    print(5.pow(2))
}
