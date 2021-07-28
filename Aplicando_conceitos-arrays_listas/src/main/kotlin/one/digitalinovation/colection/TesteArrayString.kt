package one.digitalinovation.colection

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Luan"
    nomes[1] = "Cesar"
    nomes[2] = "Jonas"

    for(nome in nomes){
        println(nome)
    }

    println("--------------")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("---------------------")
    val nomes2 = arrayOf("Luzinara", "Edinalvo", "Luan")
    nomes2.sort()
    nomes2.forEach { println(it) }
}