package one.digitalinovation.colection

fun main() {
    val cesar = Funcionario("Cesar", 4800.0, "CLT")
    val luan = Funcionario("Luan", 2000.0, "CLT")
    val jonas = Funcionario("Jonas", 1500.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(cesar.nome, cesar)
    repositorio.create(luan.nome, luan)
    repositorio.create(jonas.nome, jonas)

    println(repositorio.findById(cesar.nome))

    println("--------------------------------")
    repositorio.findAll().forEach { println(it) }

    println("--------------------------------")
    repositorio.remove(cesar.nome)
    repositorio.findAll().forEach { println(it) }
}