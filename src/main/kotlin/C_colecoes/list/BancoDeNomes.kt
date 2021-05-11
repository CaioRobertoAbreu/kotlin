package C_colecoes.list

class BancoDeNomes {

    /**
     * A lista mutável será privada para que não seja
     * possível que qualquer um faça modificação.
     * Aplicamos o princípio do encapsulamento
     */
    private val dados = mutableListOf<String>()
    val nomes: Collection<String> get() = dados.toList()

    fun add(nome: String) {
        dados.add(nome)
    }
}