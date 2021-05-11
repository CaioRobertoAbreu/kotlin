package C_colecoes.arrays

import java.math.BigDecimal

fun main() {

    val salarios = bigDecimalArrayof("5000", "6000", "8000", "4000", "2000", "10000")

    val media3MaioresSalarios = salarios
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()

    val media3MenoresSalarios = salarios
        .sorted()
        .take(3)
        .toTypedArray()
        .media()

    val mediaSalarios = salarios
        .sorted()
        .toTypedArray()
        .media()

    println("Media dos 3 maiores salarios: $media3MaioresSalarios")
    println("Media dos 3 menores salarios: $media3MenoresSalarios")
    println("Media salarios: $mediaSalarios")

}

fun Array<BigDecimal>.media(): BigDecimal {
    if (this.isEmpty()) {
        return BigDecimal.ZERO
    } else {
        return this.soma() / this.size.toBigDecimal()
    }
}