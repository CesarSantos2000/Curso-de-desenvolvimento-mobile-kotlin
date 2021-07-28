package one.digitalinovation.colection

fun main() {
    val cesar = Funcionario("Cesar", 4800.0, "CLT")
    val luan = Funcionario("Luan", 2000.0, "CLT")
    val jonas = Funcionario("Jonas", 1500.0, "PJ")

    val funcionarios = listOf(cesar, luan, jonas)

    funcionarios.forEach{println(it)}

    println("-------------------------")
    println(funcionarios.find{it.nome == "Luan"})

    println("-------------------------")
    funcionarios.sortedBy { it.salario }.forEach{println(it)}

    println("-------------------------")
    funcionarios.groupBy { it.tipoContratacao}.forEach{println(it)}
}

