package C_colecoes.set

fun main() {
    val nomes = setOf("Alex", "Gui", "Giulia", "Guilherme")
    val nomes2 = setOf("Gustavo", "Gael", "Guilherme", "Giulia")

    val juntandoNomes = nomes + nomes2
    println("Juntando nomes: $juntandoNomes")
}