package lesson5

class Invoker {
    fun invoke(f: () -> Int): Int {
        return f()
    }
}

fun main() {

}