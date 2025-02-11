package lesson5

typealias Predicate<T> = (T) -> Boolean

class Invoker1<T>(val func: Predicate<T>) {
    operator fun invoke(arg: T): Boolean {
        return func(arg)
    }
}

fun main() {
    val isEven: Predicate<Int> = { it % 2 == 0 }
    val invoker: Invoker1<Int> = Invoker1<Int>(isEven)
    println(invoker(3))
}