package B_poo.F_exceptions

/**
 * Em Kotlin TRATAMOS exceções da mesma maneira que no Java,
 * pelo menos na maioria dos casos, ainda não vi nada de
 * diferente.
 *
 * Um recurso legal da linguagem é que Exceções não expressões.
 * Como assim?
 */

fun main() {

    //? representa que o atributo pode receber nulo

    val valor: Double? = try {
        val numero = "1,9".toDouble()
        println("Conversão realizada com sucesso")
        numero
    }catch (e: NumberFormatException){
        println("Não foi possível realizar a conversão")
        null
    }

    //Também podemos fazer isso com if

    val nota1 = 10
    val nota2 = 8

    /**
     * Ta redundante, mas é apenas para exemplificação
     *
    val maiorIgualA20: Boolean = if(nota1 >= 10 && nota2 >= 10){
        true
    } else {
        false
    }
    */

    val maiorIgualA20: Boolean = nota1 >= 10 && nota2 >= 10
    println(maiorIgualA20)
}

