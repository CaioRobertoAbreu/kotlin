package B_poo.B_heranca_polimorfismo_interface

class SistemaInterno {

    fun login(admin: Autenticavel, senha: String){
        admin.autentica(senha)
    }
}