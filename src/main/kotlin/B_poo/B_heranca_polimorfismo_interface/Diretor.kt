package B_poo.B_heranca_polimorfismo_interface

/**
 * No Kotlin temos que habilitar a herança na classe mãe,
 * para isso bastar adicionarmos "open" antes da palavra "class"
 */

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    val plr: Double
) : FuncionarioAdmin(nome, cpf, salario, senha) {

     override val bonificacao: Double
        get() {
            return super.bonificacao + this.salario + this.plr
        }

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }

}