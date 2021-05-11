package C_colecoes.list

fun main() {

    val listaComNulos = listaComNulos()
    listaComNulos.imprimeComMarcadores()

    listaComNulos.filter { it?.titulo != null }
        .groupBy { it?.editora ?: "Editora Desconhecida"}
        .forEach { (editora, livro) ->
            println("${editora.toUpperCase()}\n " +
                    "\r${livro.joinToString(separator = "\n") { 
                        "${it?.titulo} - ${it?.autor} - ${it?.anoPublicacao}" }}\n")
        }


}

fun listaComNulos(): MutableList<Livro?>{

    val listaComNulos = mutableListOf<Livro?>(null)
    listaComNulos.addAll(criarListaLivros())
    listaComNulos.add(null)

    return listaComNulos
}
