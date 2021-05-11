package C_colecoes.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val ti = bigDecimalArrayof("2500", "5000", "6000", "8000", "10000") //função criada em "operacoes"

    /**
     * Num Array de BigDecimal eu não consigo usar a função de soma,
     * então para solucionar esse problema, irei criar essa função
     * para esse Array
     */
    val somatoriaSalarios = ti.soma().setScale(2, RoundingMode.UP)
    //Array<BigDecimal>.soma() -> observe que agora temos uma função de soma

    println("Total TI por mes: $somatoriaSalarios")

    //Ele irá somar o valor somatoriaSalarios + (somatoriaSalarios * 6)
    val total6meses = ti.fold(somatoriaSalarios) { acumulo, salario ->
        acumulo + (salario * BigDecimal(5)).setScale(2, RoundingMode.UP)
    }

    println("Gasto TI 6 meses: $total6meses")

}

fun Array<BigDecimal>.soma() : BigDecimal{
    //Irá incrementar os valores automaticamente
    return this.reduce { soma, valor ->
        soma + valor
    }
}