package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.Gerente

fun main() {
    val func = Gerente("Cesar Santos", "12345678974", 10000.0,"senha123")

    val vddFal = TesteAutenticacao().autentica (func).toString()

    if(vddFal == "true"){
        ImprimeRelatorioFuncionario.imprime((func))
    }
    else{
        println("Senha incorreta!")
    }
}