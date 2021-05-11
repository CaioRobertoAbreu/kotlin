package D_programacaofuncional.B_hof

import B_poo.A_classes_metodos_composicao.Endereco

fun main() {
    val enderecoEmMaiusculo = Endereco("Rua São Thome", 813)
        .let { endereco ->
            "${endereco.logradouro}, ${endereco.numero}".uppercase()
        }

    println(enderecoEmMaiusculo)

    Endereco("Rua Solemar", 123)
        .let { endereco ->
            println("${endereco.logradouro}, ${endereco.numero}".uppercase())
        }

    listOf<Endereco>(
        Endereco(complemento = "casa"), Endereco(), Endereco(complemento = "apartamento"), Endereco(), Endereco())
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .forEach{ endereco ->  println("Complemento: ${endereco.complemento}") }

//    soma(1, 4, { println("Resultado + 1: ${it+1}") } )
    soma(1, 4) {resultado -> println("Resultado + 1: ${resultado+1}") }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit){
    println("A: $a\nB: $b")
    resultado(a+b)
}