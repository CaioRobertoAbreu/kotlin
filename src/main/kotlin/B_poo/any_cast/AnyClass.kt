package B_poo.any_cast

import B_poo.B_heranca_polimorfismo_interface.Funcionario
import B_poo.B_heranca_polimorfismo_interface.Gerente
import java.lang.ClassCastException

fun main() {
    /**
     * @Any é a classe "mãe de todas", é como a classe
     * Object em java
     */

    imprime("Imprimindo texto")
    imprime("Imprimindo numero " + 1)
    imprime("Imprimindo double " + 104.50)
    imprime("Imprimindo boolean " + 104.50)

    /**
     * Cast em Kotli é super simples
     */

    val gerente = Gerente("gil", "12345678910", 9000.0, "senha")
    imprime(gerente)

    /**No entanto, como any é o mais genérico uma exceção ocorrerá
     * se passarmos um valor incompatível. Veja abaixo:
     */

    //Como ainda não vi exceções em kotlin, fiz baseado em java :D
    try {
        imprimeFuncionario("mensagem")
    }catch (e : ClassCastException){
        println("Uma exceção de Cast ocorreu")
    }

}

fun imprime(message: Any) {
    println(message)
}

fun imprimeFuncionario(funcionario: Any) {
    funcionario as Funcionario //Conhecido como smart cast
    println(funcionario)
}