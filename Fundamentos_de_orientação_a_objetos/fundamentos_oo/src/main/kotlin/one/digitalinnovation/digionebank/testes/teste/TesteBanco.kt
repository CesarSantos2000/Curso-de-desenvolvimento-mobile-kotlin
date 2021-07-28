package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.Banco

fun main(){
    val digiOneBank = Banco(nome= "DigiOne", numero= 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}