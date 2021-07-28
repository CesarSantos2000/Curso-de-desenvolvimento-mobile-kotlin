package one.digitalinovation.colection

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 2500.0
    salarios[1] = 1001.0
    salarios[2] = 4800.0

    salarios.forEach { println(it) }

    println("------------------")
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.forEach { println(it) }
    println("--------------------")
    val salarios2 = doubleArrayOf(6500.0, 2500.0, 4800.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}