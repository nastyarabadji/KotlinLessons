package lesson5

sealed interface Error {
    fun describe()
    class SyntaxError;
    class IOError;
}

class SyntaxError: Error {
    override fun describe() {
        println("Syntax Error")
    }
}

class IOError: Error {
    override fun describe() {
        println("IO error")
    }
}

fun main() {
    val error = SyntaxError()
    error.describe()
}