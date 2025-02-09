package lesson4

class Rational(var m: Int, var n: Int) {
    override fun toString(): String {
        return "$m/$n"
    }
    operator fun plus(number: Rational): Rational {
        val znam: Int
        if (this.n != number.n) {
            znam = this.n * number.n
            this.m *= number.n
            number.m *= this.n
        }
        else {
            znam = this.n
        }
        return Rational(this.m + number.m, znam)
    }
    operator fun minus(number: Rational): Rational {
        val znam: Int
        if (this.n != number.n) {
            znam = this.n * number.n
            this.m *= number.n
            number.m *= this.n
        }
        else {
            znam = this.n
        }
        return Rational(this.m - number.m, znam)
    }
    operator fun times(number: Rational): Rational {
        return Rational(this.m * number.m, this.n * number.n)
    }
}

fun main() {
    var n1: Rational = Rational(1, 2)
    var n2: Rational = Rational(1, 3)
    //println((n1 + n2).toString())
    //println((n1 - n2).toString())
    println((n1 * n2).toString())
}