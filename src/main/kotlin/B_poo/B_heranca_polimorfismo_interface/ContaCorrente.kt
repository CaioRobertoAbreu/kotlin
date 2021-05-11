package B_poo.B_heranca_polimorfismo_interface

import B_poo.A_classes_metodos_composicao.Conta

class ContaCorrente(
    titular: Cliente,
    conta: Int
) : Conta(titular, conta) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.5
        super.saca(valorComTaxa)
    }
}