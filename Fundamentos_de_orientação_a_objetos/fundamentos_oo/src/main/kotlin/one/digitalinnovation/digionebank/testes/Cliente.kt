package one.digitalinnovation.digionebank.testes

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: String,
    val senha: String
 ) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "12345678" == senha
    override fun toString(): String = """
        Nome: $nome
        cpf:  $cpf
        Tipo: ${clienteTipo}
    """.trimIndent()
}