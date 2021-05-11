package B_poo.B_heranca_polimorfismo_interface

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registraFuncionario(funcionario: Funcionario){
        total += funcionario.bonificacao
    }
}