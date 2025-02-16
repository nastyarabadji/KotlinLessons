package lesson6

fun interface IntGenerator {
    operator fun invoke(i: Int): Int
}

fun interface IntPredicate {
    operator fun invoke(i: Int): Boolean
}

fun interface IntPrinter {
    fun accept(x: Int)
}

fun interface Predicate<T> {
    operator fun invoke(i: T): Boolean
}

fun interface StringPredicate {
    operator fun invoke(x: String): Boolean
}

fun interface DoubleOperation {
    operator fun invoke(x: Double, y: Double): Double
}

fun interface IntOperation {
    operator fun invoke(x: Int, y: Int): Int
}

fun interface IntPairPredicate {
    operator fun invoke(x: Int, y: Int): Boolean
}

fun interface StringGenerator {
    operator fun invoke(x: String): String
}

fun interface StringPairPredicate {
    operator fun invoke(x: String, y: String): Boolean
}

fun main() {
    val f1 = object: IntGenerator {
        override fun invoke(i: Int): Int {
            return 2 * i
        }
    }
    println(f1(2))

    val f2: IntPredicate = IntPredicate { it % 2 == 0 }
    println(f2(2))

    val f3: IntPrinter = IntPrinter { println(it) }
    f3.accept(3)

    val f4: Predicate<Int> = Predicate<Int>{ it % 2 == 1 }
    println(f4(1))

    val f5: StringPredicate = StringPredicate { it.length > 1 }
    println(f5("1"))

    val f6: DoubleOperation = DoubleOperation {a, b -> a + b}
    println(f6(1.0, 6.0))

    val f7: IntOperation = IntOperation {a, b -> a + b}
    println(f7(1, 9))

    val f8: IntPairPredicate = IntPairPredicate {x, y -> (x + y) > 0}
    println(f8(-1, 1))

    val f9: StringGenerator = StringGenerator { it.reversed() }
    println(f9("aklsakd"))

    val f10: StringPairPredicate = StringPairPredicate {a, b -> (a.length + b.length) > 20}
    println(f10("a", "ab"))
}