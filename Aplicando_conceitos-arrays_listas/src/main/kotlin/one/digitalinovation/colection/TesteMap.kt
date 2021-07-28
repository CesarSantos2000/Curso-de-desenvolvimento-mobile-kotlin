package one.digitalinovation.colection

fun main() {
    val pair: Pair<String, Double> = Pair("joão", 2500.0)
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) -> println("Chave: $k - valor: $v")}

    val map2 = mapOf(
        "Luan" to 2500.0,
        "Cesar" to 4800.0
    )

    map2.forEach{ (k, v) -> println("Chave: $k - valor: $v")}
}