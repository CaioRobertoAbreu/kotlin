package B_poo.E_objectexpressions_declaration_companion

/**
 * Object Declarations são como um objeto anônimo,
 * no entato, ele tem alguns comportamentos diferentes:
 *
 * 1. Não é possível usá-lo dentro dentro de funções,
 * apenas dentro de arquivos, classes...
 * 2. Object declarations têm um nome
 */

object contador {
    var total: Int = 0
}

fun main() {

    contador.total++
    println("Contador local: ${contador.total}")

    val tenis = Produto("Tenis nike", 900.0)
    val sapatenis = Produto(nome = "Sapatenis", 300.0)
    val notebook = Eletronico("Notenook Acer", 5000.0)

    println()
    println("Contador da classe produto: ${Produto.contaProdutos.totalProdutos}")
}
