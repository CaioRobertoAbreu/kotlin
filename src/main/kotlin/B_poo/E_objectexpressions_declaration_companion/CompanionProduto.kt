package B_poo.E_objectexpressions_declaration_companion

/**
 * A título informativo, o Companion foi usado como prefixo
 * apenas para diferenciar. Não é um padrão
 */
open class CompanionProduto(
    nome: String,
    preco: Double

) : Produto(nome, preco) {

    companion object ContaProduto{
        var total: Int = 0
            private set
    }

    init {
        total++
    }

    /**
     * Diferentemente do object declaration o companion object é como se
     * fosse um atributo estático da classe, ou seja, sendo acessível
     * apenas dessa classe
     */
}

class CompanionEletronico(
    nome: String,
    preco: Double
) : CompanionProduto(nome, preco){

    init {
        //total++ Não consigo alterar pois ele é privado
    }

}

fun main() {

    val produto1 = CompanionProduto("Notebook", 5000.0)
    val produto2 = CompanionProduto("Celular", 2500.0)
    val produto3 = CompanionProduto("Cafeiteira", 300.0)
    val produto4 = CompanionProduto("Bicicleta", 2000.0)

    println("Contador de produtos: ${CompanionProduto.total}")
}