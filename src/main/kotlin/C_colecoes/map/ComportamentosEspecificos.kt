package C_colecoes.map

fun main() {

    val eletronicos = gerarMap()

    /**
     * OS métodos abaixo verificam se existe um
     * valor dado a chanve informada
     */

    println(eletronicos.get("Exibe null"))

    try {
        println(eletronicos.getValue("Lança exceção"))
    } catch (e: NoSuchElementException) {
        println("Lançou exceção")
    }

    println(
        eletronicos
            .getOrElse("Nao existe", { "Nao existe valor para a chave especificada" })
    )

    println(eletronicos.getOrDefault("Nao existe", "valor default que será exibido"))


    eletronicos.filter { (eletro, valor) -> valor in 300.0..2000.0 }
        .forEach { println(it.key) }

    println("\nFiltro por valor")
    eletronicos.filterValues { it in 300.0..2500.0 }
        .forEach { println(it.value) }

    eletronicos.putAll(setOf<Pair<String, Double>>("MacBook" to 20000.0, "AirFryer" to 400.0))
//    eletronicos += (setOf<Pair<String, Double>>("MacBook" to 20000.0, "AirFryer" to 400.0))
    println(eletronicos)


}