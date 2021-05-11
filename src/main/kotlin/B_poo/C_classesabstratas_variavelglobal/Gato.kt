package B_poo.C_classesabstratas_variavelglobal

class Gato(
    nome: String,
    habitat: String,
    alimentacao: String
) : Animal(nome, habitat, alimentacao) {

    override fun getSom(): String = "miau"

}