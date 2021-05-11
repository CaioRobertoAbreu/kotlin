package B_poo

import B_poo.A_classes_metodos_composicao.Endereco

fun main() {
    /**
     * Kotlin nos protege de ficar criando valores nulos
     * evitando o NullPointerException, mas e quando precisar-
     * mos usá-lo, como faremos? Assim:
     */

    /**Podemos usar ? para que o objeto em questão pode ser nulo,
     * no entanto, o Kotlin não nos permitirá chamarmos seus
     * atributos (property)
     */
    var endereco: Endereco? = null
    //endereco.logradouro -> não permitido

    /**
     * Também podemos garantir que determinado campo não é
     * nulo, para isso usamos !!.
     * Obs.: Caso esteja nulo será lançada uma exceção
     */
//    val enderecoNaoNulo: Endereco = endereco!! //Lançará exceção
//    enderecoNaoNulo.logradouro

    /**Também existe um recurso chamado de safe call
     */

    val a: String? = null
    val b: String = "10"

    //Isso aqui: if(a != null) println(a); if(b != null) println(b)

    //Vira isso aqui:

    println(a?.length) //exibe null no console
    println(b?.length)


    val rua: Endereco? = Endereco("são thome")
    val rua2: Endereco? = null
    println("Rua: ${rua?.logradouro}")
    println("Rua: ${rua2?.logradouro}")


    rua?.let {
        println("Usando let: ${it.logradouro}")
    }

    rua2?.let {
        println("Usando let: ${it.logradouro}")
    }

    rua.let {
        println("Tamanho caracteres: ${ it?.logradouro?.length ?: 0 }")
    }

    rua2.let {
        println("Tamanho caracteres: ${ it?.logradouro?.length ?: 0 }")
    }

}