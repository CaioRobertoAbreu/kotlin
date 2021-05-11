package B_poo.C_classesabstratas_variavelglobal

abstract class Animal(
    val nome: String,
    val habitat: String,
    val alimentacao: String
) {

    abstract fun getSom(): String
}