package B_poo.C_classesabstratas_variavelglobal

class Cachorro(
    nome: String,
    habitat: String,
    alimentacao: String
) : Animal(nome, habitat, alimentacao) {

    override fun getSom(): String = "Au au"
}