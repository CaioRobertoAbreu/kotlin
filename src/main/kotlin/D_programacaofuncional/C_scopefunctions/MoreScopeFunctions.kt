package D_programacaofuncional.C_scopefunctions

import B_poo.B_heranca_polimorfismo_interface.Cliente
import B_poo.B_heranca_polimorfismo_interface.ContaPoupanca

fun main() {

    with(EnderecoLocal()) {
        logradouro = "Rua das Rosas"
        numero = 500
        bairro = "Barra Funda"
        cidade = "São Paulo"
        this.toString()
    }
        .let { enderecoCompleto: String ->
            println(enderecoCompleto)
        }

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Caio", cpf = "12345678910", "1234"), 2000)

    contaPoupanca.run {
        deposita(1500.0)
        saldo * 0.012
    }.let { rendimentoMensal ->
        println("Rendimento do mês: $rendimentoMensal")
    }

    run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * 0.012
        }
        saldo
    }.let { rendiementoAnual -> println("Rendimento Anual: $rendiementoAnual") }


}

data class EnderecoLocal(
    var logradouro: String = "",
    var numero: Int = 0,
    var bairro: String = "",
    var cidade: String = ""
) {

}