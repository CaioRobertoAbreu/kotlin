package C_colecoes.arrays

fun main() {

    val nomes = Array<String>(3) {"Caio, Guilherme, Camila"}
    nomes[0] = "Caio"
    nomes[1] = "Guilherme"
    nomes[2] = "Camila"

    println("Nomes".toUpperCase())
    nomes.forEach { println("Nome: ${it}") }

    println()
    println("contatos".toUpperCase())
    val contatos = arrayOf("Pamela", "Luana", "Marisa")
    contatos.forEach { println("Contato: $it") }

}