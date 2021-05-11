package C_colecoes.list

fun main() {

    val nomes = listOf("Alex", "Fran", "Gui", "Giulia", "Guilherme")
    val nomes2 = listOf("Gustavo", "Gael", "Guilherme", "Giulia")

    //Sim, com Kotlin podemos somar listas
    val juntandoNomes = nomes + nomes2


    println("Juntando nomes: $juntandoNomes")
    val distinct = juntandoNomes.distinct()
    println(distinct)

}