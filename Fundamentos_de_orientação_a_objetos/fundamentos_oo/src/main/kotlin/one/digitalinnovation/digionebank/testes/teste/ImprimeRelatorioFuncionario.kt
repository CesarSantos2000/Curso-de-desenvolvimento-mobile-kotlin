package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}