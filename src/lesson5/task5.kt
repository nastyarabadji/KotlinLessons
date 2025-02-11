package lesson5

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    var temp: T
    temp = this.get(index1)
    this[index1] = this.get(index2)
    this[index2] = temp
}

fun main() {

}