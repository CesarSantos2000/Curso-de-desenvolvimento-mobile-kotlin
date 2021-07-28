package one.digitalinovation.colection

fun main() {
    val salarios = doubleArrayOf(1080.0, 2800.0, 4800.0)

    for(salario in salarios){
        println(salario)
    }

    println("---------------------------")
    println("Maior salari0: ${salarios.maxOrNull()}")
    println("Menos salarios: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("---------------------------")
    salariosMaiorQue2500.forEach{println(it)}

    println("---------------------------")
    println(salarios.count{ it in 2000.0..5000.0 })

    println("---------------------------")
    println(salarios.find { it == 2800.0 })
    println(salarios.find { it == 500.0 })

    println("---------------------------")
    println(salarios.any { it == 1080.0 })
    println(salarios.any { it == 250.0 })
}