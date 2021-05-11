package B_poo.A_classes_metodos_composicao

import B_poo.B_heranca_polimorfismo_interface.Cliente

fun main() {


    /**
     * Com Kotlin também podemos usar Named Arguments (informalmente conhecido como labels)
     */

    val contaCaio = Conta(Cliente("Caio", "78820322048", "pass"), conta = 2000)

    //Não precisa ser na ordem do construtor
    val contaFran = Conta(conta = 2001, titular = Cliente("Caio", "78820322048", "pass"))

    //Também funciona para funções
    contaCaio.deposita(valor = 5000.0)
    contaFran.deposita(valor = 2500.0)

    contaCaio.transfere(valor = 100.0, contaDestino = contaFran)

    println(contaCaio.toString())
    println(contaFran.toString())


}