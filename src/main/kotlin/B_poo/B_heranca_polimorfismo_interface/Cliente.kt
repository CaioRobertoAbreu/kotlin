package B_poo.B_heranca_polimorfismo_interface

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: String
) : Autenticavel {

    override fun autentica(senha: String) {
        if (this.senha.equals(senha)) {
            println("Seja bem vindx, ${this.nome}")
        } else {
            println("Infelizmente não conseguimos efetuar login. Verifique suas credenciais")
        }

    }

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', senha='$senha')"
    }


}