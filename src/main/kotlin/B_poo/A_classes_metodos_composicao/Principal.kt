package B_poo.A_classes_metodos_composicao

import B_poo.B_heranca_polimorfismo_interface.Cliente

fun main(){

    val contaCaio = Conta(Cliente("Caio", "78820322048", "pass"), 1000)
    contaCaio.deposita(2000.0)
    contaCaio.deposita(500.0)

    println("DADOS BANCÁRIOS")
    println(contaCaio.toString())

    val contaFan = Conta(Cliente("Franciele", "01980820023", "senha"), 1001);
    contaFan.deposita(200.0)

    println("Realizando algumas operações...")
    contaCaio.transfere(contaFan, 500.0)


    println("DADOS BANCÁRIOS")
    println(contaCaio.toString())
    println(contaFan.toString())

    println()
    println("Realizando outras operações...")
    contaCaio.saca(300.0)
    println()
    println(contaCaio.toString())

}