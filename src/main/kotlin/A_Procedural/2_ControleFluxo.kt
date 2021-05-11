fun main(){

    val saldo = 150.0

    println("=======================")
    println("       INFOS           ")
    println("=======================")

    if(saldo > 0){
        println("Saldo positivo. Saldo: $saldo")

    } else if(saldo == 0.0){
        println("Conta sem saldo. Saldo: $saldo")
    } else {
        println("Saldo está negativo. Saldo: $saldo")
    }

    /**O código acima pode ser substituído pelo de baixo*/

    when{
        saldo > 0.0 -> {
            println("Saldo positivo. Saldo: $saldo")
        }
        saldo == 0.0 -> {
            println("Conta sem saldo. Saldo: $saldo")
        }
        else -> {
            println("Saldo está negativo. Saldo: $saldo")
        }
    }

    /**Ainda é possível fazer de uma forma melhor**/

    when{
        saldo > 0.0 -> println("Saldo positivo. Saldo: $saldo")
        saldo == 0.0 -> println("Conta sem saldo. Saldo: $saldo")
        else -> println("Saldo está negativo. Saldo: $saldo")
    }
}