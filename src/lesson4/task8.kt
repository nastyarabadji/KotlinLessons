package lesson4

class PizzaCalculator {
    companion object {
        const val PI = 3.14
    }
    fun volume(radius: Double, thickness: Double): Double {
        return ((PI * radius * radius * thickness) * 100.0).toInt().toDouble() / 100.0
    }
}

fun main() {

}