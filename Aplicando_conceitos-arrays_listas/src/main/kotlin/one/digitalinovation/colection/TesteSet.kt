package one.digitalinovation.colection

fun main() {
    val cesar = Funcionario("Cesar", 4800.0, "CLT")
    val luan = Funcionario("Luan", 2000.0, "CLT")
    val jonas = Funcionario("Jonas", 1500.0, "PJ")

    val funcionarios = setOf(cesar, luan)
    val funcionarios2 = setOf(jonas)

    val resultUnion = funcionarios.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("-------------------------")




 }