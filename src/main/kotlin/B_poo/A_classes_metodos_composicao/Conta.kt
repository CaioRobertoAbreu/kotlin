package B_poo.A_classes_metodos_composicao

import B_poo.B_heranca_polimorfismo_interface.Cliente

open class Conta(
    val titular: Cliente,
    val conta: Int,
    val endereco: Endereco = Endereco()
) {
    open var saldo = 0.0


    /**
     * O Kotlin já implementa por padrão getter and setter. Esse recurso
     * é conhecido como property
     */

    override fun toString(): String {
        return "Conta(titular='$titular', conta=$conta, saldo=$saldo)"
    }

    fun deposita(valor: Double) {

        if (valor > 0.0) this.saldo += valor

    }

    open fun saca(valor: Double) {
        if (valor > 0.0 && this.saldo >= valor) {
            this.saldo -= valor
            println("Contando notas...")
            println("Saque realizado com sucesso")
        }
    }

    fun transfere(contaDestino: Conta, valor: Double) {
        if (valor > 0.0 && this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.deposita(valor);
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Conta

        if (titular != other.titular) return false
        if (conta != other.conta) return false
        if (endereco != other.endereco) return false
        if (saldo != other.saldo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = titular.hashCode()
        result = 31 * result + conta
        result = 31 * result + endereco.hashCode()
        result = 31 * result + saldo.hashCode()
        return result
    }


}