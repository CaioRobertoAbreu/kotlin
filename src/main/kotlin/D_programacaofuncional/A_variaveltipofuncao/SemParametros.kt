package D_programacaofuncional.A_variaveltipofuncao

fun main() {

    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao)
    minhaFuncao()

    println()
    val minhaClasse: () -> Unit = Teste()
    println(minhaClasse)
    minhaClasse()

    println()
    val minhaExpressaoLambda = {
        println("Minha expressao Lambda")
    }
    minhaExpressaoLambda()

    println()
    val minhaFuncaoAnonima = fun() {
        println("Miha função anonima")
    }
    minhaFuncaoAnonima()

}

fun teste(): Unit {
    println("Minha primeira variável do tipo função")
}

class Teste() : () -> Unit{

    fun boasVindas() {
        println("Seja bem vindo")
    }

    override fun invoke() {
        println("executando invoke")
    }
}
