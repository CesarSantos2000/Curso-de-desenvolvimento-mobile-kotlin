package one.digitalinovation.colection

fun main() {
    val cesar = Funcionario("Cesar", 4800.0, "CLT")
    val luan = Funcionario("Luan", 2000.0, "CLT")
    val jonas = Funcionario("Jonas", 1500.0, "PJ")

    println("---------------- List-----------------")
    val funcionarioList = mutableListOf(cesar, luan)
    funcionarioList.forEach { println(it) }

    println("-------------------------")
    funcionarioList.add(jonas)
    funcionarioList.forEach { println(it) }

    println("-------------------------")
    funcionarioList.remove(cesar)
    funcionarioList.forEach { println(it) }

    println("---------------- Set -----------------")
    val funcionariosSet = mutableSetOf(jonas)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------")
    funcionariosSet.add(luan)
    funcionariosSet.add(cesar)
    funcionariosSet.forEach { println(it) }

    println("-----------------------------")
    funcionariosSet.remove(jonas)
    funcionariosSet.forEach { println(it) }
}