fun main() {

    var i = 3
    while (i > 0){
        println("While: $i")
        i--
    }

    println()

    /**
     * Tem o DoWhile, mas é igual ao Java
     *
     * FOR
     */

    //inclusivo
    println("INCLUSIVO")
    for(numero in 1..10) print("$numero,")

    println("")
    println("")

    //nao inclusivo
    println("NAO INCLUSIVO")
    for(numero in 1 until 11) print("$numero,")

    println("")
    println("=======================")
    println("IMPRIMINDO BONITINHO   ")
    println("=======================")
    for (n in 1..10 step 2){ /** Usando incremento 'personalizado' */
        println("Numero: $n")
    }

    /**Para decrescente. Obs.: Inclusivo */
    for(i in 10 downTo 0) print("$i, ")

    println()
    println()


}