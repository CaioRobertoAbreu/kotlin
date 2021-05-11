package B_poo.E_objectexpressions_declaration_companion

import B_poo.B_heranca_polimorfismo_interface.Autenticavel

fun main() {

    /**
     * Em Kotlin podemos usar o recurso conhecido como Object Expressions
     * (objetos anônimos)
     */

    val objetoAnonimo = object { //note que é minúsculo
        val nome: String = "Maria"
        val idade: Int = 76
        val cpf: String = "12345678910"

        override fun toString(): String {
            return "(nome: $nome, idade: $idade, cpf: $cpf)"
        }
    }

    println("============================")
    println(" OBJECT EXPRESSIONS         ")
    println("============================")
    println(objetoAnonimo.toString())

    /**
     * Ainda é possível usar herança e interface
     */

    val novoObjeto = object : Autenticavel {

        val nome: String = "Carlos"
        val idade: Int = 33
        val senha: String = "mypass"

        override fun autentica(senha: String) {this.senha}

    }

    println("---------------------------")
    println("Nome: ${novoObjeto.nome}")
    println("Idade: ${novoObjeto.idade}")



}