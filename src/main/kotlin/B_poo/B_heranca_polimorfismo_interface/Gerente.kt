package B_poo.B_heranca_polimorfismo_interface

/**
 * No Kotlin temos que habilitar a herança na classe mãe,
 * para isso bastar adicionarmos "open" antes da palavra "class",
 * o mesmo vale para os métodos.
 */

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    override val bonificacao: Double = super.bonificacao + this.salario

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }


}