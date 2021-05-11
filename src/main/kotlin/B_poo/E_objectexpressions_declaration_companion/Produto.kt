package B_poo.E_objectexpressions_declaration_companion

/**
 *@contaProdutos: Object Declaration composto na classe
 */


open class Produto(
    val nome: String,
    val preco: Double
) {

    //Posso declará-lo tanto aqui dentro como fora
    object contaProdutos {
        var totalProdutos: Int = 0
    }

    init{
        contaProdutos.totalProdutos++
    }

    /**
     * @init Como o contador pertence a uma classe eu tenho que usar a referência a ela,
     * e isso pode me causar problemas visto que classes filhas de
     * @Produto podem fazer alterações, dependo da regra de negócio isso não seria
     * interessante usar
     */
}

class Eletronico(
    nome: String,
    preco: Double
) : Produto(nome, preco) {

    /**
     * Como descrito acima, essa classe faz alteração no contador de produtos,
     * o que resultará em valores errados. Essa classe não poderia ter como
     * alterar mas com Object Declaration isso não é possível
     */
    init {
        contaProdutos.totalProdutos++
    }
}

/**
 * Para solucionar esse problema, podemos usar o companion object
 */