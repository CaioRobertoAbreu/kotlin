package D_programacaofuncional.C_scopefunctions

fun main() {

    Dados(logradouro = "Rua das Rosas Vermelhas", complemento = "predio")
        .also { println("Executando o also") } //executa apenas essa linha de codigo
        .apply {
            logradouro = "Rua das Rosas Brancas"; complemento = "casa" //retorna o proprio objeto
        }
        .let(::println) //retorna a lambda

    val numeros = listOf<Int>(1, 2, 4, 8, 16, 32)

    with(numeros) {
        print("A lista contem $size elementos. São eles: ")
        println(this)
    }

    run {
        println("\nExecutanto run sem extensão")
    }
}

data class Dados(
    var logradouro: String,
    var complemento: String
) {

}