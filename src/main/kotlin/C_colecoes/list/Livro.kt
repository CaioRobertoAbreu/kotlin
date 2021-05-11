package C_colecoes.list

/**
 * @Dataclass tipo de dados em Kotlin que já contém
 * alguns métodos prontos, como toString(), Equals()
 * e HashCode()
 */
data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Int,
    val editora: String? = null
){

}
