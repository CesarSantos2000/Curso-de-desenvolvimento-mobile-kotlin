package one.digitalinovation.colection

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "6800".toBigDecimal()
    )

    println("--------------------")
    println(salarios.somatoria())

    println("--------------------")
    println(salarios.media())
}