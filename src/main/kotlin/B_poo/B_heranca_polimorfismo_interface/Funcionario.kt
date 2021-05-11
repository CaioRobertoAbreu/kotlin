package B_poo.B_heranca_polimorfismo_interface
/**
 * No Kotlin temos que habilitar a herança na classe mãe,
 * para isso bastar adicionarmos "open" antes da palavra "class"
 * para classes e antes do método.
 * No caso, essa é a classe mãe
 */
open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {

    open val bonificacao: Double get() = this.salario * 0.1

    override fun toString(): String {
        return "Funcionario(nome='$nome', cpf='$cpf', salario=$salario, bonificacao=$bonificacao)"
    }


}