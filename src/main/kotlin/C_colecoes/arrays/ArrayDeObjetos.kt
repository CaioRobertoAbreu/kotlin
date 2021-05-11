package C_colecoes.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    //Esse array irá inicializar todos os valor com 1000
    val salarios = Array<BigDecimal>(5) { BigDecimal(1000.0) }

    println("Estagiario: ${salarios.contentToString()}")

    salarios[0] = BigDecimal(1500.0) //ou "1500.0".toBigDecimal()
    salarios[1] = BigDecimal(2500.0)
    salarios[2] = BigDecimal(3500.0)
    salarios[3] = BigDecimal(4500.0)
    salarios[4] = BigDecimal(5500.0)

    println("TI: ${salarios.contentToString()}")

    val salariosDiretores = bigDecimalArrayof("10000.0", "12000.0", "15000.0")
    println("Diretores: ${salariosDiretores.contentToString()}")

    val aumumentoTI = salarios.map {i ->
        if (i < BigDecimal(3500.0)){
            i + BigDecimal(500.0)
        } else {
            i + (i * BigDecimal(0.1)).setScale(2, RoundingMode.UP)
        }
    }.toTypedArray()

    println("Novos salarios TI: ${aumumentoTI.contentToString()}")

}

fun bigDecimalArrayof(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) {valores[it].toBigDecimal()}
}