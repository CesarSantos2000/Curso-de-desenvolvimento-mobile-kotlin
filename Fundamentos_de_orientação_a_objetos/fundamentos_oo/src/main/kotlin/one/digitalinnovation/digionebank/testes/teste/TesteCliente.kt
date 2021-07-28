package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.Cliente
import one.digitalinnovation.digionebank.testes.ClienteTipo
import one.digitalinnovation.digionebank.testes.teste.TesteAutenticacao

fun main() {
    val cliente = Cliente(
        nome = "Jose Noronha",
        cpf = "123.456.789.32",
        clienteTipo = ClienteTipo.pf.descricao,
        senha = "12345678"
    )
    val vddFal = TesteAutenticacao().autentica(
    cliente
    ).toString()
    if(vddFal == "true"){
        println(cliente)
    }
    else{
        println("senha incorreta!")
    }
}

