package lesson5

fun <T: Comparable<T>> sort(list: MutableList<T>) {
    var temp: T
    for (i in 0 until  list.size) {
        for (j in i + 1 until list.size) {
            if (list[i] > list[j]) {
                temp = list[i]
                list[i] = list[j]
                list[j] = temp
            }
        }
    }
}

fun main() {

}