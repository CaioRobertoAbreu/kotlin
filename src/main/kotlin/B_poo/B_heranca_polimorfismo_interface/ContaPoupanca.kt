package B_poo.B_heranca_polimorfismo_interface

import B_poo.A_classes_metodos_composicao.Conta

class ContaPoupanca(
    titular: Cliente,
    conta: Int,
) : Conta(titular, conta) {

}