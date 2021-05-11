package B_poo.C_classesabstratas_variavelglobal

var variavelGlobal = "Esta e uma variavel global"

fun main() {

    val gato = Gato(nome = "Robson", habitat = "terrestre", alimentacao = "Mamífero")
    val cachorro = Cachorro(nome = "Doguinho", habitat = "terrestre", alimentacao = "Mamífero")

    println("===============")
    println("    SONS       ")
    println("===============")
    println("Gato: ${gato.getSom()}")
    println("Cachorro: ${cachorro.getSom()}")

    println(variavelGlobal)

}