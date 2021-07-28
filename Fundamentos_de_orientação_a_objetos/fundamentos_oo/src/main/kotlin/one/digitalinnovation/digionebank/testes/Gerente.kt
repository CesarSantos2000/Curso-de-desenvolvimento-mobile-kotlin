package one.digitalinnovation.digionebank.testes

class Gerente(nome: String,
              cpf: String,
              salario: Double,
              val senha: String
) : Funcionario(nome = nome, cpf =cpf, salario = salario), Logavel {
    override fun calculaAuxilio() = salario *0.3
    override fun login(): Boolean = "senha123" == senha
}