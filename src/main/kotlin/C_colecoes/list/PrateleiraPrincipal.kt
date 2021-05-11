package C_colecoes.list

fun main() {

    val prateleira = Prateleira("Literatura Nacional", criarListaLivros())

    prateleira.organizaPorAutor().imprimeComMarcadores()
    prateleira.organizaPorAnoPublicacao().imprimeComMarcadores()

    /**
     * Como eu to usando sortBy, que altera a lista internamente,
     * se eu fizer duas ordenações seguidas, a lista ficará con-
     * forme a última
     */

    prateleira.organizaPorAnoPublicacao() //Ordenado por data de publicacao
    prateleira.organizaPorAutor() // reorganizado por autor


}