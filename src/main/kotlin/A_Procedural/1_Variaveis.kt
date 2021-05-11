fun main(){
    println("Hello world with Kotlin, ")

    val titular = "Caio" //inferência de tipo
    val titular2: String = "Caio" //Usando tipagem
    val conta = 7747
    var saldo = 50.0
    saldo += 10.0

    println("===========================")
    println("      DADOS BANCÁRIOS      ")
    println("===========================")
    println("TITULAR: $titular")
    println("CONTA: $conta")
    println("SALDO: $saldo")
    println("===========================")
}