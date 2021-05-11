package C_colecoes.list

data class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
){

    /**
     * @MutableList e @List
     * A primeira, como o nome já diz é mutável, ou seja,
     * pode ser alterada. A segunda não, é uma lista
     * imutável, logo, não conseguiremos usar o método
     * sortBy, apenas o sortedBy
     *
     * @sortBy e @sortedBy
     * O primeiro altera a lista internamente,
     * o segundo gera uma nova lista
     */

    fun organizaPorAutor() : MutableList<Livro> {
        this.livros.sortBy { it.autor }

        return this.livros
    }

    fun organizaPorAnoPublicacao() : MutableList<Livro> {
        this.livros.sortBy { it.anoPublicacao }

        return livros
    }
}
