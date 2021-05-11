package B_poo.B_heranca_polimorfismo_interface

import B_poo.C_classesabstratas_variavelglobal.variavelGlobal

fun main() {

    val cliente = Cliente("Caio", "78820322048", "pass")
    val contaCorrente = ContaCorrente(cliente, conta = 3000)
    val contaPoupanca = ContaPoupanca(cliente, conta = 3000)

    contaCorrente.deposita(2500.0)
    contaPoupanca.deposita(2500.0)

    contaCorrente.saca(500.0)
    contaPoupanca.saca(500.0)

    println("Saldo CC: ${contaCorrente.saldo}")
    println("Saldo CP: ${contaPoupanca.saldo}")

    println()
    println("Chamando a variavel global: $variavelGlobal")


}