package lesson4

interface Animal {
    fun speak();
}

class Cat: Animal {
    override fun speak() {
        println("meow")
    }
}

class Dog: Animal {
    override fun speak() {
        println("woof")
    }
}

fun main() {

}