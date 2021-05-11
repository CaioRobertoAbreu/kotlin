package C_colecoes.list

fun main() {

    val livros = criarListaLivros()

    livros.filter { it.anoPublicacao > 1900 }
        .imprimeComMarcadores() //Metodo criado em Princioal

    livros.filter { it.anoPublicacao > 1900 }
        .sortedBy { it.anoPublicacao}
        .imprimeComMarcadores()
}