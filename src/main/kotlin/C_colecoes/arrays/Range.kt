package C_colecoes.arrays

fun main() {

    //Inclusivo
    val range = 1..10
    val range2 = 1.rangeTo(100)

    //Não inclusivo e não suporta Double
    val range3 = 2.until(13) step 2

    val range4 = 10.downTo(1) step 1

    val salarios = 1500.5..10200.2
    val salario = 3550.0

    if(salario in salarios){
        println("O valor $salario está presente no range")
    }

    val alfabeto = "a".."z"

    if("k" in alfabeto){
        println("K é uma letra do alfabeto")
    }


}