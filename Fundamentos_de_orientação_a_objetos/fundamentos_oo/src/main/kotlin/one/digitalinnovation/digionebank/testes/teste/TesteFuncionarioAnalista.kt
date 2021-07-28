package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.Analista

fun main() {
    val func = Analista("Luan Santos", "98765432111", 2500.0)

    ImprimeRelatorioFuncionario.imprime(func)
}