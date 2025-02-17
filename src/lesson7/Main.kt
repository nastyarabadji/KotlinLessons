package lesson7

import kotlin.math.pow

data class Sample(val id: Int, val text: String)

fun getStrings(list: List<Sample>): List<String> {
    val resultList: List<String> = buildList {
        for (i in list) {
            add(i.text)
        }
    }
    return resultList
}

fun groupSamplesById(list: List<Sample>): Map<Int, List<String>> {
    return list.groupBy({ it.id }, { it.text })
}

fun List<String>.countSummaryLength(): Int {
    var sum: Int = 0
    for (i in this) {
        sum += i.length
    }
    return sum
}

fun List<String>.filterListByContainingEChar(): List<String> {
    return this.filter { it.contains('e') }
}

fun List<String>.findFirstElement(): String {
    for (i in this) {
        if (i.startsWith("th")) {
            return i
        }
    }
    return ""
}

fun List<String>.checkEmpty(): Boolean {
    for (i in this) {
        if (i.isEmpty()) {
            return false
        }
    }
    return true
}

fun List<String>.checkLengthAny(): Boolean {
    for (element in this) {
        if (element.length > 5) {
            return true
        }
    }
    return false
}

fun List<Double>.cumsum(): List<Double> {
    val buffMass: MutableList<Double> = mutableListOf()
    buffMass.add(this[0])
    for (i in 1 until this.size) {
        var tempSum: Double = 0.0
        for (j in i downTo 0) {
            tempSum += this[j]
        }
        buffMass.add(tempSum)
    }
    return buffMass
}

fun List<Double>.returnIndices(condition: (Double) -> Boolean): List<Int> {
    val resultMas: MutableList<Int> = mutableListOf()
    for (i in 0 until this.size) {
        if (condition(this[i])) {
            resultMas.add(i)
        }
    }
    return resultMas
}

fun List<Double>.softmax(): List<Double> {
    val resultList: MutableList<Double> = mutableListOf()
    for (i in this) {
        resultList.add(Math.pow(Math.E, i - this.max()))
    }
    return resultList
}

fun main() {
    println(groupSamplesById(listOf(Sample(1, "2"), Sample(1, "5"))))
}