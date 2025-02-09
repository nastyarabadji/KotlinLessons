package lesson4

open class Rectangle1 {
    open fun draw() {
        println("Drawing a rectangle")
    }
    open val fillColor: String = "black"
}

class FilledRectangle: Rectangle1() {

}

fun main() {

}