package lesson6

fun main() {
    val message: () -> Unit
    message = ::hello
    message()

    val value: (Int, Int) -> Int = ::sum
    println(value(1, 2))

    printMessage(::goodBy)
    printMessage(::hello)

    mathFunctions(::sum, 2, 1)
    mathFunctions(::subtract, 2, 1)

    var select: (Int, Int) -> Int = selectFun(1)
    println(select(2, 1))

    var sum1 = fun(x1: Int, x2: Int) = x1 + x2
    mathFunctions(fun(x: Int, y: Int): Int = x + y, 1, 5)

    var f1 = selectFunNotOpr(1)
    println(f1(1, 2))
    var f2: (Int, Int) -> Int = {x, y -> x + y}
    println(f2(1, 2))
}

fun printMessage(f: () -> Unit) {
    f()
}

fun hello() {
    println("Hello, world!")
}

fun goodBy() {
    println("Good by!")
}

fun mathFunctions(f: (Int, Int) -> Int, x1: Int, x2: Int) {
    val result = f(x1, x2)
    println(result)
}

fun selectFun(select: Int): (Int, Int) -> Int {
    when(select) {
        1 -> return ::sum
        2 -> return ::subtract
        else -> return {a, b -> 0}
    }
}

fun sum(x1: Int, x2: Int): Int {
    return x1 + x2
}

fun subtract(x1: Int, x2: Int): Int {
    return x1 - x2
}

fun selectFunNotOpr(select: Int): (Int, Int) -> Int {
    when(select) {
        1 -> return fun(x: Int, y: Int): Int = x + y
        2 -> return fun(x: Int, y: Int): Int = x - y
        else -> return fun(x: Int, y: Int): Int = 0
    }
}