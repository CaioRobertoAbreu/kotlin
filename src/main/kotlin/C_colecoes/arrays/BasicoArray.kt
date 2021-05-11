package C_colecoes.arrays

fun main() {

    val idades = IntArray(5)

    idades[0] = 30
    idades[1] = 20
    idades[2] = 50
    idades[3] = 40
    idades[4] = 10
//    idades[5] = 60 -> lança exception

    var maiorIdade: Int = 0
    for(idade in idades){
        if (idade > maiorIdade) maiorIdade = idade
    }

    println("Maio idade: $maiorIdade")

    val notas = intArrayOf(5, 10, 20, 50, 100, 200)

    notas.forEach { println("Nota R$: ${it}") }

}