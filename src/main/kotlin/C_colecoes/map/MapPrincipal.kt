package C_colecoes.map

fun main() {

    val eletronicos = gerarMap()

    /**
     * A forma acima é equilante a de abaixo. O mais comum é
     * utilizar o de baixo, no entanto, a documentação informa
     * que este tem uma perda de performance em relação ao primeiro.
     * Então, caso precisemos de performance, a primeira forma é
     * a mais adequada
     */

    val eletronicos2 = mapOf<String, Double>("Notebook" to 5000.0, "Smartphone" to 2000.0, "Alexa" to 300.0,
        "TV 4K" to 2500.0)

    println("1ª forma: $eletronicos")
    println("2ª forma: $eletronicos2")
    eletronicos["Alexa"]?.let {
        println("Preco Alexa: $it" )
    }

    println("=======PRODUTOS==========")
    for (eletronico in eletronicos2){
        println("Produto: ${eletronico.key} - R$ ${eletronico.value}")
    }
}