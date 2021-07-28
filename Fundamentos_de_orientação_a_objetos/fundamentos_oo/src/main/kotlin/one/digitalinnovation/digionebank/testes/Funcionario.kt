package one.digitalinnovation.digionebank.testes

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome, cpf) {

    protected abstract  fun calculaAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        cpf: $cpf
        Salario: $salario
        Auxilio: ${calculaAuxilio()}
    """.trimIndent()
}