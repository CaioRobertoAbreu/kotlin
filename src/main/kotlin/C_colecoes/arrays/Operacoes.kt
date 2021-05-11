package C_colecoes.arrays

fun main() {

    val idades = intArrayOf(22, 45, 30, 19, 27, 32)

    println("Maior idade: ${idades.maxOrNull() ?: 0}")
    println("Menor idade: ${idades.minOrNull() ?: 0 }}")
    println("Media idade: ${idades.average()}")

    println("Todos sao maior de idade? ${idades.all { it >= 18 }}")
    println("Tem alguem menor que 20 anos? ${idades.any { it < 20 }}" )
    println("Traz todas as idades maior que 30: ${idades.filter { it >=30 }}")
    println("Encontra alguem com idade especificada: ${idades.find { it == 33 }}") //retornará null

}