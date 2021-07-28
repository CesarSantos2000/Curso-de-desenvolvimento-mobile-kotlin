package one.digitalinovation.colection

fun main() {
    val values = intArrayOf(2, 3, 4, 7, 1, 9)

    values.forEach {
        println(it)
    }

    println("***********")

    values.sort()
    values.forEach {
        println(it)
    }
}