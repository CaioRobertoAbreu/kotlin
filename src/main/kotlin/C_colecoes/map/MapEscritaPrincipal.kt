package C_colecoes.map

fun main() {

    val eletronicos = gerarMap()

    println(eletronicos)

    //Faz a atualizacao
    eletronicos.put("Cafeteira", 400.0)
    println(eletronicos)

    //Só insere se a chave informada não existir no dicionário
    eletronicos.putIfAbsent("Notebook", 5000.0)
    println(eletronicos)

}

fun gerarMap(): MutableMap<String, Double> {
    val eletronicos = mutableMapOf<String, Double>(
        "Notebook" to 5000.0, "Smartphone" to 2000.0, "Alexa" to 300.0, "TV 4K" to 2500.0
    )

    eletronicos["Cafeteira"] = 350.0
    eletronicos.put("IPad Pro", 30000.0)

    return eletronicos
}