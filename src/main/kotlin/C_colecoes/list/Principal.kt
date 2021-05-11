package C_colecoes.list

fun main() {

    val livros = criarListaLivros()

    livros.imprimeComMarcadores()
    val livrosOrdenados = livros.sortedBy { it.titulo } //Também da pra ordenar pelo Comparable, igual Java
    livrosOrdenados.imprimeComMarcadores()
}

fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this
//        .filterNotNull()- Poderia usar para não exibir os livros nulos
        .joinToString(separator = "\n") {
        " - ${it?.titulo} de ${it?.autor} - ${it?.anoPublicacao}"
    }

    println("======LISTA DE LIVROS=======")
    println(textoFormatado)
    println()
}

fun criarListaLivros(): MutableList<Livro>{
    val livro1 = Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 1956)

    val livro2 = Livro("Minha vida de menina", "Helena Morley", 1942,
        editora = "Editora A")

    val livro3 = Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1881)

    val livro4 = Livro("Iracema", "José de Alencar", 1865, "Editora B")

    val livro5 = Livro("Vidas Secas", "Graciliano Ramos", 1935,
        editora = "Editora A")

    val livros = mutableListOf<Livro>(livro1, livro2, livro3, livro4, livro5)

    livros.add(Livro("Sagarana", "João Guimarães Rosa", 1946))

    return livros
}