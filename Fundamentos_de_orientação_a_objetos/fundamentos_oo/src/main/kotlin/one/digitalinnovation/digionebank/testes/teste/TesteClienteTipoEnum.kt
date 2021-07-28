package one.digitalinnovation.digionebank.testes.teste

import one.digitalinnovation.digionebank.testes.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
    println("${it.name} - ${it.descricao}")
    }
    val pf = ClienteTipo.pf
    println(">> ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.pj
    println(">> ${pj.name} - ${pj.descricao}")
}