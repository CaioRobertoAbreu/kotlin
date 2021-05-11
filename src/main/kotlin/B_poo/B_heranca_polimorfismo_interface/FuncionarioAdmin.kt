package B_poo.B_heranca_polimorfismo_interface

/**
 * No Kotlin temos que habilitar a herança na classe mãe,
 * para isso bastar adicionarmos "open" antes da palavra "class"
 * para classes e antes do método.
 * No caso, essa é a classe mãe
 */
open class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
): Funcionario(nome, cpf, salario), Autenticavel {

     override fun autentica(senha: String) {
        if(this.senha.equals(senha)){
            println("Seja bem vindx, ${this.nome}")
        } else {
            println("Infelizmente não conseguimos efetuar login. Verifique suas credenciais")
        }
    }


}