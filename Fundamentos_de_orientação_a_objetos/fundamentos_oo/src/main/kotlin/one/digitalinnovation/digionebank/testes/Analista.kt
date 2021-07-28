package one.digitalinnovation.digionebank.testes

class Analista(nome: String,
cpf: String,
salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculaAuxilio() = salario *0.1
}